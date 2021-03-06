package exaliquo;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.Configuration;

public class Configurations {

	public static boolean WYNAUT;
	public static boolean isOre;
	public static boolean allowDustSmelting;
	public static boolean dustValue;
	public static boolean sieveOreBushes;
	public static boolean sieveEssenceBushes;
	public static boolean sieveNetherOres;
	public static boolean sieveRedwoods;
	public static boolean sieveOverworldTrees;
	public static boolean allowTinkerBushCompost;
	public static boolean sieveNetherTrees;
	public static boolean sieveBerryBushes;
	public static boolean sieveDarkBerries;
	public static boolean hammerMoonstone;
	public static boolean sieveNovas;
	public static boolean miniSmelting;
	public static boolean silverwoodSwitch;
	
	public static void Load (File location)
	{
		File file = new File(location + "/exaliquo.cfg");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Configuration config = new Configuration(file);
		config.load();
		
		isOre = config.get("TCon Tweaks", "Are Gravel/Sand/Dust Ores actually ores", true, "False for counting as an ingot").getBoolean(true);
		allowDustSmelting = config.get("TCon Tweaks", "Can Gravel/Sand/Dust items be smelted", true).getBoolean(true);
		dustValue = config.get("TCon Tweaks", "Normal dust value in the smeltery", true, "Normal is 1/4 the block value. False means dusts are 1/6 the value").getBoolean(true);
		sieveOreBushes = config.get("TCon Tweaks", "Can orebushes be obtained", true).getBoolean(true);
		sieveEssenceBushes = config.get("TCon Tweaks","Can essense bushes be obtained", true).getBoolean(true);
		sieveNetherOres = config.get("TCon Tweaks", "Can nether ores be obtained", true).getBoolean(true);
		allowTinkerBushCompost = config.get("TCon Tweaks", "Can oreberry bushes be composted", false).getBoolean(false);
		miniSmelting = config.get("TCon Tweaks", "Enable mini-smelteries", false).getBoolean(false);
		
		sieveRedwoods = config.get("Natura Tweaks", "Can redwood trees be obtained", false, "Redwoods eat every block going both up and down. Use at your own peril. Or enjoyment").getBoolean(false);
		sieveOverworldTrees = config.get("Natura Tweaks", "Can natura trees be obtained", true).getBoolean(true);
		sieveNetherTrees = config.get("Natura Tweaks", "Can nether trees be obtained", true).getBoolean(true);
		sieveBerryBushes = config.get("Natura Tweaks", "Can berry bushes be obtained", true).getBoolean(true);
		sieveDarkBerries = config.get("Natura Tweaks", "Can nether bushes be obtained", true).getBoolean(true);
		
		hammerMoonstone = config.get("ArsMagica Tweaks", "Can moonstone be obtained", false).getBoolean(false);
		sieveNovas = config.get("ArsMagica Tweaks", "Can desert novas be obtained", true).getBoolean(true);
		
		WYNAUT = config.get("ArsMagica Tweaks","TinkerBridge", true).getBoolean(true);
		
		config.save();
	}
}
