package com.granzginz.tools;

import org.andengine.engine.camera.Camera;

import com.granzginz.config.GameConfig;

public class GameCamera {

	public static GameCamera getInstance() {

		return INSTANCE;
	}

	public static Camera cameraLayoutGame;

	private static final GameCamera INSTANCE = new GameCamera();

	public int getCAMERA_HEIGHT() {

		return GameConfig.CAMERA_HEIGHT;
	}

	public int getCAMERA_WIDTH() {

		return GameConfig.CAMERA_WIDTH;
	}

	public Camera getCameraLayoutGame() {

		cameraLayoutGame = new Camera(getInstance().getCamX(), getInstance()
				.getCamY(), getInstance().getCAMERA_WIDTH(), getInstance()
				.getCAMERA_HEIGHT());
		cameraLayoutGame.setCenter(getInstance().getCamX(), getInstance()
				.getCamY());
		cameraLayoutGame.set(0, 0, getInstance().getCAMERA_WIDTH(),
				getInstance().getCAMERA_HEIGHT());
		// camera.setSurfaceSize(getInstance().getCamX(),
		// getInstance().getCamY(), getInstance().getCAMERA_WIDTH(),
		// getInstance().getCAMERA_HEIGHT());
		// cameraLayoutGame.setResizeOnSurfaceSizeChanged(true);
		// cameraLayoutGame.setSurfaceSize(0, 0, pSurfaceWidth,
		// pSurfaceHeight);
		return cameraLayoutGame;
	}

	public int getCamX() {

		return GameConfig.camX;
	}

	public int getCamY() {

		return GameConfig.camY;
	}

}
