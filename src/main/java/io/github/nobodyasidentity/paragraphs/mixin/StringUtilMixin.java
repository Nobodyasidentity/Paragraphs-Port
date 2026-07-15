package io.github.nobodyasidentity.paragraphs.mixin;

import net.minecraft.util.StringUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StringUtil.class)
public class StringUtilMixin{
    @Inject(method="isAllowedChatCharacter",at=@At("HEAD"),cancellable=true)
    private static void allowedChar(final int i,CallbackInfoReturnable<Boolean>cir){
        cir.setReturnValue(true);
    }
}