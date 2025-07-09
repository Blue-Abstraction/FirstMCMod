package com.blueabstraction.firstmod.item;

import com.blueabstraction.firstmod.FirstMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

	public static final RegistryObject<Item> POOP = ITEMS.register("poop", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> EMOJI = ITEMS.register("emoji", () -> new Item(new Item.Properties()));

	public static void register(IEventBus e) {
		ITEMS.register(e);
	}
	
	
	
}
