package com.schmailzl.rabylinth.Scenes;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.schmailzl.rabylinth.Rabylinth;

/**
 * Created by Sebastian on 19.06.2017.
 */

public class Hud {

    public Stage stage;
    private Viewport viewport;

    private int worldTimer;
    private float timeCount;
    private Integer score;

    Label countdownLabel;
    Label scoreLabel;
    Label timeLabel;
    Label levelLabel;
    Label worldLabel;
    Label marioLabel;

    public Hud(SpriteBatch spriteBatch){
        worldTimer = 300;
        timeCount = 0;
        score = 0;

        viewport = new FitViewport(Rabylinth.V_WIDTH, Rabylinth.V_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, spriteBatch);

    }
}
