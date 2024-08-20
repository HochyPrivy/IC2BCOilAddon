package ru.arseka.ic2bcoiladdon.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.arseka.ic2bcoiladdon.objects.blocks.BlockFluid;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SULFURIC_ACID_BLOCK = new BlockFluid("sulfuric_acid", FluidInit.SULFURIC_ACID_FLUID, Material.WATER);
}
