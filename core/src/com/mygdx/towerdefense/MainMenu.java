//main menu class with the play / exit buttons
package com.mygdx.towerdefense;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
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
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MainMenu implements Screen {
    private Stage stage;
    private Table table;
    private TextButton buttonPlay, buttonExit;
    private Label heading; //displaying text when import shortcut on keyboard
    private Skin skin; //appearance of button
    private BitmapFont black, white;
    private TextureAtlas atlas; // for the button background
    private Sprite splash; //the picture ---copied from splash
    private SpriteBatch batch; //the frame we're drawing on --- copied from splash
    private MapRepository mapRepository;
    private StateRepository stateRepository;

    public MainMenu(MapRepository mapRepository, StateRepository stateRepository) {
        this.mapRepository = mapRepository;
        this.stateRepository = stateRepository;
    }

    @Override
    public void show() {
        final MainMaps mainMaps = new MainMaps(mapRepository,stateRepository);

        batch = new SpriteBatch(); // the paper
        Texture splashTexture = new Texture("splash.png"); // new texture splash.png
        splash = new Sprite(splashTexture); // makes a picture from the texture
        splash.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight()); //the size of the graphics/picture we have
        ///// copied from splash ^^^
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        atlas = new TextureAtlas("ui/button.pack"); //defines the region of sprite image
        skin = new Skin(atlas); //using this for the text button
        table = new Table(skin); //table with the skin's atlas
        table.setBounds(0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight()); //sets the bounds to full screen

        //making fonts
        white = new BitmapFont(Gdx.files.internal("font/white.fnt"),false); //this false is so the chars aren't flipped
        black = new BitmapFont(Gdx.files.internal("font/black.fnt"),false);

        //making the buttons
        TextButtonStyle textButtonStyle = new TextButtonStyle();
        textButtonStyle.up = skin.getDrawable("button.up");
        textButtonStyle.down = skin.getDrawable("button.down");
        textButtonStyle.pressedOffsetX = 1; //when button is pressed, text moves to right by 1
        textButtonStyle.pressedOffsetY = -1;
        textButtonStyle.font = black;

        buttonExit = new TextButton("EXIT",textButtonStyle); // exit button with exit text, and skin of textbuttonstyle
        buttonExit.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit(); //when clicked, exit
            }
        });
        buttonExit.pad(15); //15 pixels around the text -- i didnt even fuckin change the size of the button yet but ok.

        buttonPlay = new TextButton("PLAY",textButtonStyle);
        buttonPlay.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(mainMaps);
                stateRepository.push(mainMaps);
            }
        });
        buttonPlay.pad(15); //15 padding -- no use yet


       //making the heading
        LabelStyle headingStyle = new LabelStyle(white, Color.WHITE); //th(e font, the color of the font (gdx color)
        heading =  new Label(TowerDefenseWithFriends.TITLE, headingStyle);
        heading.setFontScale(2); //doubles the font size

        //putting the things into the table
        table.add(heading);
        table.getCell(heading).spaceBottom(10); //get the cell that contains heading, space 10 pixels from next line
        table.row(); // basically nextlining after heading
        table.padBottom(1); //space of the table from the bottom
        table.add(buttonPlay);
        table.row(); // exit is now on another row
        table.add(buttonExit);
        table.debug();
        stage.addActor(table);



    }

    @Override
    public void render(float delta) {
            Gdx.gl.glClearColor(1,0,0,1);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            stage.act(delta); //update everything in it
            batch.begin(); //have to begin and end (open the paper) --- copied from splash
            splash.draw(batch); //draw splash on the batch / paper  --- copied from splash
            batch.end(); // --- copied from splash
            stage.draw(); // draws the buttons and table etc
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
        stage.dispose();
        atlas.dispose();
        skin.dispose();
        white.dispose();
        black.dispose();
    }
}
