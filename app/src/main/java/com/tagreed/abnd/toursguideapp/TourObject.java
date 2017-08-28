package com.tagreed.abnd.toursguideapp;

/**
 * Created by Tagreed on 8/26/2017.
 */

public class TourObject {
    private static final int No_Image = -1;
    private String mobjName;
    private String mObjInfo;
    private int mObjImage = No_Image;

    public TourObject(String mobjName, String mObjInfo) {
        this.mobjName = mobjName;
        this.mObjInfo = mObjInfo;
    }

    public TourObject(String mobjName, String mObjInfo, int mObjImage) {
        this.mobjName = mobjName;
        this.mObjInfo = mObjInfo;
        this.mObjImage = mObjImage;
    }

    public String getMobjName() {
        return mobjName;
    }

    public String getmObjInfo() {
        return mObjInfo;
    }

    public int getmObjImage() {
        return mObjImage;
    }

    public boolean hasImage() {
        return mObjImage != No_Image;
    }
}
