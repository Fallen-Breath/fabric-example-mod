package com.example;

import net.minecraft.core.BlockPos;

public class ExampleHelper {
	public static BlockPos myBlockPosBelow(BlockPos pos) {
		return pos.below();
	}
}
