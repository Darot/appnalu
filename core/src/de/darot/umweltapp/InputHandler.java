package de.darot.umweltapp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import static de.darot.umweltapp.Variables.*;

/**
 * Created by daniel on 21.06.17.
 */
public class InputHandler {

    public void update() {

        // reset all variables
        UP_TOUCHED = false;
        DOWN_TOUCHED = false;
        LEFT_TOUCHED = false;
        RIGHT_TOUCHED = false;

        // set boolean to true if key is touched
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            LEFT_TOUCHED = true;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            DOWN_TOUCHED = true;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            RIGHT_TOUCHED = true;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            UP_TOUCHED = true;
        }
    }

}
