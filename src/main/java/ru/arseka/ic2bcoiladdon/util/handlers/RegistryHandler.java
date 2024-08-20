package ru.arseka.ic2bcoiladdon.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import ru.arseka.ic2bcoiladdon.init.BlockInit;
import ru.arseka.ic2bcoiladdon.init.FluidInit;
import ru.arseka.ic2bcoiladdon.init.RecipeInit;
import ru.arseka.ic2bcoiladdon.util.IHasModel;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Block block : BlockInit.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event) {
		FluidInit.registerFluids();
		
		RenderHandler.registerCustomMeshesAndStates();
	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event) { 
		RecipeInit.registerRecipes();
	}
}
