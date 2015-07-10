package com.granzginz.base;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.Camera;
import org.andengine.entity.scene.Scene;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;

import com.granzginz.main.ActivityManagerGame;
import com.granzginz.manager.ResourcesManagerAsset;
import com.granzginz.manager.SceneManager.LayoutSceneType;

public abstract class LayoutGameBaseScene extends Scene {

	public LayoutGameBaseScene() {

		this.resourcesManagerAsset = ResourcesManagerAsset.getInstance();
		this.activityManagerGame = ActivityManagerGame.getInstance();
		this.layoutgame_engine = resourcesManagerAsset.layout_engine;
		this.layoutgame_activity = resourcesManagerAsset.layoutgame_activity;
		this.layoutgame_vbom = resourcesManagerAsset.layoutgame_vbom;
		this.layoutgame_camera = resourcesManagerAsset.layoutcamera;
		this.sp = resourcesManagerAsset.sp;
		this.intent = activityManagerGame.intent;
		createScene();
	}

	protected ActivityManagerGame activityManagerGame;

	protected Intent intent;

	protected Activity layoutgame_activity;

	protected Camera layoutgame_camera;

	protected Engine layoutgame_engine;

	protected VertexBufferObjectManager layoutgame_vbom;

	protected SharedPreferences sp;

	protected ResourcesManagerAsset resourcesManagerAsset;

	public abstract void createScene();

	public abstract void disposeScene();

	public abstract LayoutSceneType getSceneType();

	public abstract void onBackKeyPressed();
}
