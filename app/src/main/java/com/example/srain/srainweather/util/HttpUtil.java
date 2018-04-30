package com.example.srain.srainweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Project: SrainWeather
 * Date: 2018/4/30
 *
 * @author srain
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
