package ticsea.darknessnooo.mixin;

import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*Block Sky Effect
* 天空遮效果*/

@Mixin(LevelRenderer.class)
public abstract class LevelRendererMixin implements ResourceManagerReloadListener, AutoCloseable {
    @Inject(method = "doesMobEffectBlockSky", at = @At("HEAD"), cancellable = true)
    private void doesMobEffectBlockSky(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
