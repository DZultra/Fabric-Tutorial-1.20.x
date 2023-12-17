package net.dzultra.tutorialmod;

import net.dzultra.tutorialmod.block.ModBlocks;
import net.dzultra.tutorialmod.block.entity.ModBlockEntities;
import net.dzultra.tutorialmod.effect.ModEffects;
import net.dzultra.tutorialmod.entity.ModEntities;
import net.dzultra.tutorialmod.entity.custom.PorcupineEntity;
import net.dzultra.tutorialmod.item.ModItems;
import net.dzultra.tutorialmod.item.ModItemsGroups;
import net.dzultra.tutorialmod.screen.ModScreenHandlers;
import net.dzultra.tutorialmod.util.ModCustomTrades;
import net.dzultra.tutorialmod.util.ModLootTableModifiers;
import net.dzultra.tutorialmod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
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

		ModEffects.registerModEffects();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
	}
}