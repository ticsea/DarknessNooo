package ticsea.darknessnooo.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ticsea.darknessnooo.Darknessnooo;

public class MobEffects{
   public static final DeferredRegister<MobEffect> REGISTERHOLDER = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Darknessnooo.MODID);

   public static final RegistryObject<MobEffect> DARKNESS_NOOO = REGISTERHOLDER.register("darkness_nooo",
            () -> new DarknessNoooEffect(MobEffectCategory.BENEFICIAL, 2696993));// 2696993 is effect color.

   public static void register(IEventBus eventBus) {
        REGISTERHOLDER.register(eventBus);
    }
}