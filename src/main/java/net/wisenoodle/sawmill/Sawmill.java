package net.wisenoodle.sawmill;

import net.fabricmc.api.ModInitializer;
import net.wisenoodle.sawmill.block.ModBlocks;
import net.wisenoodle.sawmill.block.entity.ModBlockEntities;
import net.wisenoodle.sawmill.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sawmill implements ModInitializer {
	public static final String MOD_ID = "sawmill";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Moditems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerAllBlockEntities();
	}
}
