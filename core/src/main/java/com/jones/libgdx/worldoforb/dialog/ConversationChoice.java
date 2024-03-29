package com.jones.libgdx.worldoforb.dialog;

public class ConversationChoice {
    private String sourceId;
    private String destinationId;
    private String choicePhrase;
    private ConversationGraphObserver.ConversationCommandEvent conversationCommandEvent;

    public ConversationChoice(){}

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId){
        this.sourceId = sourceId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId){
        this.destinationId = destinationId;
    }

    public String getChoicePhrase() {
        return choicePhrase;
    }

    public void setChoicePhrase(String choicePhrase) {
        this.choicePhrase = choicePhrase;
    }

    public ConversationGraphObserver.ConversationCommandEvent getConversationCommandEvent() {
        return conversationCommandEvent;
    }

    public void setConversationCommandEvent(ConversationGraphObserver.ConversationCommandEvent choiceCommand) {
        this.conversationCommandEvent = choiceCommand;
    }

    public String toString(){
        return choicePhrase;
    }
}
