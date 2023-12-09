package net.dzultra.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,40, 1), 0.25f).build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,40), 0.25f).build();
}
