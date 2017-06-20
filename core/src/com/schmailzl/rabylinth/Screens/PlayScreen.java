package com.schmailzl.rabylinth.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.schmailzl.rabylinth.Rabylinth;

/**
 * Created by Sebastian on 19.06.2017.
 */

public class PlayScreen implements Screen {

    private Rabylinth game;
    Texture texture;
    private OrthographicCamera gameCam;
    private Viewport gamePort;

    public PlayScreen(Rabylinth game){
        this.game = game;
        texture = new Texture("badlogic.jpg");
        gameCam = new OrthographicCamera();
        gamePort = new FitViewport(Rabylinth.V_WIDTH, Rabylinth.V_HEIGHT, gameCam);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(texture, 0, 0);
        game.batch.end();

    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
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
