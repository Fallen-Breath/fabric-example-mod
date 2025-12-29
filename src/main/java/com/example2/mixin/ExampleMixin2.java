package com.example2.mixin;

import net.minecraft.core.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(targets = "com.example.ExampleHelper")
public class ExampleMixin2 {
	@Inject(at = @At("HEAD"), method = "myBlockPosBelow(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;")
	private static void init(CallbackInfoReturnable<BlockPos> cir) {
	}
}