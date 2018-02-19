package de.darot.umweltapp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static de.darot.umweltapp.Variables.*;

/**
 * Created by daniel on 21.06.17.
 */
public class Player {

    private float x, y;
    private Texture ship, ship_up, ship_middle, ship_down;
    private float speed = 60;

    public Player() {
        x = VIEWPORT_WIDTH / 2;
        y = VIEWPORT_HEIGHT / 2;

        loadPlayerTextures();
    }

    public void update(float delta) {
        // update player movement
        if (RIGHT_TOUCHED) {
            x += speed * delta;
        }
        if (LEFT_TOUCHED) {
            x -= speed * delta;
        }
        if (UP_TOUCHED) {
            y += speed * delta;
        }
        if (DOWN_TOUCHED) {
            y -= speed * delta;
        }

        // set ship texture:
        if (UP_TOUCHED == true && DOWN_TOUCHED == false) {
            ship = ship_up;
        } else if (DOWN_TOUCHED == true && UP_TOUCHED == false) {
            ship = ship_down;
        } else {
            ship = ship_middle;
        }

    }

    public void render(SpriteBatch sb) {
        sb.draw(ship_middle, x, y);
    }

    public void loadPlayerTextures() {
        ship_middle = new Texture("ship_down.png");
        ship_up = new Texture("ship_up.png");
        ship_down = new Texture("ship_down.png");
    }
}
