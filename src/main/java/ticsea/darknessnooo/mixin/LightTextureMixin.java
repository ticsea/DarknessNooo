package ticsea.darknessnooo.mixin;

import net.minecraft.client.renderer.LightTexture;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*Darkness Pulsing
* 黑暗脉动效果*/

// This project is modified from Tweakermore Mod and follows the original author's license.
@Mixin(LightTexture.class)
public abstract class LightTextureMixin {
    @Inject(method = "getDarknessGamma", at = @At("HEAD"), cancellable = true)
    private void getDarknessGamma(float pPartialTick, CallbackInfoReturnable<Float> cir){
        cir.setReturnValue(0.0F);
    }
}
