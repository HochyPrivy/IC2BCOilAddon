package ru.arseka.ic2bcoiladdon;

import org.apache.logging.log4j.Logger;

import ru.arseka.ic2bcoiladdon.proxy.CommonProxy;
import ru.arseka.ic2bcoiladdon.util.Reference;
import ru.arseka.ic2bcoiladdon.util.handlers.RegistryHandler;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Main {
	
	public static Logger log;
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	static { FluidRegistry.enableUniversalBucket(); }
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent ev) {
		log = ev.getModLog();
		RegistryHandler.preInitRegistries(ev);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent ev) {
		log.info("Mod is " + Reference.ACTIVATED);
	}
	
	@EventHandler
	public void postLoad(FMLPostInitializationEvent ev) {
		RegistryHandler.postInitRegistries(ev);
	}
}
