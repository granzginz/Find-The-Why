package com.granzginz.engineoptions;

import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.WakeLockOptions;
import org.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;

import com.granzginz.tools.GameCamera;

public class GameEngineOptions {

	public static EngineOptions getLayoutGameEngineoptions() {

		GameCamera.getInstance().getCameraLayoutGame();
		engineOptionsLayoutGame = new EngineOptions(true,
				ScreenOrientation.LANDSCAPE_FIXED, new FillResolutionPolicy(),
				GameCamera.cameraLayoutGame);
		engineOptionsLayoutGame.getAudioOptions().setNeedsMusic(true)
				.setNeedsSound(true);
		engineOptionsLayoutGame.getRenderOptions();
		engineOptionsLayoutGame.setWakeLockOptions(WakeLockOptions.SCREEN_ON);

		return engineOptionsLayoutGame;
	}

	public static EngineOptions engineOptionsLayoutGame;
}
