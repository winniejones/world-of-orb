package com.badlogic.test.core.audio;

public interface AudioSubject {
    public void addObserver(AudioObserver audioObserver);
    public void removeObserver(AudioObserver audioObserver);
    public void removeAllObservers();
    public void notify(final AudioObserver.AudioCommand command, AudioObserver.AudioTypeEvent event);
}