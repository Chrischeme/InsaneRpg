package com.mygdx.insanerpg.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.insanerpg.desktop.states.GameStateManager;
import com.mygdx.insanerpg.desktop.states.MenuState;

public class InsaneRpg implements ApplicationListener {
	public static final int HEIGHT = 480;
	public static final int WIDTH = 720;
	public static final String TITLE = "Insane RPG";

	private GameStateManager gsm;

	
	@Override
	public void create () {
		gsm = new GameStateManager();
		gsm.push(new MenuState(gsm));
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render((gsm.get()).getB());
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}
}