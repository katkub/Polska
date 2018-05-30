package com.example.android.polska;

import android.os.Parcel;
import android.os.Parcelable;

class Fragments implements Parcelable {

    /**
     * Image resource ID of attraction
     */
    private int img = NO_IMAGE_PROVIDED;

    /**
     * Name of attraction
     */
    private String title;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Main constructor for fragments
     */

    public Fragments(String title, int img) {
        this.img = img;
        this.title = title;
    }

    /**
     * Main constructor specially for citFragment
     */
    public Fragments(String title) {
        this.title = title;
    }

    /**
     * Main constructor for attractionsActivity
     */
    public Fragments(int img, String title) {
        this.title = title;
        this.img = img;
    }

    /**
     * Getters
     */
    public String getTitle() {
        return title;
    }

    public int getImg() {
        return img;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return img != NO_IMAGE_PROVIDED;
    }

    //write object values to parcel for storage
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(img);
        dest.writeString(title);
    }

    //constructor used for parcel
    public Fragments(Parcel parcel) {
        //read and set saved values from parcel
        img = parcel.readInt();
        title = parcel.readString();
    }

    //creator - used when un-parceling our parcle (creating the object)
    public static final Parcelable.Creator<Fragments> CREATOR = new Parcelable.Creator<Fragments>() {

        @Override
        public Fragments createFromParcel(Parcel parcel) {
            return new Fragments(parcel);
        }

        @Override
        public Fragments[] newArray(int size) {
            return new Fragments[0];
        }
    };

    @Override
    public int describeContents() {
        return hashCode();
    }

}

