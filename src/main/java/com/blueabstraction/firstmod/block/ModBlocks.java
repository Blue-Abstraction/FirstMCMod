package com.blueabstraction.firstmod.block;

import com.blueabstraction.firstmod.FirstMod;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);
	//public static final RegistryObject<Block> poopBlock = BLOCKS.register("Block of Poop", () -> new Block(new Block().properties()));
	
}
