package com.android.hotweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dearwuer on 2017/3/2 0002.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
