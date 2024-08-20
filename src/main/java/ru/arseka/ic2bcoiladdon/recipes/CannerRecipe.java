package ru.arseka.ic2bcoiladdon.recipes;

import ic2.api.recipe.IRecipeInputFactory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import ru.arseka.ic2bcoiladdon.init.RecipeInit;

public class CannerRecipe {
	
	public IRecipeInputFactory input = ic2.api.recipe.Recipes.inputFactory;
	
	public FluidStack fluidInput;
	public ItemStack itemInput;
	public FluidStack output;
	
	public CannerRecipe(FluidStack fluidInput, ItemStack itemInput, int itemInputCount, FluidStack output) {
		itemInput.setCount(itemInputCount);	
		
		this.fluidInput = fluidInput;
		this.itemInput = itemInput;
		this.output = output;
		
		RecipeInit.CANNER_RECIPES.add(this);
		
	}
	
}
