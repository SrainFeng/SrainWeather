package com.example.srain.srainweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Project: SrainWeather
 * Date: 2018/5/1
 *
 * @author srain
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
