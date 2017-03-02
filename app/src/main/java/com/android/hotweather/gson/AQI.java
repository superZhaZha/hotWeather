package com.android.hotweather.gson;

/**
 * Created by Dearwuer on 2017/3/2 0002.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
