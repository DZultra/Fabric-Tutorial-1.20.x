package net.dzultra.tutorialmod;

import net.dzultra.tutorialmod.block.ModBlocks;
import net.dzultra.tutorialmod.item.ModItems;
import net.dzultra.tutorialmod.item.ModItemsGroups;
import net.dzultra.tutorialmod.util.ModCustomTrades;
import net.dzultra.tutorialmod.util.ModLootTableModifiers;
import net.dzultra.tutorialmod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModCustomTrades.registerCustomTrades();
		ModLootTableModifiers.modifyLootTables();

		ModVillagers.registerVillagers();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
	}
}