package de.darot.umweltapp.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.darot.umweltapp.UmweltGame;

import static de.darot.umweltapp.Variables.V_HEIGHT;
import static de.darot.umweltapp.Variables.V_WIDTH;

public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = V_WIDTH;
        config.height = V_HEIGHT;
        new LwjglApplication(new UmweltGame(), config);

    }
}
