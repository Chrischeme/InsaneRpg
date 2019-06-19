package com.mygdx.towerdefense;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;


//gotta pass state repository to map, for back button

public class Map implements Screen {
    private Sprite splash; //the picture
    private SpriteBatch batch; //the frame we're drawing on
    //private int mode;
    private Stage stage;
    private Table table;
    private TextButton buttonBack;
    private Label heading; //displaying text when import shortcut on keyboard
    private Skin skin; //appearance of button
    private BitmapFont black, white;
    private TextureAtlas atlas; // for the button background
    private Texture splashTexture;
    private StateRepository stateRepository;
    private Sprite player;
    private int lmao = 0;
    private int kek = 5;
    boolean isPressedUP, isPressedDOWN, isPressedRIGHT, isPressedLEFT, isPressedW, isPressedS, isPressedD, isPressedA, isPressedSPACE, isPressedSHIFT;
    boolean dirUP = false;
    boolean dirDOWN = false;
    boolean dirLEFT = false;
    boolean dirRIGHT = false;

    public Map (Texture texture, final StateRepository stateRepository) {
        this.splashTexture = texture; // gonna take in a texture instead of int
        this.stateRepository = stateRepository;
    }

    @Override
    public void show() {
        batch = new SpriteBatch(); // the paper
        splash = new Sprite(splashTexture); // makes a picture from the texture
        splash.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight()); //the size of the graphics/picture we have


        //player
        Texture playerTexture = new Texture("player.png"); // new texture splash.png
        player = new Sprite(playerTexture); // makes a picture from the texture
        player.setSize(50,50);
        player.setPosition(615,345);


        ///// copied from splash ^^^
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        atlas = new TextureAtlas("ui/button.pack"); //defines the region of sprite image
        skin = new Skin(atlas); //using this for the text button
        table = new Table(skin); //table with the skin's atlas
        //table.setBounds(500, 300, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()); //sets the bounds to full screen
        table.setBounds(1050, 600, 100,100 ); // coordinates, size

        //making fonts
        white = new BitmapFont(Gdx.files.internal("font/white.fnt"), false); //this false is so the chars aren't flipped
        black = new BitmapFont(Gdx.files.internal("font/black.fnt"), false);

        //making the buttons
        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.up = skin.getDrawable("button.up");
        textButtonStyle.down = skin.getDrawable("button.down");
        textButtonStyle.pressedOffsetX = 1; //when button is pressed, text moves to right by 1
        textButtonStyle.pressedOffsetY = -1;
        textButtonStyle.font = black;

        buttonBack = new TextButton("BACK", textButtonStyle);
        buttonBack.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game) Gdx.app.getApplicationListener()).setScreen(stateRepository.peek());
            }
        });



        LabelStyle headingStyle = new LabelStyle(white, Color.WHITE); //th(e font, the color of the font (gdx color)
        heading =  new Label(TowerDefenseWithFriends.TITLE, headingStyle);
        heading.setFontScale(2); //doubles the font size
        table.add(heading);
        table.getCell(heading).spaceBottom(10); //get the cell that contains heading, space 10 pixels from next line
        table.row(); // basically nextlining after heading
        table.padBottom(1); //space of the table from the bottom
        table.row(); // exit is now on another row
        table.add(buttonBack);
        table.debug();
        stage.addActor(table);


    }





    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(delta); //update everything in it
        batch.begin(); //have to begin and end (open the paper) --- copied from splash
        splash.draw(batch); //draw splash on the batch / paper  --- copied from splash
        player.draw(batch);



        isPressedUP = Gdx.input.isKeyPressed(Input.Keys.UP);
        isPressedDOWN = Gdx.input.isKeyPressed(Input.Keys.DOWN);
        isPressedRIGHT = Gdx.input.isKeyPressed(Input.Keys.RIGHT);
        isPressedLEFT =  Gdx.input.isKeyPressed(Input.Keys.LEFT);

        isPressedW = Gdx.input.isKeyPressed(Input.Keys.W);
        isPressedS = Gdx.input.isKeyPressed(Input.Keys.S);
        isPressedD = Gdx.input.isKeyPressed(Input.Keys.D);
        isPressedA = Gdx.input.isKeyPressed(Input.Keys.A);


        isPressedSHIFT = Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT);
        isPressedSPACE = Gdx.input.isKeyPressed(Input.Keys.SPACE);
       /* dirDOWN = false;
        dirLEFT = false;
        dirRIGHT = false;
        dirUP = false; */



        if (isPressedUP == true || isPressedW == true)
        {
            if(isPressedSHIFT == true) {
                player.translate(0, 2*kek);  //kek, kek
            }
            else {
                player.translate(0, kek);  //kek, kek
            }
            if(isPressedSPACE == true)
            {
                player.translate(0,10*kek);
            }
            //dirUP = true; //maybe other dir gotta be false after
        }
        if (isPressedDOWN == true || isPressedS == true)
        {
            if(isPressedSHIFT == true) {
                player.translate(0, -2*kek);  //kek, kek
            }
            else {
                player.translate(0, -kek);  //kek, kek
            }
            if(isPressedSPACE == true)
            {
                player.translate(0,-10*kek);
            }
           // dirDOWN = true;
        }
        if (isPressedLEFT == true || isPressedA == true)
        {
            if(isPressedSHIFT == true) {
                player.translate(-2*kek, 0);  //kek, kek
            }
            else {
                player.translate(-kek, 0);  //kek, kek
            }
            if(isPressedSPACE == true)
            {
                player.translate(-10*kek,0);
            }
           // dirLEFT = true;
        }
        if (isPressedRIGHT == true || isPressedD == true)
        {
            if(isPressedSHIFT == true) {
                player.translate(2*kek, 0);  //kek, kek
            }
            else {
                player.translate(kek, 0);  //kek, kek
            }
            if(isPressedSPACE == true)
            {
                player.translate(10*kek,0);
            }
          //  dirRIGHT = true;
        }
        /* if (isPressedSPACE == true)
        {
           if (dirUP == true)
            {
                player.translate(0, kek*10);
            }
            if (dirDOWN == true)
            {
                player.translate(0, -kek*10);
            }
            if (dirLEFT == true)
            {
                player.translate(-kek * 10, 0);
            }
            if (dirRIGHT == true)
            {
                player.translate(kek * 10, 0);
            }

        } */

        /*if (lmao == 0) {
            player.translate(kek, kek);  //kek, kek
        }
        if (lmao == 1) {
            player.translate(0, -kek); // 0,-kek
        }
        if (lmao == 2) {
            player.translate(-kek, kek); // -kek+1,kek
        }
        if (lmao == 3) {
            player.translate(0, -kek); // 0,-kek
        }
        if (lmao >3)
        {
            lmao = 0;
        }
        kek++;
        lmao++; */


        batch.end(); // --- copied from splash
        stage.draw(); //




        /*  spriteBatch.begin();
        bug.translate(xdeg, ydeg);
        bug.draw(spriteBatch);
        spriteBatch.end();
        */
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
