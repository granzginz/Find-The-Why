package com.granzginz.halaman;

import org.andengine.engine.camera.Camera;
import org.andengine.entity.scene.background.AutoParallaxBackground;
import org.andengine.entity.scene.background.ParallaxBackground.ParallaxEntity;
import org.andengine.entity.scene.menu.MenuScene;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.util.GLState;

import com.granzginz.base.LayoutGameBaseScene;
import com.granzginz.manager.SceneManager;
import com.granzginz.manager.SceneManager.LayoutSceneType;
import com.granzginz.tools.GameCamera;

public class MainMenu extends LayoutGameBaseScene {

	private MenuScene menuChildScene;

	private AutoParallaxBackground autoParallaxBackground;

	AnimatedSprite pohonA;

	AnimatedSprite pohonB;

	Sprite gedungSD;

	Sprite judul;

	Sprite latar;

	Sprite pagar;

	Sprite rumput;

	Sprite tanah;
	Sprite mulai;
	Sprite carabermain;
	Sprite informasipengembang;

	private void createBackground() {

		gedungSD = new Sprite(GameCamera.getInstance().getCAMERA_WIDTH() / 2,
				GameCamera.getInstance().getCAMERA_HEIGHT() / 2,
				resourcesManagerAsset.gedungSD_region, layoutgame_vbom) {

			@Override
			protected void preDraw(GLState pGLState, Camera pCamera) {

				pGLState.enableDither();
				super.preDraw(pGLState, pCamera);

			}
		};

		judul = new Sprite(GameCamera.getInstance().getCAMERA_WIDTH() / 2 - 19,
				579, resourcesManagerAsset.judul_region, layoutgame_vbom) {

			@Override
			protected void preDraw(GLState pGLState, Camera pCamera) {

				pGLState.enableDither();
				super.preDraw(pGLState, pCamera);

			}
		};

		pagar = new Sprite(GameCamera.getInstance().getCAMERA_WIDTH() / 2,
				GameCamera.getInstance().getCAMERA_HEIGHT() / 2,
				resourcesManagerAsset.pagarMenu_region, layoutgame_vbom) {

			@Override
			protected void preDraw(GLState pGLState, Camera pCamera) {

				pGLState.enableDither();
				super.preDraw(pGLState, pCamera);

			}
		};

		rumput = new Sprite(GameCamera.getInstance().getCAMERA_WIDTH() / 2,
				GameCamera.getInstance().getCAMERA_HEIGHT() / 2,
				resourcesManagerAsset.rumputMenu_region, layoutgame_vbom) {

			@Override
			protected void preDraw(GLState pGLState, Camera pCamera) {

				pGLState.enableDither();
				super.preDraw(pGLState, pCamera);

			}
		};

		tanah = new Sprite(GameCamera.getInstance().getCAMERA_WIDTH() / 2,
				GameCamera.getInstance().getCAMERA_HEIGHT() / 2,
				resourcesManagerAsset.tanahMenu_region, layoutgame_vbom) {

			@Override
			protected void preDraw(GLState pGLState, Camera pCamera) {

				pGLState.enableDither();
				super.preDraw(pGLState, pCamera);

			}
		};

		pohonA = new AnimatedSprite(955, 360,
				resourcesManagerAsset.pohonA_Region, layoutgame_vbom);
		pohonB = new AnimatedSprite(562, 360,
				resourcesManagerAsset.pohonB_Region, layoutgame_vbom);

		pohonA.animate(1000);
		pohonB.animate(1000);
		// attachChild( template ) ;

		attachChild(tanah);
		attachChild(rumput);
		attachChild(pohonA);
		attachChild(pohonB);
		attachChild(gedungSD);
		attachChild(pagar);
		attachChild(judul);
	}

	private void createBackgroundParalax() {

		autoParallaxBackground = new AutoParallaxBackground(0, 0, 0, 1);
		autoParallaxBackground
				.attachParallaxEntity(new ParallaxEntity(
						50.0f,
						new Sprite(
								GameCamera.getInstance().getCAMERA_WIDTH() / 2,
								GameCamera.getInstance().getCAMERA_HEIGHT() / 2,
								resourcesManagerAsset.latarMenu_region,
								layoutgame_vbom)));
		autoParallaxBackground.attachParallaxEntity(new ParallaxEntity(-2.0f,
				new Sprite(0, 620, resourcesManagerAsset.awanA_region,
						layoutgame_vbom)));
		autoParallaxBackground.attachParallaxEntity(new ParallaxEntity(-3.0f,
				new Sprite(0, 590, resourcesManagerAsset.awanB_region,
						layoutgame_vbom)));
		autoParallaxBackground.attachParallaxEntity(new ParallaxEntity(-5.0f,
				new Sprite(0, 670, resourcesManagerAsset.awanC_region,
						layoutgame_vbom)));

		setBackground(autoParallaxBackground);

	}

