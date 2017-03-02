package com.android.hotweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Dearwuer on 2017/3/2 0002.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
