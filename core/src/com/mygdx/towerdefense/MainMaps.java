//stage where you see all the diff maps to choose from
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

public class MainMaps implements Screen {
    private Stage stage;
    private Table table;
    private TextButton buttonPlay, buttonPlay2,buttonPlay3,buttonPlay4,buttonPlay5,buttonPlay6,buttonPlay7,buttonPlay8,buttonExit;
    private Label heading; //displaying text when import shortcut on keyboard
    private Skin skin; //appearance of button
    private BitmapFont black, white;
    private TextureAtlas atlas; // for the button background
    private Sprite splash; //the picture ---copied from splash
    private SpriteBatch batch; //the frame we're drawing on --- copied from splash
    private MapRepository mapRepository;
    private StateRepository stateRepository;

    public MainMaps(MapRepository mapRepository, StateRepository stateRepository) {
        this.mapRepository = mapRepository;
        this.stateRepository = stateRepository;
    }


    @Override
    public void show() {

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

        buttonPlay = new TextButton("MAP1",textButtonStyle);
        buttonPlay.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(mapRepository.getMap(0));
                //((Game)Gdx.app.getApplicationListener()).setScreen(mapRepository.getMap(0)); //gets the map at index 1
            }
        });
        buttonPlay.pad(15); //15 padding -- no use yet

        buttonPlay2 = new TextButton("MAP2",textButtonStyle);
        buttonPlay2.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(mapRepository.getMap(1));
                // ((Game)Gdx.app.getApplicationListener()).setScreen(mapRepository.getMap(1));
                //should do
                // ((Game)Gdx.app.getApplicationListener()).setScreen(map from the map repository)));
                // ((Game)Gdx.app.getApplicationListener()).setScreen(MapRepository(1));
                //this line should go into MapRepository and open the map from there
                //can make the map here, but have to add it into the repository, repository is there to hold the maps
            }
        });


        /*buttonPlay3.addListener((e,x,y) -> ((Game)Gdx.app.getApplicationListener()).setScreen(new Map(3)));
        // this would work if ClickListener only had one method, but it doesn't. e,x,y represent the
        parameters inside the single method clicked

        buttonPlay3 = new TextButton("PLAY3",textButtonStyle);
        buttonPlay3.addListener(new ClickListener(){ ( ------ e represents the event in clicklistener inherits eventlistener
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(new Map(3));
            }
        }); */
       // buttonplay3.addListener(new EventListener() {
         //                           @Override
           //                         public void handle (Event event) {
             //                           ((Game).....etc
               //                     }
                 //               }
             //   buttonplay3.addListener(e -> {((Game)...etc})

        /*
        buttonPlay3 = new TextButton("PLAY3",textButtonStyle);
        buttonPlay3.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(new Map(new Texture("baglogic.jpg")));
            }
        });






        buttonPlay4 = new TextButton("PLAY4",textButtonStyle);
        buttonPlay4.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(new Map(new Texture("baglogic.jpg")));
            }
        });

        buttonPlay5 = new TextButton("PLAY5",textButtonStyle);
        buttonPlay5.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(new Map(new Texture("baglogic.jpg")));
            }
        });

        buttonPlay6 = new TextButton("PLAY6",textButtonStyle);
        buttonPlay6.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(new Map(new Texture("baglogic.jpg")));
            }
        });

        buttonPlay7 = new TextButton("PLAY7",textButtonStyle);
        buttonPlay7.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(new Map(new Texture("baglogic.jpg")));
            }
        });

        buttonPlay8 = new TextButton("PLAY8",textButtonStyle);
        buttonPlay8.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(new Map(new Texture("baglogic.jpg")));
            }
        });


         */
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
        table.add(buttonPlay2);
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
        stage.draw(); //
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

