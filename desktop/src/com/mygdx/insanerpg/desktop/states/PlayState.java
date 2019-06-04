package com.mygdx.insanerpg.desktop.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.insanerpg.desktop.InsaneRpg;

public class PlayState extends State {

    private Texture player;
    public PlayState(GameStateManager gsm) {
        super(gsm);
        player = new Texture("player.png");
        cam.lookAt(20, 20, 20);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(player, 50, 50);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
