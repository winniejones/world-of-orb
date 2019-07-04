package com.badlogic.test.java;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.test.core.WorldOfOrbGame;

public class WorldOfOrbDesktop {
	public static void main (String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		System.out.println("Bajs");
		config.title = "World Of Orb";
		config.useGL30 = false;
		config.width = 1600;
		config.height = 1200;
		Application app = new LwjglApplication(new WorldOfOrbGame(), config);
		Gdx.app = app;
		//Gdx.app.setLogLevel(Application.LOG_INFO);
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		//Gdx.app.setLogLevel(Application.LOG_ERROR);
		//Gdx.app.setLogLevel(Application.LOG_NONE);
	}
}
