package com.android.hotweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dearwuer on 2017/3/2 0002.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
