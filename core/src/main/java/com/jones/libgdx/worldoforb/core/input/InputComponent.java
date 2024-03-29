package com.jones.libgdx.worldoforb.core.input;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.utils.Json;
import com.jones.libgdx.worldoforb.Entity;
import com.jones.libgdx.worldoforb.core.Component;
import com.jones.libgdx.worldoforb.core.ComponentSubject;

import java.util.HashMap;
import java.util.Map;

public abstract class InputComponent extends ComponentSubject implements Component, InputProcessor {

    protected Entity.Direction _currentDirection = null;
    protected Entity.State _currentState = null;
    protected Json _json;

    protected enum Keys {
        LEFT, RIGHT, UP, DOWN, QUIT, PAUSE, ACTION
    }

    protected enum Mouse {
        SELECT, DOACTION
    }

    protected static Map<Keys, Boolean> keys = new HashMap<Keys, Boolean>();
    protected static Map<Mouse, Boolean> mouseButtons = new HashMap<Mouse, Boolean>();

    //initialize the hashmap for inputs
    static {
        keys.put(Keys.LEFT, false);
        keys.put(Keys.RIGHT, false);
        keys.put(Keys.UP, false);
        keys.put(Keys.DOWN, false);
        keys.put(Keys.QUIT, false);
        keys.put(Keys.PAUSE, false);
        keys.put(Keys.ACTION, false);
    };

    static {
        mouseButtons.put(Mouse.SELECT, false);
        mouseButtons.put(Mouse.DOACTION, false);
    };

    InputComponent(){
        _json = new Json();
    }

    public abstract void update(Entity entity, float delta);

}
