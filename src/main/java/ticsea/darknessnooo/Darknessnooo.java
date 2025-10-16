package ticsea.darknessnooo;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import ticsea.darknessnooo.effect.MobEffects;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(Darknessnooo.MODID)
public class Darknessnooo
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "darknessnooo";
    // Directly reference a slf4j logger
//    private static final Logger LOGGER = LogUtils.getLogger();

    public Darknessnooo(FMLJavaModLoadingContext context)
    {
        // Register ourselves for server and other game events we are interested in
//        MinecraftForge.EVENT_BUS.register(this);

        MobEffects.register(context.getModEventBus());
    }
}
