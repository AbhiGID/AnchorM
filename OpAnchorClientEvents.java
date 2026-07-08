package com.opanchor.client;

import com.opanchor.OpAnchor;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import org.lwjgl.glfw.GLFW;

public class OpAnchorClientEvents {
	private static KeyBinding zKeyBinding;
	private static boolean lastZState = false;

	public static void init() {
		// Register Z key binding
		zKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
			"key.opanchor.anchor",
			InputUtil.Type.KEYSYM,
			GLFW.GLFW_KEY_Z,
			"category.opanchor"
		));

		// Register client tick event
		ClientTickEvents.END_CLIENT_TICK.register(client -> onClientTick(client));
	}

	private static void onClientTick(MinecraftClient client) {
		if (client.player == null) {
			return;
		}

		boolean isZPressed = zKeyBinding.isPressed();

		// Trigger only on key press (transition from false to true)
		if (isZPressed && !lastZState) {
			performAnchorSequence(client);
		}

		lastZState = isZPressed;
	}

	private static void performAnchorSequence(MinecraftClient client) {
		PlayerEntity player = client.player;
		if (player == null) {
			return;
		}

		// Hotbar slots (0-indexed, so 9 = index 8, 8 = index 7)
		int HOTBAR_9 = 8;
		int HOTBAR_8 = 7;
		long MAX_DELAY = 1; // 1ms

		// Switch to hotbar slot 9 and right click
		switchSlotAndClick(client, player, HOTBAR_9);
		delayMs(MAX_DELAY);

		// Switch to hotbar slot 8 and right click
		switchSlotAndClick(client, player, HOTBAR_8);
		delayMs(MAX_DELAY);

		// Switch back to hotbar slot 9 and right click
		switchSlotAndClick(client, player, HOTBAR_9);

		OpAnchor.LOGGER.info("OpAnchor sequence executed!");
	}

	private static void switchSlotAndClick(MinecraftClient client, PlayerEntity player, int slot) {
		// Switch to the specified hotbar slot
		player.getInventory().selectedSlot = slot;

		// Simulate right click (use item)
		if (client.interactionManager != null) {
			client.interactionManager.interactItem(player, net.minecraft.util.Hand.MAIN_HAND);
		}
	}

	private static void delayMs(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
