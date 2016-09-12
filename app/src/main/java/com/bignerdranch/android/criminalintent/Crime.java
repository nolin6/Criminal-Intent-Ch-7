package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by Nate on 9/8/2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // Genereate unique identifier
        mId = UUID.randomUUID();
    }

    //Generate getter for UUID
    public UUID getId() {
        return mId;
    }

    //Generate getter and setting for title
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
