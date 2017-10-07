package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Emma Buchheim on 9/28/2017.
 */

public class Earthquake {

    private String mUrl;

    private double mMagnitude;

    private long mTimeInMilliseconds;

    private String mLocation;

    private String mDate;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;

        Date dateObject = new Date(timeInMilliseconds);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        String dateToDisplay = dateFormatter.format(dateObject);
        mDate = dateToDisplay;
    }

    public String getUrl() {
        return mUrl;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }



}
