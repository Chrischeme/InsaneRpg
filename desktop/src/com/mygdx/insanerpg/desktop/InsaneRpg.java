package com.mygdx.insanerpg.desktop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.insanerpg.desktop.states.GameStateManager;
import com.mygdx.insanerpg.desktop.states.MenuState;

public class InsaneRpg extends ApplicationAdapter {
	public static final int HEIGHT = 480;
	public static final int WIDTH = 720;

	public static final String TITLE = "Insane RPG";
	private GameStateManager gsm;

	private SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		gsm = new GameStateManager();
		Gdx.gl.glClearColor(1, 3, 1, 1);
		gsm.push(new MenuState(gsm));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
}