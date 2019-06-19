package com.mygdx.towerdefense;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx; //using this to log whats going on
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TowerDefenseWithFriends extends Game {
	SpriteBatch batch;
	Texture img;

	public static final String TITLE = "Bomberman"; //title of the game
	@Override
	public void create() {
		setScreen(new LoadScreen());
		//Gdx.app.log(TITLE,"create()"); // (tag,message)
	}

	@Override
	public void dispose() {
		super.dispose(); //Game's dispose();
		//Gdx.app.log(TITLE,"dispose()"); //these log whats happening
	}
	@Override
	public void render(){
		super.render();
		//Gdx.app.log(TITLE,"render"); //it keeps rendering until you click X button
	}
	@Override
	public void resize(int width, int height){
		super.resize(width, height);
		//Gdx.app.log(TITLE,"resize(..)");
	}
	@Override
	public void pause(){
		super.pause();
		//Gdx.app.log(TITLE,"pause()");
	}
	public void resume(){
		super.resume();
		//Gdx.app.log(TITLE,"resume()");
	}



/*	public void create() {
		batch = new SpriteBatch();
		img = new Texture("rpgwithfriends.png");
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1); //background color
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // uses the gdx gotta learn this
		batch.begin();
		batch.draw(img, 0, 0); //actually draws the image
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	} */
}
