package com.granzginz.halaman;

import org.andengine.engine.camera.Camera;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.util.GLState;

import com.granzginz.base.LayoutGameBaseScene;
import com.granzginz.manager.SceneManager;
import com.granzginz.manager.SceneManager.LayoutSceneType;
import com.granzginz.tools.GameCamera;

public class CaraBermain extends LayoutGameBaseScene {

	private Sprite bkg;

	@Override
	public void createScene() {

		bkg = new Sprite(GameCamera.getInstance().getCAMERA_WIDTH() / 2,
				GameCamera.getInstance().getCAMERA_HEIGHT() / 2,
				resourcesManagerAsset.latarCaraBermain_region, layoutgame_vbom) {

			@Override
			protected void preDraw(GLState pGLState, Camera pCamera) {

				pGLState.enableDither();
				super.preDraw(pGLState, pCamera);

			}
		};
		attachChild(bkg);
	}

	@Override
	public void disposeScene() {

		detachChild(bkg);
		this.detachSelf();
		this.dispose();
	}

	@Override
	public LayoutSceneType getSceneType() {

		return LayoutSceneType.SCENE_CARA_BERMAIN;
	}

	@Override
	public void onBackKeyPressed() {

		SceneManager.getInstance().loadMenuScene(layoutgame_engine);
	}

}
