package theoldone822.FusionItemGenerator;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import SimpleOres.core.Items;
import SimpleOres.plugins.fusion.Content;
import SimpleOres.plugins.fusion.FusionRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = "fusionitemgenerator", name = "Fusion Item Generator", version = "1.0", dependencies = "required-after:simpleores; required-after:simpleoresfusion")

public class FusionItemGenerator {

	@Instance("fusionitemgenerator")
	public static FusionItemGenerator instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
    	FusionRecipes.smelting().addSmelting(new ItemStack(Item.bucketWater, 0, 0), new ItemStack(Item.bucketLava, 0, 0), new ItemStack(Block.cobblestone, 0, 0), new ItemStack(Block.cobblestone, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Items.copperBucketWater, 0, 0), new ItemStack(Item.bucketLava, 0, 0), new ItemStack(Block.cobblestone, 0, 0), new ItemStack(Block.cobblestone, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Item.bucketWater, 0, 0), new ItemStack(Block.dirt, 0, 0), new ItemStack(Item.seeds, 0, 0), new ItemStack(Item.wheat, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Item.bucketWater, 0, 0), new ItemStack(Block.dirt, 0, 0), new ItemStack(Item.pumpkinSeeds, 0, 0), new ItemStack(Block.pumpkin, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Item.bucketWater, 0, 0), new ItemStack(Block.dirt, 0, 0), new ItemStack(Item.melonSeeds, 0, 0), new ItemStack(Item.melon, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Items.copperBucketWater, 0, 0), new ItemStack(Block.dirt, 0, 0), new ItemStack(Item.seeds, 0, 0), new ItemStack(Item.wheat, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Items.copperBucketWater, 0, 0), new ItemStack(Block.dirt, 0, 0), new ItemStack(Item.pumpkinSeeds, 0, 0), new ItemStack(Block.pumpkin, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Items.copperBucketWater, 0, 0), new ItemStack(Block.dirt, 0, 0), new ItemStack(Item.melonSeeds, 0, 0), new ItemStack(Item.melon, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Block.sapling, 0, 0), new ItemStack(Block.sapling, 0, 0), new ItemStack(Item.appleRed, 0, 0), new ItemStack(Item.appleRed, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Block.sapling, 0, 0), new ItemStack(Block.sapling, 0, 0), new ItemStack(Block.sapling, 0, 0), new ItemStack(Block.wood, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Block.sapling, 0, 1), new ItemStack(Block.sapling, 0, 1), new ItemStack(Block.sapling, 0, 1), new ItemStack(Block.wood, 1, 1), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Block.sapling, 0, 2), new ItemStack(Block.sapling, 0, 2), new ItemStack(Block.sapling, 0, 2), new ItemStack(Block.wood, 1, 2), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Block.sapling, 0, 3), new ItemStack(Block.sapling, 0, 3), new ItemStack(Block.sapling, 0, 3), new ItemStack(Block.wood, 1, 3), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Item.egg, 0, 0), new ItemStack(Item.egg, 0, 0), new ItemStack(Item.egg, 0, 0), new ItemStack(Item.egg, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Item.egg, 0, 0), new ItemStack(Item.egg, 0, 0), new ItemStack(Item.chickenRaw, 0, 0), new ItemStack(Item.chickenRaw, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Item.egg, 0, 0), new ItemStack(Item.egg, 0, 0), new ItemStack(Item.feather, 0, 0), new ItemStack(Item.feather, 1, 0), 0.0F);
       	FusionRecipes.smelting().addSmelting(new ItemStack(Item.netherStar, 0, 0), new ItemStack(Item.netherStar, 0, 0), new ItemStack(Item.netherStar, 0, 0), new ItemStack(Item.netherStar, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Item.expBottle, 0, 0), new ItemStack(Item.bucketLava, 0, 0), new ItemStack(Item.ingotIron, 0, 0), new ItemStack(Item.ingotIron, 1, 0), 0.0F);
    	FusionRecipes.smelting().addSmelting(new ItemStack(Item.expBottle, 0, 0), new ItemStack(Item.bucketLava, 0, 0), new ItemStack(Block.plantRed, 0, 0), new ItemStack(Block.plantRed, 1, 0), 0.0F);
      	}
}
