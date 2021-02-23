package io.github.fcodi.unused_potions;

import net.minecraft.potion.Potion;

public class HastePotion extends Potion {

	public static final String NAME = "haste_potion";

	public HastePotion() {
		super(NAME, new HasteEffectInstance());
	}
}
