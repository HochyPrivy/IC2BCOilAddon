package ru.arseka.ic2bcoiladdon.init;

import java.util.ArrayList;
import java.util.List;

import buildcraft.api.recipes.BuildcraftRecipeRegistry;
import ic2.api.item.IC2Items;
import ic2.api.recipe.ICannerEnrichRecipeManager.Input;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import ru.arseka.ic2bcoiladdon.recipes.CannerRecipe;
import ru.arseka.ic2bcoiladdon.recipes.DistillerRecipe;

public class RecipeInit {
	public static final List<DistillerRecipe> DISTILLER_RECIPES = new ArrayList<DistillerRecipe>();
	public static final List<CannerRecipe> CANNER_RECIPES = new ArrayList<CannerRecipe>();
	
	//Distiller Recipes
	public static final DistillerRecipe fuelToLava = new DistillerRecipe(new FluidStack(FluidRegistry.getFluid("fuel_light"),10), new FluidStack(FluidRegistry.LAVA,10), new FluidStack(FluidRegistry.getFluid("fuel_gaseous"),10), 1);
	
	//Canner Recipes
	public static final CannerRecipe waterToSulfuricAcid = new CannerRecipe(new FluidStack(FluidRegistry.WATER,1000), IC2Items.getItem("dust","sulfur"),16,new FluidStack(FluidInit.SULFURIC_ACID_FLUID,1000));
	
	
	
	public static void registerRecipes() {
		for(DistillerRecipe dr : DISTILLER_RECIPES) {
			BuildcraftRecipeRegistry.refineryRecipes.addDistillationRecipe(dr.input, dr.gasOutput, dr.fluidOutput, dr.powerRequired);
		}
		for(CannerRecipe cr : CANNER_RECIPES) {
			ic2.api.recipe.Recipes.cannerEnrich.addRecipe(new Input(cr.fluidInput,cr.input.forStack(cr.itemInput)), cr.output, (NBTTagCompound)null, false);
		}
	}
}
