package net.miner.minermod;

import net.fabricmc.api.ModInitializer;

import net.miner.minermod.block.ModBlocks;
import net.miner.minermod.item.ModItemGroups;
import net.miner.minermod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinerMod implements ModInitializer {
	public static final String MOD_ID = "minermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}