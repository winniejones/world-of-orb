package com.badlogic.test.core.ui;

public interface StatusObserver {
    public static enum StatusEvent {
        UPDATED_GP,
        UPDATED_LEVEL,
        UPDATED_HP,
        UPDATED_MP,
        UPDATED_XP,
        LEVELED_UP
    }

    void onNotify(final int value, StatusEvent event);
}