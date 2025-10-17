package ticsea.darknessnooo.mixin;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*Fog Effect
* 黑雾笼罩效果*/

@Mixin(targets = "net.minecraft.client.renderer.FogRenderer$DarknessFogFunction")
public abstract class DarknessFogFunctionMixin {

    @Inject(method = "getMobEffect", at = @At("TAIL"), cancellable = true)
    private void getMobEffect(CallbackInfoReturnable<MobEffect> cir) {
            cir.setReturnValue(MobEffects.BLINDNESS);
            cir.cancel();
    }
}
