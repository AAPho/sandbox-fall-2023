package org.example.generics;

public class Message {

    private String message;

    public Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(message);
        return sb.toString();
    }
}
