package com.example.himankrao.dillidarshan;

/**
 * Created by himankrao on 30/4/17.
 */

public class Word {


    private String pName;
    private String pLocation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String placeName, String location) {
        pName = placeName;
        pLocation = location;
    }

    public Word(String placeName, String location, int imageResourceId) {
        pName = placeName;
        pLocation = location;
        mImageResourceId = imageResourceId;
    }


    public String getPlaceName() {
        return pName;
    }


    public String getPlaceLocation() {
        return pLocation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
