package com.example.washere.chap9;

public class HeaderTextProcessing extends ProcessingObject<String> {

    public String handleWork(String text) {
        return "From Raoul, Mario and Alan : " + text;
    }
}