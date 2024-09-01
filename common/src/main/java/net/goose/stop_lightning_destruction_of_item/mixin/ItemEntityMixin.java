package net.goose.stop_lightning_destruction_of_item.mixin;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.item.ItemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public abstract class ItemEntityMixin {
    @Inject(method = "thunderHit", at = @At("HEAD"), cancellable = true)
    public void thunderHit(ServerLevel serverLevel, LightningBolt lightningBolt, CallbackInfo ci){
        Entity entity = (Entity)((Object) this);
        if(entity instanceof ItemEntity){
            ci.cancel();
        }
    }
}
