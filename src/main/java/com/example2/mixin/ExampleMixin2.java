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
	@Inject(at = @At("HEAD"), method = "myBlockPosBelow1(Lcom/example/ExampleHelper;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;")
	private static void init1(CallbackInfoReturnable<BlockPos> cir) {
	}

	@Inject(at = @At("HEAD"), method = "myBlockPosBelow2(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;")
	private static void init2(CallbackInfoReturnable<BlockPos> cir) {
	}
}