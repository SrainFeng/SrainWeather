package com.example.srain.srainweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Project: SrainWeather
 * Date: 2018/5/1
 *
 * @author srain
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
