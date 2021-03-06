package exaliquo;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import static net.minecraftforge.fluids.FluidRegistry.getFluid;
import net.minecraftforge.fluids.FluidStack;

import tconstruct.TConstruct;
import tconstruct.library.crafting.Smeltery;
import exnihilo.registries.CrucibleRegistry;

import static exaliquo.ModIDs.getIDs;
import static exaliquo.ModIDs.getItem;
import static exaliquo.ModIDs.getBlock;
import exaliquo.ModIDs.Info;

public class MoltenMetals {
	
	public static final int ingotcostSmeltery = TConstruct.ingotLiquidValue * (Configurations.isOre?2:1);
	public static final int ingotcostCrucible = TConstruct.ingotLiquidValue;
	public static final int dustvalue = (Configurations.dustValue?4:6);
	public static final String exnihilo = "crowley.skyblock";
	
	public static void addToSmelting()
	{
		Smeltery.addMelting(getBlock(Info.ironore), 0, 600, new FluidStack(getFluid("iron.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.ironore), 1, 600, new FluidStack(getFluid("iron.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.ironore), 2, 600, new FluidStack(getFluid("iron.molten"), ingotcostSmeltery));
		
		Smeltery.addMelting(getBlock(Info.goldore), 0, 400, new FluidStack(getFluid("gold.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.goldore), 1, 400, new FluidStack(getFluid("gold.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.goldore), 2, 400, new FluidStack(getFluid("gold.molten"), ingotcostSmeltery));
		
		Smeltery.addMelting(getBlock(Info.copperore), 0, 550, new FluidStack(getFluid("copper.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.copperore), 1, 550, new FluidStack(getFluid("copper.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.copperore), 2, 550, new FluidStack(getFluid("copper.molten"), ingotcostSmeltery));
		
		Smeltery.addMelting(getBlock(Info.tinore), 0, 400, new FluidStack(getFluid("tin.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.tinore), 1, 400, new FluidStack(getFluid("tin.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.tinore), 2, 400, new FluidStack(getFluid("tin.molten"), ingotcostSmeltery));
		
		Smeltery.addMelting(getBlock(Info.silverore), 0, 400, new FluidStack(getFluid("silver.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.silverore), 1, 400, new FluidStack(getFluid("silver.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.silverore), 2, 400, new FluidStack(getFluid("silver.molten"), ingotcostSmeltery));
		
		Smeltery.addMelting(getBlock(Info.leadore), 0, 400, new FluidStack(getFluid("lead.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.leadore), 1, 400, new FluidStack(getFluid("lead.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.leadore), 2, 400, new FluidStack(getFluid("lead.molten"), ingotcostSmeltery));
		
		Smeltery.addMelting(getBlock(Info.nickelore), 0, 400, new FluidStack(getFluid("nickel.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.nickelore), 1, 400, new FluidStack(getFluid("nickel.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.nickelore), 2, 400, new FluidStack(getFluid("nickel.molten"), ingotcostSmeltery));
		
		Smeltery.addMelting(getBlock(Info.platinumore), 0, 400, new FluidStack(getFluid("platinum.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.platinumore), 1, 400, new FluidStack(getFluid("platinum.molten"), ingotcostSmeltery));
		Smeltery.addMelting(getBlock(Info.platinumore), 2, 400, new FluidStack(getFluid("platinum.molten"), ingotcostSmeltery));
		
		//if (getBlock(Info.aluminumore) != null)
		//{
			Smeltery.addMelting(getBlock(Info.aluminumore), 0, 400, new FluidStack(getFluid("aluminum.molten"), ingotcostSmeltery));
			Smeltery.addMelting(getBlock(Info.aluminumore), 1, 400, new FluidStack(getFluid("aluminum.molten"), ingotcostSmeltery));
			Smeltery.addMelting(getBlock(Info.aluminumore), 2, 400, new FluidStack(getFluid("aluminum.molten"), ingotcostSmeltery));
		//}
		if (Configurations.miniSmelting)
		{
			CrucibleRegistry.register(getIDs(Info.ironore), 0, ingotcostCrucible*2, getFluid("iron.molten"), ingotcostCrucible, getBlock(Info.ironore));
			CrucibleRegistry.register(getIDs(Info.ironore), 1, ingotcostCrucible*2, getFluid("iron.molten"), ingotcostCrucible, getBlock(Info.ironore));
			CrucibleRegistry.register(getIDs(Info.ironore), 2, ingotcostCrucible*2, getFluid("iron.molten"), ingotcostCrucible, getBlock(Info.ironore));
			
			CrucibleRegistry.register(getIDs(Info.goldore), 0, ingotcostCrucible*2, getFluid("gold.molten"), ingotcostCrucible, getBlock(Info.goldore));
			CrucibleRegistry.register(getIDs(Info.goldore), 1, ingotcostCrucible*2, getFluid("gold.molten"), ingotcostCrucible, getBlock(Info.goldore));
			CrucibleRegistry.register(getIDs(Info.goldore), 2, ingotcostCrucible*2, getFluid("gold.molten"), ingotcostCrucible, getBlock(Info.goldore));
			
			CrucibleRegistry.register(getIDs(Info.copperore), 0, ingotcostCrucible*2, getFluid("copper.molten"), ingotcostCrucible, getBlock(Info.copperore));
			CrucibleRegistry.register(getIDs(Info.copperore), 1, ingotcostCrucible*2, getFluid("copper.molten"), ingotcostCrucible, getBlock(Info.copperore));
			CrucibleRegistry.register(getIDs(Info.copperore), 2, ingotcostCrucible*2, getFluid("copper.molten"), ingotcostCrucible, getBlock(Info.copperore));
			
			CrucibleRegistry.register(getIDs(Info.tinore), 0, ingotcostCrucible*2, getFluid("tin.molten"), ingotcostCrucible, getBlock(Info.tinore));
			CrucibleRegistry.register(getIDs(Info.tinore), 1, ingotcostCrucible*2, getFluid("tin.molten"), ingotcostCrucible, getBlock(Info.tinore));
			CrucibleRegistry.register(getIDs(Info.tinore), 2, ingotcostCrucible*2, getFluid("tin.molten"), ingotcostCrucible, getBlock(Info.tinore));
			
			CrucibleRegistry.register(getIDs(Info.silverore), 0, ingotcostCrucible*2, getFluid("silver.molten"), ingotcostCrucible, getBlock(Info.silverore));
			CrucibleRegistry.register(getIDs(Info.silverore), 1, ingotcostCrucible*2, getFluid("silver.molten"), ingotcostCrucible, getBlock(Info.silverore));
			CrucibleRegistry.register(getIDs(Info.silverore), 2, ingotcostCrucible*2, getFluid("silver.molten"), ingotcostCrucible, getBlock(Info.silverore));
			
			CrucibleRegistry.register(getIDs(Info.leadore), 0, ingotcostCrucible*2, getFluid("lead.molten"), ingotcostCrucible, getBlock(Info.leadore));
			CrucibleRegistry.register(getIDs(Info.leadore), 1, ingotcostCrucible*2, getFluid("lead.molten"), ingotcostCrucible, getBlock(Info.leadore));
			CrucibleRegistry.register(getIDs(Info.leadore), 2, ingotcostCrucible*2, getFluid("lead.molten"), ingotcostCrucible, getBlock(Info.leadore));
			
			CrucibleRegistry.register(getIDs(Info.nickelore), 0, ingotcostCrucible*2, getFluid("nickel.molten"), ingotcostCrucible, getBlock(Info.nickelore));
			CrucibleRegistry.register(getIDs(Info.nickelore), 1, ingotcostCrucible*2, getFluid("nickel.molten"), ingotcostCrucible, getBlock(Info.nickelore));
			CrucibleRegistry.register(getIDs(Info.nickelore), 2, ingotcostCrucible*2, getFluid("nickel.molten"), ingotcostCrucible, getBlock(Info.nickelore));
			
			CrucibleRegistry.register(getIDs(Info.platinumore), 0, ingotcostCrucible*2, getFluid("platinum.molten"), ingotcostCrucible, getBlock(Info.platinumore));
			CrucibleRegistry.register(getIDs(Info.platinumore), 1, ingotcostCrucible*2, getFluid("platinum.molten"), ingotcostCrucible, getBlock(Info.platinumore));
			CrucibleRegistry.register(getIDs(Info.platinumore), 2, ingotcostCrucible*2, getFluid("platinum.molten"), ingotcostCrucible, getBlock(Info.platinumore));
			
			//if (getBlock(Info.aluminumore) != null)
			//{
				CrucibleRegistry.register(getIDs(Info.aluminumore), 0, ingotcostCrucible*2, getFluid("aluminum.molten"), ingotcostCrucible, getBlock(Info.aluminumore));
				CrucibleRegistry.register(getIDs(Info.aluminumore), 1, ingotcostCrucible*2, getFluid("aluminum.molten"), ingotcostCrucible, getBlock(Info.aluminumore));
				CrucibleRegistry.register(getIDs(Info.aluminumore), 2, ingotcostCrucible*2, getFluid("aluminum.molten"), ingotcostCrucible, getBlock(Info.aluminumore));
			//}
		}
		if (Configurations.allowDustSmelting)
		{
			Smeltery.addMelting(new ItemStack(getItem(Info.irongrav),4,0), getIDs(Info.ironore), 0, 600, new FluidStack(getFluid("iron.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.ironsand),4,0), getIDs(Info.ironore), 1, 600, new FluidStack(getFluid("iron.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.irondust),4,0), getIDs(Info.ironore), 2, 600, new FluidStack(getFluid("iron.molten"), ingotcostSmeltery/dustvalue));
			
			Smeltery.addMelting(new ItemStack(getItem(Info.goldgrav),4,0), getIDs(Info.goldore), 0, 400, new FluidStack(getFluid("gold.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.goldsand),4,0), getIDs(Info.goldore), 1, 400, new FluidStack(getFluid("gold.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.golddust),4,0), getIDs(Info.goldore), 2, 400, new FluidStack(getFluid("gold.molten"), ingotcostSmeltery/dustvalue));
			
			Smeltery.addMelting(new ItemStack(getItem(Info.coppergrav),4,0), getIDs(Info.copperore), 0, 550, new FluidStack(getFluid("copper.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.coppersand),4,0), getIDs(Info.copperore), 1, 550, new FluidStack(getFluid("copper.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.copperdust),4,0), getIDs(Info.copperore), 2, 550, new FluidStack(getFluid("copper.molten"), ingotcostSmeltery/dustvalue));
			
			Smeltery.addMelting(new ItemStack(getItem(Info.tingrav),4,0), getIDs(Info.tinore), 0, 400, new FluidStack(getFluid("tin.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.tinsand),4,0), getIDs(Info.tinore), 1, 400, new FluidStack(getFluid("tin.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.tindust),4,0), getIDs(Info.tinore), 2, 400, new FluidStack(getFluid("tin.molten"), ingotcostSmeltery/dustvalue));
			
			Smeltery.addMelting(new ItemStack(getItem(Info.silvergrav),4,0), getIDs(Info.silverore), 0, 400, new FluidStack(getFluid("silver.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.silversand),4,0), getIDs(Info.silverore), 1, 400, new FluidStack(getFluid("silver.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.silverdust),4,0), getIDs(Info.silverore), 2, 400, new FluidStack(getFluid("silver.molten"), ingotcostSmeltery/dustvalue));
			
			Smeltery.addMelting(new ItemStack(getItem(Info.leadgrav),4,0), getIDs(Info.leadore), 0, 400, new FluidStack(getFluid("lead.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.leadsand),4,0), getIDs(Info.leadore), 1, 400, new FluidStack(getFluid("lead.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.leaddust),4,0), getIDs(Info.leadore), 2, 400, new FluidStack(getFluid("lead.molten"), ingotcostSmeltery/dustvalue));
			
			Smeltery.addMelting(new ItemStack(getItem(Info.nickelgrav),4,0), getIDs(Info.nickelore), 0, 400, new FluidStack(getFluid("nickel.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.nickelsand),4,0), getIDs(Info.nickelore), 1, 400, new FluidStack(getFluid("nickel.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.nickeldust),4,0), getIDs(Info.nickelore), 2, 400, new FluidStack(getFluid("nickel.molten"), ingotcostSmeltery/dustvalue));
			
			Smeltery.addMelting(new ItemStack(getItem(Info.platinumgrav),4,0), getIDs(Info.platinumore), 0, 400, new FluidStack(getFluid("platinum.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.platinumsand),4,0), getIDs(Info.platinumore), 1, 400, new FluidStack(getFluid("platinum.molten"), ingotcostSmeltery/dustvalue));
			Smeltery.addMelting(new ItemStack(getItem(Info.platinumdust),4,0), getIDs(Info.platinumore), 2, 400, new FluidStack(getFluid("platinum.molten"), ingotcostSmeltery/dustvalue));
			
			//if (getBlock(Info.aluminumore) != null)
			//{
				Smeltery.addMelting(new ItemStack(getItem(Info.aluminumgrav),4,0), getIDs(Info.aluminumore), 0, 400, new FluidStack(getFluid("aluminum.molten"), ingotcostSmeltery/dustvalue));
				Smeltery.addMelting(new ItemStack(getItem(Info.aluminumsand),4,0), getIDs(Info.aluminumore), 1, 400, new FluidStack(getFluid("aluminum.molten"), ingotcostSmeltery/dustvalue));
				Smeltery.addMelting(new ItemStack(getItem(Info.aluminumdust),4,0), getIDs(Info.aluminumore), 2, 400, new FluidStack(getFluid("aluminum.molten"), ingotcostSmeltery/dustvalue));
			//}
			
			CrucibleRegistry.register(getItem(Info.irongrav).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("iron.molten"), ingotcostCrucible/dustvalue, getBlock(Info.ironore));
			CrucibleRegistry.register(getItem(Info.ironsand).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("iron.molten"), ingotcostCrucible/dustvalue, getBlock(Info.ironore));
			CrucibleRegistry.register(getItem(Info.irondust).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("iron.molten"), ingotcostCrucible/dustvalue, getBlock(Info.ironore));
			
			CrucibleRegistry.register(getItem(Info.goldgrav).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("gold.molten"), ingotcostCrucible/dustvalue, getBlock(Info.goldore));
			CrucibleRegistry.register(getItem(Info.goldsand).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("gold.molten"), ingotcostCrucible/dustvalue, getBlock(Info.goldore));
			CrucibleRegistry.register(getItem(Info.golddust).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("gold.molten"), ingotcostCrucible/dustvalue, getBlock(Info.goldore));
			
			CrucibleRegistry.register(getItem(Info.coppergrav).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("copper.molten"), ingotcostCrucible/dustvalue, getBlock(Info.copperore));
			CrucibleRegistry.register(getItem(Info.coppersand).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("copper.molten"), ingotcostCrucible/dustvalue, getBlock(Info.copperore));
			CrucibleRegistry.register(getItem(Info.copperdust).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("copper.molten"), ingotcostCrucible/dustvalue, getBlock(Info.copperore));
			
			CrucibleRegistry.register(getItem(Info.tingrav).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("tin.molten"), ingotcostCrucible/dustvalue, getBlock(Info.tinore));
			CrucibleRegistry.register(getItem(Info.tinsand).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("tin.molten"), ingotcostCrucible/dustvalue, getBlock(Info.tinore));
			CrucibleRegistry.register(getItem(Info.tindust).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("tin.molten"), ingotcostCrucible/dustvalue, getBlock(Info.tinore));
			
			CrucibleRegistry.register(getItem(Info.silvergrav).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("silver.molten"), ingotcostCrucible/dustvalue, getBlock(Info.silverore));
			CrucibleRegistry.register(getItem(Info.silversand).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("silver.molten"), ingotcostCrucible/dustvalue, getBlock(Info.silverore));
			CrucibleRegistry.register(getItem(Info.silverdust).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("silver.molten"), ingotcostCrucible/dustvalue, getBlock(Info.silverore));
			
			CrucibleRegistry.register(getItem(Info.leadgrav).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("lead.molten"), ingotcostCrucible/dustvalue, getBlock(Info.leadore));
			CrucibleRegistry.register(getItem(Info.leadsand).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("lead.molten"), ingotcostCrucible/dustvalue, getBlock(Info.leadore));
			CrucibleRegistry.register(getItem(Info.leaddust).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("lead.molten"), ingotcostCrucible/dustvalue, getBlock(Info.leadore));
			
			CrucibleRegistry.register(getItem(Info.nickelgrav).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("nickel.molten"), ingotcostCrucible/dustvalue, getBlock(Info.nickelore));
			CrucibleRegistry.register(getItem(Info.nickelsand).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("nickel.molten"), ingotcostCrucible/dustvalue, getBlock(Info.nickelore));
			CrucibleRegistry.register(getItem(Info.nickeldust).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("nickel.molten"), ingotcostCrucible/dustvalue, getBlock(Info.nickelore));
			
			CrucibleRegistry.register(getItem(Info.platinumgrav).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("platinum.molten"), ingotcostCrucible/dustvalue, getBlock(Info.platinumore));
			CrucibleRegistry.register(getItem(Info.platinumsand).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("platinum.molten"), ingotcostCrucible/dustvalue, getBlock(Info.platinumore));
			CrucibleRegistry.register(getItem(Info.platinumdust).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("platinum.molten"), ingotcostCrucible/dustvalue, getBlock(Info.platinumore));
			
			//if (getBlock(Info.aluminumore) != null)
			//{
				CrucibleRegistry.register(getItem(Info.aluminumgrav).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("aluminum.molten"), ingotcostCrucible/dustvalue, getBlock(Info.aluminumore));
				CrucibleRegistry.register(getItem(Info.aluminumsand).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("aluminum.molten"), ingotcostCrucible/dustvalue, getBlock(Info.aluminumore));
				CrucibleRegistry.register(getItem(Info.aluminumdust).itemID, 0, ingotcostCrucible/dustvalue*2, getFluid("aluminum.molten"), ingotcostCrucible/dustvalue, getBlock(Info.aluminumore));
			//}
		}
		
		CrucibleRegistry.register(Block.sand.blockID, 0, 2000, getFluid("glass.molten"), 1000, Block.sand);
		CrucibleRegistry.register(Block.glass.blockID, 0, 2000, getFluid("glass.molten"), 1000, Block.glass);
		CrucibleRegistry.register(getIDs(Info.stones), 0, 2, getFluid("stone.seared"), 2, Block.cobblestone);
	}

	public static void WYNAUT()
	{
		Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, 0), getIDs(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
		Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, 1), getIDs(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
		Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, 2), getIDs(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
		Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, 3), getIDs(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
		Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, 4), getIDs(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
		Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, 5), getIDs(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
		Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, 6), getIDs(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
		Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, 7), getIDs(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
		Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, 8), getIDs(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
		Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, 9), getIDs(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
	}
}
