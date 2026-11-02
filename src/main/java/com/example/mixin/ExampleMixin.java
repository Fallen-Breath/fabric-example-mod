package com.example.mixin;

import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Vec3.class)
public class ExampleMixin {
	@Inject(at = @At(value = "FIELD", target = "Lnet/minecraft/world/phys/Vec3;x:D"), method = "lengthSqr", require = 2)
	private void init(CallbackInfoReturnable<Double> info) {
		// Vec3.lengthSqr() reads x twice.
	}
}