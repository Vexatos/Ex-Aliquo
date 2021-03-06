package exaliquo;

import exnihilo.registries.CompostRegistry;
import exnihilo.registries.ColorRegistry;

import static exaliquo.ModIDs.getIDs;
import exaliquo.ModIDs.Info;

public class ExtraCompost {

	public static void registerTinkerCompost()
	{
		if (Configurations.allowTinkerBushCompost)
		{
			CompostRegistry.register(getIDs(Info.oreberry), 8, 1.0F, ColorRegistry.color("ironberry"));
			CompostRegistry.register(getIDs(Info.oreberry), 9, 1.0F, ColorRegistry.color("goldberry"));
			CompostRegistry.register(getIDs(Info.oreberry), 10, 1.0F, ColorRegistry.color("copperberry"));
			CompostRegistry.register(getIDs(Info.oreberry), 11, 1.0F, ColorRegistry.color("tinberry"));
			CompostRegistry.register(getIDs(Info.oreberrybush2), 8, 1.0F, ColorRegistry.color("aluminumberry"));
			CompostRegistry.register(getIDs(Info.oreberrybush2), 9, 1.0F, ColorRegistry.color("essenceberry"));
		}
		CompostRegistry.register(getIDs(Info.oreberry), 5, 0.1F, ColorRegistry.color("essenceberry"));
		CompostRegistry.register(getIDs(Info.hambone), 0, 1.0F, ColorRegistry.color("pork_raw"));
	}

