package ru.arseka.ic2bcoiladdon.objects.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import ru.arseka.ic2bcoiladdon.Main;

public class FluidLiquid extends Fluid {
	
	public FluidLiquid(String name, ResourceLocation still, ResourceLocation flow, int viscosity) {
		 super(name,still,flow);
		 this.setUnlocalizedName(name);
		 this.setViscosity(viscosity);
	}
}
