package theoldone822.MoreFusionFurnaces;

import java.io.File;
import java.util.Arrays;

import SimpleOres.core.Settings;
import SimpleOres.plugins.fusion.Content;
import theoldone822.MoreFusionFurnaces.Furnaces.MythrilFusionFurnace;
import theoldone822.MoreFusionFurnaces.Furnaces.MythrilFusionFurnaceTileEntity;
import theoldone822.MoreFusionFurnaces.Furnaces.OnyxFusionFurnace;
import theoldone822.MoreFusionFurnaces.Furnaces.OnyxFusionFurnaceTileEntity;
import net.minecraft.block.Block;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = "morefusionfurnaces", name = "More Fusion Furnaces", version = "1.0", dependencies = "required-after:simpleores; required-after:simpleoresfusion")
public class MoreFusionFurnaces {
	@SidedProxy(clientSide = "theoldone822.MoreFusionFurnaces.ProxyClient", serverSide = "theoldone822.MoreFusionFurnaces.ProxyCommon")	
	public static ProxyCommon proxy;

	public static Block mythrilFusionFurnace;
	public static Block mythrilFusionFurnaceOn;
	public static Block onyxFusionFurnace;
	public static Block onyxFusionFurnaceOn;
	public static int mythrilFusionFurnaceID;
	public static int mythrilFusionFurnaceOnID;	
	public static int onyxFusionFurnaceID;
	public static int onyxFusionFurnaceOnID;	

	public static Configuration config;

	@Instance("MoreFusionFurnaces")
	public static MoreFusionFurnaces instance = new MoreFusionFurnaces();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModMetadata metadata = event.getModMetadata();
		metadata.autogenerated = false;

		metadata.authorList = Arrays.asList("theoldone822");
		metadata.description = "Adds Mithril and Onyx Fusion Furnaces.";
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		mythrilFusionFurnaceID = config.getBlock("Blocks", "Mythril Fusion Furnace", 485).getInt();
		mythrilFusionFurnaceOnID = config.getBlock("Blocks", "Mythril Fusion Furnace On", 486).getInt();
		onyxFusionFurnaceID = config.getBlock("Blocks", "Onyx Fusion Furnace", 487).getInt();
		onyxFusionFurnaceOnID = config.getBlock("Blocks", "Onyx Fusion Furnace On", 488).getInt();
		
		mythrilFusionFurnace = new MythrilFusionFurnace(mythrilFusionFurnaceID, false).setHardness(Settings.mythrilFurnaceHardness).setResistance(Settings.mythrilFurnaceResistance).setUnlocalizedName("morefusionfurnaces:mythrilFusionFurnace");
		mythrilFusionFurnaceOn = new MythrilFusionFurnace(mythrilFusionFurnaceOnID, true).setHardness(Settings.mythrilFurnaceHardness).setResistance(Settings.mythrilFurnaceResistance).setLightValue(Settings.mythrilFurnaceLightValue).setUnlocalizedName("morefusionfurnaces:mythrilFusionFurnaceOn");
		onyxFusionFurnace = new OnyxFusionFurnace(onyxFusionFurnaceID, false).setHardness(Settings.onyxFurnaceHardness).setResistance(Settings.onyxFurnaceResistance).setUnlocalizedName("morefusionfurnaces:onyxFusionFurnace");
		onyxFusionFurnaceOn = new OnyxFusionFurnace(onyxFusionFurnaceOnID, true).setHardness(Settings.onyxFurnaceHardness).setResistance(Settings.onyxFurnaceResistance).setLightValue(Settings.onyxFurnaceLightValue).setUnlocalizedName("morefusionfurnaces:onyxFusionFurnaceOn");

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(mythrilFusionFurnace, true, new Object[]{
				"XXX", "XYX", "XXX", Character.valueOf('X'), "ingotMythril", Character.valueOf('Y'), Content.fusionFurnace}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(onyxFusionFurnace, true, new Object[]{
				"XXX", "XYX", "XXX", Character.valueOf('X'), "gemOnyx", Character.valueOf('Y'), Content.fusionFurnace}));
		
		GameRegistry.registerBlock(mythrilFusionFurnace, "mythrilFusionFurnace");
		GameRegistry.registerBlock(mythrilFusionFurnaceOn, "mythrilFusionFurnaceOn");
		GameRegistry.registerBlock(onyxFusionFurnace, "onyxFusionFurnace");
		GameRegistry.registerBlock(onyxFusionFurnaceOn, "onyxFusionFurnaceOn");

		LanguageRegistry.addName(mythrilFusionFurnace, "Mythril Fusion Furnace");
		LanguageRegistry.addName(mythrilFusionFurnaceOn, "Mythril Fusion Furnace");
		LanguageRegistry.addName(onyxFusionFurnace, "Onyx Fusion Furnace");
		LanguageRegistry.addName(onyxFusionFurnaceOn, "Onyx Fusion Furnace");

	}

	@Init
	public void InitiateMoreFusionFurnaces(FMLInitializationEvent initEvent) {
		instance = this;
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
		GameRegistry.registerTileEntity(MythrilFusionFurnaceTileEntity.class, "mythrilFusionFurnace");
		GameRegistry.registerTileEntity(OnyxFusionFurnaceTileEntity.class, "onyxFusionFurnace");

		config.save();
	}

}
