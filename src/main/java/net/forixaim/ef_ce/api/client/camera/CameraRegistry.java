package net.forixaim.ef_ce.api.client.camera;

import net.minecraft.resources.ResourceLocation;

/**
 * This class is in charge of registering all new camera animations that go with Epic Fight's
 */
public final class CameraRegistry
{
	private String MOD_ID;
	private CameraRegistry(final String MOD_ID)
	{
		this.MOD_ID = MOD_ID;
	}

	public static CameraRegistry createRegistry(final String MOD_ID)
	{
		return new CameraRegistry(MOD_ID);
	}



	/**
	 * Creates a new Camera Animation from a set JSON file.
	 * @param location The Location where should Minecraft Search for. Your JSON files should be in the animmodels/camera folder
	 * @return A new Camera Animation from said JSON file.
	 */
	public CameraAnimation load(String location)
	{
		return CameraAnimation.load(new ResourceLocation(MOD_ID, "animmodels/camera/" + location));
	}

	/**
	 * Creates a new Camera Animation from a set JSON file.
	 * @param location The Location where should Minecraft Search for. Your JSON files should be in the animmodels/camera folder
	 * @param timeScale The play speed modifier of the animation
	 * @return A new Camera Animation from said JSON file.
	 */
	public CameraAnimation load(String location, float timeScale)
	{
		return CameraAnimation.load(new ResourceLocation(MOD_ID, "animmodels/camera/" + location), timeScale);
	}
}
