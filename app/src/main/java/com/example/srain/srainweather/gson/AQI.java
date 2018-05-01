package com.example.srain.srainweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Project: SrainWeather
 * Date: 2018/5/1
 *
 * @author srain
 */
public class AQI {

    public AqiCity city;

    public class AqiCity {

        public String aqi;

        public String pm25;

        @SerializedName("qlty")
        public String quality;

    }

}
