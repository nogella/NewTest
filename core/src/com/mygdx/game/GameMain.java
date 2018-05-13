package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import scenes.MainMenu;

public class GameMain extends Game {
    private SpriteBatch batch;
    Sprite player;
	
	@Override
	public void create () {
	    batch = new SpriteBatch();
	    setScreen(new MainMenu(this));
	}

	@Override
	public void render () {
	    super.render(); // pass the render method to all the other screens
	}

	public SpriteBatch getBatch() {
	    return this.batch;
    }

	@Override
	public void dispose () {
		batch.dispose();
	}
}
