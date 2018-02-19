package de.darot.umweltapp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static de.darot.umweltapp.Variables.VIEWPORT_HEIGHT;
import static de.darot.umweltapp.Variables.VIEWPORT_WIDTH;

public class UmweltGame extends ApplicationAdapter {

    private SpriteBatch sb;
    private OrthographicCamera cam;
    private Player player;
    private InputHandler inputHandler;
    private float delta;

    @Override
    public void create() {
        cam = new OrthographicCamera();
        cam.setToOrtho(false, VIEWPORT_WIDTH, VIEWPORT_HEIGHT);
        sb = new SpriteBatch();
        sb.setProjectionMatrix(cam.combined);
        player = new Player();
        inputHandler = new InputHandler();

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        delta = Gdx.graphics.getDeltaTime();
        
        inputHandler.update();
        player.update(delta);

        sb.begin();
        player.render(sb);
        sb.end();
    }

    @Override
    public void dispose() {
        sb.dispose();
    }
}
