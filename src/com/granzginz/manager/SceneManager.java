package com.granzginz.manager;

import org.andengine.engine.Engine;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.ui.IGameInterface.OnCreateSceneCallback;

import com.granzginz.base.LayoutGameBaseScene;
import com.granzginz.halaman.CaraBermain;
import com.granzginz.halaman.InformasiPengembang;
import com.granzginz.halaman.MainMenu;
import com.granzginz.halaman.SplashScene;

public class SceneManager {

	// ====
	// kumpulan scene
	// ====

	public enum LayoutSceneType {
		ACTIVITY_HANDLER_FROM_BASED_TO_LAYOUT, SCENE_SPLASH, SCENE_MENU, SCENE_CARA_BERMAIN, SCENE_INFORMASI_PENGEMBANG, SCENE_KAMAR, SCENE_RUANG_TENGAH, SCENE_LOTENG, SCENE_HALAMAN_SEKOLAH, SCENE_LOADING

	}

	// ==========
	// Variabel class
	// ==========

	public static SceneManager getInstance() {

		return INSTANCE;
	}

	private static final SceneManager INSTANCE = new SceneManager();

	private LayoutGameBaseScene currentLayoutScene;

	private final Engine finalLayout_engine_engine = ResourcesManagerAsset
			.getInstance().layout_engine;

	private LayoutGameBaseScene loadingScene;

	// end variable

	private LayoutGameBaseScene menuScene;

	private LayoutGameBaseScene splashScene;

	protected LayoutGameBaseScene handlerLayoutActivity;

	private LayoutGameBaseScene caraBermainScene;

	private LayoutGameBaseScene inpengScene;

	private LayoutGameBaseScene kamarScene;

	private LayoutSceneType currentLayoutSceneType;

	// ====
	// end manager scene select
	//

	public void createMenuScene() {

		// loadingScene = new Loading();
		// SceneManager.getInstance().setSceneFromBasedScene( menuScene )
		// ;
		loadMenuScene(finalLayout_engine_engine);
		splashScene.disposeScene();
	}

	public void createSplashScene(OnCreateSceneCallback pOnCreateSceneCallback) {

		ResourcesManagerLoader.getInstance().loadSplashScreen();
		splashScene = new SplashScene();
		currentLayoutScene = splashScene;
		pOnCreateSceneCallback.onCreateSceneFinished(splashScene);
	}

	public LayoutSceneType getCurrentLayoutSceneType() {

		return currentLayoutSceneType;
	}

	public LayoutGameBaseScene getCurrentScene() {

		return currentLayoutScene;
	}

	public void loadCaraBermain(final Engine mEngine) {

		// setSceneForTypeBaseGame( loadingScene ) ;
		// ResourcesManagerLoader.getInstance().unloadMenuScreen() ;
		caraBermainScene = null;
		mEngine.registerUpdateHandler(new TimerHandler(0.1f,
				new ITimerCallback() {

					@Override
					public void onTimePassed(final TimerHandler pTimerHandler) {

						mEngine.unregisterUpdateHandler(pTimerHandler);
						ResourcesManagerLoader.getInstance()
								.loadCaraBermainResources();
						caraBermainScene = new CaraBermain();
						setSceneForLayoutBaseGame(caraBermainScene);
					}
				}));
	}

	public void loadCurrentScene(final Engine mEngine) {

		setSceneForLayoutBaseGame(loadingScene);
		// activityHandler.disposeScene() ;
		// ResourcesManagerLoader.getInstance().unloadGameTextures();
		mEngine.registerUpdateHandler(new TimerHandler(0.1f,
				new ITimerCallback() {

					@Override
					public void onTimePassed(final TimerHandler pTimerHandler) {

						mEngine.unregisterUpdateHandler(pTimerHandler);
						/*
						 * ResourcesManagerLoader.getInstance()
						 * .loadMenuResources();
						 */
						/*
						 * gameScene3 = new GameScene3(); setScene(gameScene3);
						 */
						setSceneForLayoutBaseGame(menuScene);
					}
				}));
	}

	public void loadPilihanGameScene(final Engine mEngine) {

	}

	public void loadKamarScene(final Engine mEngine) {
		kamarScene = null;

		mEngine.registerUpdateHandler(new TimerHandler(0.1f,
				new ITimerCallback() {

					@Override
					public void onTimePassed(final TimerHandler pTimerHandler) {

						mEngine.unregisterUpdateHandler(pTimerHandler);

						/*
						 * ResourcesManagerLoader.getInstance()
						 * .loadKamarResources();
						 */// kamarScene = new ();
						setSceneForLayoutBaseGame(menuScene);
					}
				}));
	}

	public void loadMenuScene(final Engine mEngine) {

		menuScene = null;
		// activityHandler.disposeScene() ;

		mEngine.registerUpdateHandler(new TimerHandler(0.1f,
				new ITimerCallback() {

					@Override
					public void onTimePassed(final TimerHandler pTimerHandler) {

						mEngine.unregisterUpdateHandler(pTimerHandler);

						ResourcesManagerLoader.getInstance()
								.loadMenuResources();
						menuScene = new MainMenu();
						setSceneForLayoutBaseGame(menuScene);
					}
				}));

	}

	public void setSceneForLayoutBaseGame(LayoutGameBaseScene scene) {

		finalLayout_engine_engine.setScene(scene);
		currentLayoutScene = scene;
		currentLayoutSceneType = scene.getSceneType();
	}

	public void setSceneFromLayoutBasedScene(LayoutSceneType sceneType) {

		switch (sceneType) {
		case SCENE_MENU:
			setSceneForLayoutBaseGame(menuScene);
			break;
		case SCENE_SPLASH:
			setSceneForLayoutBaseGame(splashScene);
			break;

		case SCENE_CARA_BERMAIN:
			setSceneForLayoutBaseGame(caraBermainScene);
			break;
		case SCENE_INFORMASI_PENGEMBANG:
			setSceneForLayoutBaseGame(inpengScene);
			break;
		case SCENE_KAMAR:
			// setSceneFromBasedScene( gameScene2 ) ;
			break;
		case SCENE_RUANG_TENGAH:
			// setSceneFromBasedScene( gameScene3 ) ;
			break;
		case SCENE_LOTENG:
			// setSceneFromBasedScene( gameScene3 ) ;
			break;
		case SCENE_HALAMAN_SEKOLAH:
			// setSceneFromBasedScene( gameScene3 ) ;
			break;
		default:
			break;
		}
	}


	public void loadInformasiPengembang(final Engine mEngine) {

		inpengScene = null;
		mEngine.registerUpdateHandler(new TimerHandler(0.1f,
				new ITimerCallback() {

					@Override
					public void onTimePassed(final TimerHandler pTimerHandler) {

						mEngine.unregisterUpdateHandler(pTimerHandler);
						ResourcesManagerLoader.getInstance()
								.loadInformasiPengembanResources();
						inpengScene = new InformasiPengembang();
						setSceneForLayoutBaseGame(inpengScene);
					}
				}));

	}

}
