package com.example;

import fi.dy.masa.malilib.gui.GuiConfigsBase;
import net.minecraft.client.gui.screens.Screen;

import java.util.List;

public class GuiConfigs extends GuiConfigsBase
{
	public GuiConfigs(int listX, int listY, String modId, Screen parent, String titleKey, Object... args)
	{
		super(listX, listY, modId, parent, titleKey, args);
	}

	@Override
	public List<ConfigOptionWrapper> getConfigs()
	{
		return List.of();
	}
}
