package scenes;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.GameMain;

import helpers.GameInfo;

/**
 * Created by Home on 26/11/2017.
 * Tutorial Lesson 4
 * Will hold all the scenes
 */

public class MainMenu implements Screen{

    private GameMain game;      // holds GameMain and its spritebatch
    private Texture bg;
    private Sprite player;

    // CONSTRUCTOR
    public MainMenu(GameMain game){

        this.game = game;   // we have GameMain so we can use the spritebatch
        bg = new Texture("SecBgd.png");
        player = new Sprite(new Texture("player.png"));
        player.setPosition((GameInfo.WIDTH - player.getWidth())/2, (GameInfo.HEIGHT - player.getHeight())/2);
    }

    @Override  // equivalent to create but we are using the constructor
    public void show() {    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0, 0, 0, 1);  // black background
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);   // 0.85f on R + G is OK

        player.setPosition(player.getX() - 1, player.getY());

        game.getBatch().begin();
        game.getBatch().draw(bg, 0, 0);
        game.getBatch().draw(player, player.getX(), player.getY());
        game.getBatch().end();
    }

    @Override
    public void resize(int width, int height) {    }

    @Override
    public void pause() {    }

    @Override
    public void resume() {    }

    @Override
    public void hide() {    }

    @Override
    public void dispose() {    }
}
