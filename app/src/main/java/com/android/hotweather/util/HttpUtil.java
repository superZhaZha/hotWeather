package com.android.hotweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Dearwuer on 2017/3/1 0001.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }

}
