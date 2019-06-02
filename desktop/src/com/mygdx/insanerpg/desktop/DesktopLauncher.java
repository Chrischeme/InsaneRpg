package com.mygdx.insanerpg.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import InsaneRpg;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new InsaneRpg(), config);
		config.width = InsaneRpg.WIDTH;
		config.height = InsaneRpg.HEIGHT;
		config.title = InsaneRpg.TITLE;
	}
}
