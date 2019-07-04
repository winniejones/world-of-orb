package com.badlogic.test.core;

import com.badlogic.gdx.Game;
import com.badlogic.test.core.screens.MainGameScreen;


public class WorldOfOrbGame extends Game {

	MainGameScreen mainGameScreen = new MainGameScreen();
	
	@Override
	public void create () {
		setScreen(mainGameScreen);
	}
	
	@Override
	public void dispose () {
		mainGameScreen.dispose();
	}
}
