package com.granzginz.main;

import java.io.IOException;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.scene.IOnSceneTouchListener;
import org.andengine.entity.scene.Scene;
import org.andengine.input.touch.TouchEvent;
import org.andengine.ui.activity.LayoutGameActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.view.KeyEvent;

import com.granzginz.engineoptions.GameEngineOptions;
import com.granzginz.findthewhy.R;
import com.granzginz.manager.ResourcesManagerAsset;
import com.granzginz.manager.SceneManager;
import com.granzginz.tools.GameCamera;

@SuppressLint("NewApi")
public class Loader extends LayoutGameActivity implements IOnSceneTouchListener {

	private SharedPreferences sharedPreference;

	@Override
	protected int getLayoutID() {

		return R.layout.layoutgame;
	}

	@Override
	protected int getRenderSurfaceViewID() {

		return R.id.game_rendersurfaceview;
	}

	@Override
	public EngineOptions onCreateEngineOptions() {

		return GameEngineOptions.getLayoutGameEngineoptions();
	}

	@Override
	public void onCreateResources(
			OnCreateResourcesCallback pOnCreateResourcesCallback)
			throws IOException {

		ResourcesManagerAsset.prepareManagerLayoutGameActivity(this.getEngine(),
				this, GameCamera.getInstance().getCameraLayoutGame(),
				this.getVertexBufferObjectManager(), this.sharedPreference);

		pOnCreateResourcesCallback.onCreateResourcesFinished();

	}

	@Override
	public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback)
			throws IOException {

		SceneManager.getInstance().createSplashScene(pOnCreateSceneCallback);
	}

	@Override
	public void onPopulateScene(Scene pScene,
			OnPopulateSceneCallback pOnPopulateSceneCallback)
			throws IOException {

		this.mEngine.registerUpdateHandler(new TimerHandler(4f,
				new ITimerCallback() {

					@Override
					public void onTimePassed(final TimerHandler pTimerHandler) {

						mEngine.unregisterUpdateHandler(pTimerHandler);
						SceneManager.getInstance().createMenuScene();
					}
				}));
		pOnPopulateSceneCallback.onPopulateSceneFinished();
	}

	@Override
	public boolean onSceneTouchEvent(Scene pScene, TouchEvent pSceneTouchEvent) {

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK) {
			SceneManager.getInstance().getCurrentScene().onBackKeyPressed();
		}
		return false;
	}

}