	private void createMenuChildScene() {

		mulai = new Sprite(GameCamera.getInstance().getCAMERA_WIDTH() / 2,
				GameCamera.getInstance().getCAMERA_HEIGHT() / 2,
				resourcesManagerAsset.mulai_region, layoutgame_vbom) {

			@Override
			protected void preDraw(GLState pGLState, Camera pCamera) {

				pGLState.enableDither();
				super.preDraw(pGLState, pCamera);

			}

			@Override
			public boolean onAreaTouched(TouchEvent pSceneTouchEvent,
					float pTouchAreaLocalX, float pTouchAreaLocalY) {

				if (pSceneTouchEvent.isActionUp()) {
					SceneManager.getInstance().loadPilihanGameScene(
							layoutgame_engine);
					disposeScene();

				}
				return super.onAreaTouched(pSceneTouchEvent, pTouchAreaLocalX,
						pTouchAreaLocalY);
			}
		};

		carabermain = new Sprite(
				GameCamera.getInstance().getCAMERA_WIDTH() / 2, GameCamera
						.getInstance().getCAMERA_HEIGHT() / 2,
				resourcesManagerAsset.cara_bermain_region, layoutgame_vbom) {

			@Override
			protected void preDraw(GLState pGLState, Camera pCamera) {

				pGLState.enableDither();
				super.preDraw(pGLState, pCamera);

			}

			@Override
			public boolean onAreaTouched(TouchEvent pSceneTouchEvent,
					float pTouchAreaLocalX, float pTouchAreaLocalY) {
				if (pSceneTouchEvent.isActionUp()) {
					SceneManager.getInstance().loadCaraBermain(
							layoutgame_engine);
					System.out.println("MASUKKK KE CARA BERMAIN SENTUUUUH !!!");
					disposeScene();

				}
				return super.onAreaTouched(pSceneTouchEvent, pTouchAreaLocalX,
						pTouchAreaLocalY);
			}
		};
		informasipengembang = new Sprite(GameCamera.getInstance()
				.getCAMERA_WIDTH() / 2, GameCamera.getInstance()
				.getCAMERA_HEIGHT() / 2, resourcesManagerAsset.inpeng_region,
				layoutgame_vbom) {

			@Override
			protected void preDraw(GLState pGLState, Camera pCamera) {

				pGLState.enableDither();
				super.preDraw(pGLState, pCamera);

			}

			@Override
			public boolean onAreaTouched(TouchEvent pSceneTouchEvent,
					float pTouchAreaLocalX, float pTouchAreaLocalY) {

				if (pSceneTouchEvent.isActionUp()) {
					SceneManager.getInstance().loadInformasiPengembang(
							layoutgame_engine);
					disposeScene();

				}
				return super.onAreaTouched(pSceneTouchEvent, pTouchAreaLocalX,
						pTouchAreaLocalY);
			}
		};

		mulai.setPosition(820, 280);
		carabermain.setPosition(180, 80);
		informasipengembang.setPosition(760, 80);

		// setOnSceneTouchListener(this);

		attachChild(mulai);
		attachChild(carabermain);
		attachChild(informasipengembang);

		this.registerTouchArea(mulai);
		this.registerTouchArea(carabermain);
		this.registerTouchArea(informasipengembang);
		// setTouchAreaBindingOnActionMoveEnabled(true);
		// setOnAreaTouchTraversalFrontToBack();
		// setChildScene( menuChildScene ) ;

	}

	@Override
	public void createScene() {

		createBackgroundParalax();
		createBackground();
		createMenuChildScene();

	}

	@Override
	public void disposeScene() {

		detachChild(tanah);
		detachChild(rumput);
		detachChild(pohonA);
		detachChild(pohonB);
		detachChild(gedungSD);
		detachChild(pagar);
		detachChild(judul);
		detachChild(menuChildScene);

		this.dispose();
		this.detachSelf();
	}

	@Override
	public LayoutSceneType getSceneType() {

		return LayoutSceneType.SCENE_MENU;
	}

	@Override
	public void onBackKeyPressed() {

		// System.exit( 0 ) ;

	}

}