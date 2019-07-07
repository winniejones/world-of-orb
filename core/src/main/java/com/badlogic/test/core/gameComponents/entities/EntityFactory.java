package com.badlogic.test.core.gameComponents.entities;

import com.badlogic.gdx.utils.Json;
import com.badlogic.test.core.coreComponents.Component;
import com.badlogic.test.core.coreComponents.graphics.NPCGraphicsComponent;
import com.badlogic.test.core.coreComponents.graphics.PlayerGraphicsComponent;
import com.badlogic.test.core.coreComponents.input.NPCInputComponent;
import com.badlogic.test.core.coreComponents.input.PlayerInputComponent;
import com.badlogic.test.core.coreComponents.physics.NPCPhysicsComponent;
import com.badlogic.test.core.coreComponents.physics.PlayerPhysicsComponent;

public class EntityFactory {
    private static Json json = new Json();

    public static enum EntityType {
        PLAYER,
        DEMO_PLAYER,
        NPC
    }

    public static String PLAYER_CONFIG = "scripts/player.json";

    static public Entity getEntity(EntityType entityType) {
        Entity entity = null;
        switch(entityType) {
            case PLAYER:
                entity = new Entity(new PlayerInputComponent(), new PlayerPhysicsComponent(), new PlayerGraphicsComponent());
                entity.setEntityConfig(Entity.getEntityConfig(EntityFactory.PLAYER_CONFIG));
                entity.sendMessage( Component.MESSAGE.LOAD_ANIMATIONS, json.toJson(entity.getEntityConfig()));
                return entity;

            case DEMO_PLAYER:
                entity = new Entity(
                        new NPCInputComponent(),
                        new PlayerPhysicsComponent(),
                        new PlayerGraphicsComponent());
                return entity;

            case NPC:
                entity = new Entity(
                        new NPCInputComponent(),
                        new NPCPhysicsComponent(),
                        new NPCGraphicsComponent());
                return entity;
            default:
                return null;
        }
    }
}