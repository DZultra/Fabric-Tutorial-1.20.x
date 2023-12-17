package net.dzultra.tutorialmod.effect;

import net.dzultra.tutorialmod.TutorialMod;
import net.dzultra.tutorialmod.effect.custom.ExpStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect EXP = new ExpStatusEffect();

    public static void registerModEffects() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(TutorialMod.MOD_ID, "exp"), EXP);
    }
}
