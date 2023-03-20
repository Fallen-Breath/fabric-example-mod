package net.fabricmc.example;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExamplePreLaunchEntrypoint implements PreLaunchEntrypoint
{
	private final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onPreLaunch()
	{
		LOGGER.info("onPreLaunch");
	}
}
