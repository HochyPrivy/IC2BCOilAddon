package ru.arseka.ic2bcoiladdon.recipes;

import net.minecraftforge.fluids.FluidStack;
import ru.arseka.ic2bcoiladdon.init.RecipeInit;

public class DistillerRecipe {
	
	public FluidStack input;
	public FluidStack fluidOutput;
	public FluidStack gasOutput;
	public long powerRequired;
	
	public DistillerRecipe(FluidStack input, FluidStack fluidOutput, FluidStack gasOutput, long powerRequired) {
		
		this.input = input;
		this.fluidOutput = fluidOutput;
		this.gasOutput = gasOutput;
		this.powerRequired = powerRequired;
		
		RecipeInit.DISTILLER_RECIPES.add(this);
	}
}
