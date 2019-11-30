package mekanica;

import mekanica.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Mekanica.MODID, name = Mekanica.NAME, version = Mekanica.VERSION,
        acceptedMinecraftVersions = "[1.12]", useMetadata = true)
public class Mekanica
{
    public static final String MODID = "mekanica";
    public static final String NAME = "Mekanica";
    public static final String VERSION = "0.0.0";

    @SidedProxy(clientSide = "mekanica.proxy.ClientProxy",
                serverSide = "mekanica.proxy.CommonProxy")
    public static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
