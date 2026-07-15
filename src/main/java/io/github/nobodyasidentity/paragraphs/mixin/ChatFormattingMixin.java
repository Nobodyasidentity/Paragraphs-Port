package io.github.nobodyasidentity.paragraphs.mixin;

import net.minecraft.ChatFormatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChatFormatting.class)
public class ChatFormattingMixin{
	@Inject(method="stripFormatting",at=@At("HEAD"),cancellable=true)
	private static void noStrip(String pText,CallbackInfoReturnable<String>cir){
        cir.setReturnValue(pText);
    }
}