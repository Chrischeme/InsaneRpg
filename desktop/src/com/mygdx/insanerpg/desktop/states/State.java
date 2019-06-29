package com.mygdx.insanerpg.desktop.states;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {
    protected Camera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;
    private Batch b;

    protected State(GameStateManager gsm) {
        this.gsm = gsm;
        mouse = new Vector3();
        this.cam = cam;
    }

    public Batch getB() {
        return b;
    }

    protected abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(Batch b);
    public abstract void dispose();
}
