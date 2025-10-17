package ticsea.darknessnooo.mixin;

import net.minecraft.client.Camera;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*Block Sky Effect
* 天空遮效果*/
//todo exclusive blight
@OnlyIn(Dist.CLIENT)
@Mixin(LevelRenderer.class)
public abstract class LevelRendererMixin implements ResourceManagerReloadListener, AutoCloseable {
    @Inject(method = "doesMobEffectBlockSky", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;getEntity()Lnet/minecraft/world/entity/Entity;", shift = At.Shift.BY, by = 3), cancellable = true)
    private void doesMobEffectBlockSky(Camera pCamera, CallbackInfoReturnable<Boolean> cir) {
        Entity entity = pCamera.getEntity();
        cir.setReturnValue(((LivingEntity) entity).hasEffect(MobEffects.BLINDNESS));
    }

   /* @Inject(method = "doesMobEffectBlockSky", at = @At(value = "HEAD"), cancellable = true)
    private void d2(Camera pCamera, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }*/
}
