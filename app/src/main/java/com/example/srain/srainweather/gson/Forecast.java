package com.example.srain.srainweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Project: SrainWeather
 * Date: 2018/5/1
 *
 * @author srain
 */
public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

    public class Temperature {

        public String max;

        public String min;

    }


}
