package ru.arseka.ic2bcoiladdon.util.handlers;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import ru.arseka.ic2bcoiladdon.init.BlockInit;

public class RenderHandler {
	public static void registerCustomMeshesAndStates() {
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(BlockInit.SULFURIC_ACID_BLOCK), new ItemMeshDefinition() 
		{
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				// TODO Auto-generated method stub
				return new ModelResourceLocation("ic2bcoiladdon:sulfuric_acid","fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(BlockInit.SULFURIC_ACID_BLOCK, new StateMapperBase() 
		{

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				// TODO Auto-generated method stub
				return new ModelResourceLocation("ic2bcoiladdon:sulfuric_acid","fluid");
			}
		});
	}
}
