package kz.chesschicken.example.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Mixins works normally only with Java :(
 *
 */
@Mixin(Minecraft.class)
public class MixinExample {
    @Inject(method = "init", at = @At("TAIL"))
    private void mixinByJava(CallbackInfo ci)
    {
        System.out.println("Mixing things is cool!");
    }
}