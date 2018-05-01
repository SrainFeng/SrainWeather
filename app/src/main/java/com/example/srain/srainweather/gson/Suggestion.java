package com.example.srain.srainweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Project: SrainWeather
 * Date: 2018/5/1
 *
 * @author srain
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("brf")
        public String brief;

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("brf")
        public String brief;

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("brf")
        public String brief;

        @SerializedName("txt")
        public String info;

    }

}
