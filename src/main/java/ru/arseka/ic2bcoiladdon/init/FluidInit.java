package ru.arseka.ic2bcoiladdon.init;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import ru.arseka.ic2bcoiladdon.objects.fluids.FluidLiquid;

public class FluidInit {
	public static final Fluid SULFURIC_ACID_FLUID = new FluidLiquid("sulfuric_acid", new ResourceLocation("ic2bcoiladdon:blocks/fluids/sulfuric_acid_still"), new ResourceLocation("ic2bcoiladdon:blocks/fluids/sulfuric_acid_flow"),1835);
	
	public static void registerFluids() {
		registerFluid(SULFURIC_ACID_FLUID);
	}
	
	public static void registerFluid(Fluid fluid) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
