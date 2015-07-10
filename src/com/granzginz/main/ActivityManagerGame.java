package com.granzginz.main;

import android.content.Intent;

public class ActivityManagerGame {

	public static ActivityManagerGame getInstance() {

		return INSTANCE;
	}

	private static final ActivityManagerGame INSTANCE = new ActivityManagerGame();

	public Intent intent;

	public Intent getIntent() {

		return intent;
	}

	public void setIntent(Intent intent) {

		this.intent = intent;
	}

}
