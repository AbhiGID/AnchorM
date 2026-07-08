package com.opanchor;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpAnchor implements ModInitializer {
	public static final String MOD_ID = "opanchor";
	public static final Logger LOGGER = LoggerFactory.getLogger("OpAnchor");

	@Override
	public void onInitialize() {
		LOGGER.info("OpAnchor mod initialized for Fabric!");
	}
}
