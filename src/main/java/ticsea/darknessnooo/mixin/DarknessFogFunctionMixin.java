package ticsea.darknessnooo.mixin;

import net.minecraft.world.effect.MobEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ticsea.darknessnooo.effect.MobEffects;

/*Fog Effect
* 黑雾笼罩效果*/

@Mixin(targets = "net.minecraft.client.renderer.FogRenderer$DarknessFogFunction")
public abstract class DarknessFogFunctionMixin {
    @Inject(method = "getMobEffect", at = @At("HEAD"), cancellable = true)
    private void getMobEffect(CallbackInfoReturnable<MobEffect> cir) {
        // it seems gets some wrong when have DARKNESS_NOOO effect.
        cir.setReturnValue(MobEffects.DARKNESS_NOOO.get());
    }
}
