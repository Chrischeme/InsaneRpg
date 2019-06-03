package com.mygdx.insanerpg.desktop.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.insanerpg.desktop.InsaneRpg;

public class MenuState extends State {
    private Texture background;
    private Texture startBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("menu_screen.png");
        startBtn = new Texture("start_button.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();

        sb.draw(background,0,0, InsaneRpg.WIDTH, InsaneRpg.HEIGHT);
        sb.draw(startBtn,(InsaneRpg.WIDTH / 2) - (startBtn.getWidth() / 2),(InsaneRpg.HEIGHT / 2) - (startBtn.getHeight() / 2));
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        startBtn.dispose();
    }
}
