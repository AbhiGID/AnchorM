package com.opanchor.client;

import net.fabricmc.api.ClientModInitializer;

public class OpAnchorClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		OpAnchorClientEvents.init();
	}
}
