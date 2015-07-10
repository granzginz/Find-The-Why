package com.granzginz.halaman;

import org.andengine.engine.camera.Camera;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.util.GLState;

import com.granzginz.base.LayoutGameBaseScene;
import com.granzginz.manager.SceneManager.LayoutSceneType;
import com.granzginz.tools.GameCamera;

public class SplashScene extends LayoutGameBaseScene {

	private Sprite splash;

	@Override
	public void createScene() {

		splash = new Sprite(GameCamera.getInstance().getCAMERA_WIDTH() / 2,
				GameCamera.getInstance().getCAMERA_HEIGHT() / 2,
				resourcesManagerAsset.splash_region, layoutgame_vbom) {

			@Override
			protected void preDraw(GLState pGLState, Camera pCamera) {

				pGLState.enableDither();
				super.preDraw(pGLState, pCamera);

			}
		};
		attachChild(splash);
	}

	@Override
	public void disposeScene() {

		splash.detachSelf();
		splash.dispose();
		this.detachSelf();
		this.dispose();
	}

	@Override
	public LayoutSceneType getSceneType() {

		return LayoutSceneType.SCENE_SPLASH;
	}

	@Override
	public void onBackKeyPressed() {

		return;
	}

}
