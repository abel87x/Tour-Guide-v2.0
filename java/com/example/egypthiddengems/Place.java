package com.example.egypthiddengems;

public class Place {

    private int mPlaceImageResource;
    private String mPlaceName;
    private String mPlaceDescription;

    public Place(int placeImageResource, String placeName, String placeDescription) {

        this.mPlaceImageResource = placeImageResource;
        this.mPlaceDescription = placeDescription;
        this.mPlaceName = placeName;
    }

    public int getPlaceImageResource() {
        return mPlaceImageResource;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }
}
