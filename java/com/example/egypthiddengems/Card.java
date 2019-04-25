package com.example.egypthiddengems;

public class Card {
    private int mCardImageResource;
    private String mCardName;

    public Card(int resource, String name) {
        this.mCardImageResource = resource;
        this.mCardName = name;
    }

    //Returns the city name to be used in the list item
    public String getCardName() {
        return mCardName;
    }

    //Returns the image resource id to be used in the list item
    public int getCardImageResource() {
        return mCardImageResource;
    }
}