	public static void registerNaturaCompost()
	{
		CompostRegistry.register(getIDs(Info.good), 12, 0.2F, ColorRegistry.color("raspbush"));
		CompostRegistry.register(getIDs(Info.good), 13, 0.2F, ColorRegistry.color("bluebush"));
		CompostRegistry.register(getIDs(Info.good), 14, 0.2F, ColorRegistry.color("blackbush"));
		CompostRegistry.register(getIDs(Info.good), 15, 0.2F, ColorRegistry.color("geobush"));
		CompostRegistry.register(getIDs(Info.evil), 12, 0.2F, ColorRegistry.color("blightbush"));
		CompostRegistry.register(getIDs(Info.evil), 13, 0.2F, ColorRegistry.color("duskbush"));
		CompostRegistry.register(getIDs(Info.evil), 14, 0.2F, ColorRegistry.color("skybush"));
		CompostRegistry.register(getIDs(Info.evil), 15, 0.2F, ColorRegistry.color("stingbush"));
		
		CompostRegistry.register(getIDs(Info.goodberry), 0, 0.05F, ColorRegistry.color("raspberry"));
		CompostRegistry.register(getIDs(Info.goodberry), 1, 0.05F, ColorRegistry.color("blueberry"));
		CompostRegistry.register(getIDs(Info.goodberry), 2, 0.05F, ColorRegistry.color("blackberry"));
		CompostRegistry.register(getIDs(Info.goodberry), 3, 0.05F, ColorRegistry.color("geoberry"));
		CompostRegistry.register(getIDs(Info.badberry), 0, 0.05F, ColorRegistry.color("blightberry"));
		CompostRegistry.register(getIDs(Info.badberry), 1, 0.05F, ColorRegistry.color("duskbery"));
		CompostRegistry.register(getIDs(Info.badberry), 2, 0.05F, ColorRegistry.color("skyberry"));
		CompostRegistry.register(getIDs(Info.badberry), 3, 0.05F, ColorRegistry.color("stingberry"));
		
		CompostRegistry.register(getIDs(Info.leaves), 0, 0.005F, ColorRegistry.color("redwood"));
		CompostRegistry.register(getIDs(Info.leaves), 1, 0.125F, ColorRegistry.color("eucalyptus"));
		CompostRegistry.register(getIDs(Info.leaves), 2, 0.125F, ColorRegistry.color("hopseed"));
		CompostRegistry.register(getIDs(Info.rareleaves), 0, 0.125F, ColorRegistry.color("maple"));
		CompostRegistry.register(getIDs(Info.rareleaves), 1, 0.125F, ColorRegistry.color("silverbell"));
		CompostRegistry.register(getIDs(Info.rareleaves), 2, 0.125F, ColorRegistry.color("amaranth"));
		CompostRegistry.register(getIDs(Info.rareleaves), 3, 0.125F, ColorRegistry.color("tigerwood"));
		CompostRegistry.register(getIDs(Info.darkleaves), 0, 0.125F, ColorRegistry.color("darkwood"));
		CompostRegistry.register(getIDs(Info.darkleaves), 1, 0.125F, ColorRegistry.color("darkwood"));
		CompostRegistry.register(getIDs(Info.darkleaves), 2, 0.125F, ColorRegistry.color("darkwood"));
		CompostRegistry.register(getIDs(Info.darkleaves), 3, 0.125F, ColorRegistry.color("fusewood"));
		CompostRegistry.register(getIDs(Info.monochrome), 0, 0.125F, ColorRegistry.color("sakura"));
		CompostRegistry.register(getIDs(Info.monochrome), 1, 0.125F, ColorRegistry.color("ghostwood"));
		CompostRegistry.register(getIDs(Info.monochrome), 2, 0.125F, ColorRegistry.color("bloodwood"));
		CompostRegistry.register(getIDs(Info.monochrome), 3, 0.125F, ColorRegistry.color("willow"));
		
		CompostRegistry.register(getIDs(Info.flora), 0, 0.005F, ColorRegistry.color("redwood"));
		CompostRegistry.register(getIDs(Info.flora), 1, 0.125F, ColorRegistry.color("eucalyptus"));
		CompostRegistry.register(getIDs(Info.flora), 2, 0.125F, ColorRegistry.color("hopseed"));
		CompostRegistry.register(getIDs(Info.flora), 3, 0.125F, ColorRegistry.color("sakura"));
		CompostRegistry.register(getIDs(Info.flora), 4, 0.125F, ColorRegistry.color("ghostwood"));
		CompostRegistry.register(getIDs(Info.flora), 5, 0.125F, ColorRegistry.color("bloodwood"));
		CompostRegistry.register(getIDs(Info.flora), 6, 0.125F, ColorRegistry.color("darkwood"));
		CompostRegistry.register(getIDs(Info.flora), 7, 0.125F, ColorRegistry.color("fusewood"));
		CompostRegistry.register(getIDs(Info.raresap), 0, 0.125F, ColorRegistry.color("maple"));
		CompostRegistry.register(getIDs(Info.raresap), 1, 0.125F, ColorRegistry.color("silverbell"));
		CompostRegistry.register(getIDs(Info.raresap), 2, 0.125F, ColorRegistry.color("amaranth"));
		CompostRegistry.register(getIDs(Info.raresap), 3, 0.125F, ColorRegistry.color("tigerwood"));
		CompostRegistry.register(getIDs(Info.raresap), 4, 0.125F, ColorRegistry.color("willow"));
		
		CompostRegistry.register(getIDs(Info.glowshroom), 0, 0.1F, ColorRegistry.color("blueglow"));
		CompostRegistry.register(getIDs(Info.glowshroom), 1, 0.1F, ColorRegistry.color("greenglow"));
		CompostRegistry.register(getIDs(Info.glowshroom), 2, 0.1F, ColorRegistry.color("purpleglow"));
		
		CompostRegistry.register(getIDs(Info.cactus), 0, 0.1F, ColorRegistry.color("saguaro"));
		CompostRegistry.register(getIDs(Info.fruit), 0, 0.1F, ColorRegistry.color("fruit"));
		CompostRegistry.register(getIDs(Info.potash), 0, 0.1F, ColorRegistry.color("potash"));
		CompostRegistry.register(getIDs(Info.plants), 0, 0.08F, ColorRegistry.color("barley"));
		CompostRegistry.register(getIDs(Info.plants), 1, 0.08F, ColorRegistry.color("barley"));
		CompostRegistry.register(getIDs(Info.plants), 2, 0.08F, ColorRegistry.color("flour"));
		CompostRegistry.register(getIDs(Info.plants), 3, 0.04F, ColorRegistry.color("white"));
		CompostRegistry.register(getIDs(Info.bluebell), 0, 0.1F, ColorRegistry.color("bluebell"));
		CompostRegistry.register(getIDs(Info.thornvines), 0, 0.1F, ColorRegistry.color("thornvine"));
		CompostRegistry.register(getIDs(Info.impmeat), 0, 0.2F, ColorRegistry.color("impmeat"));
		CompostRegistry.register(getIDs(Info.impmeat), 1, 0.2F, ColorRegistry.color("impmeat"));
	}
	
	public static void registerArsCompost()
	{
		CompostRegistry.register(getIDs(Info.nova), 0, 0.1F, ColorRegistry.color("nova"));
		CompostRegistry.register(getIDs(Info.orchid), 0, 0.1F, ColorRegistry.color("orchid"));
		CompostRegistry.register(getIDs(Info.aum), 0, 0.1F, ColorRegistry.color("white"));
		CompostRegistry.register(getIDs(Info.witchwood), 0, 0.125F, ColorRegistry.color("witchwood"));
		CompostRegistry.register(getIDs(Info.witchleaves), 0, 0.125F, ColorRegistry.color("witchwood"));
		CompostRegistry.register(getIDs(Info.wakebloom), 0, 0.125F, ColorRegistry.color("wakebloom"));
		CompostRegistry.register(getIDs(Info.tarma), 0, 0.125F, ColorRegistry.color("tarma"));
	}
}