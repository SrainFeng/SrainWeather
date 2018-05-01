package com.example.srain.srainweather.util;

import android.text.TextUtils;

import com.example.srain.srainweather.db.City;
import com.example.srain.srainweather.db.County;
import com.example.srain.srainweather.db.Province;
import com.example.srain.srainweather.gson.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Project: SrainWeather
 * Date: 2018/4/30
 *
 * @author srain
 */
public class Utility {

    /**
     * 解析服务器传回来的省份信息，并保存到数据库Province表单中
     * @param response json数据
     * @return boolean，表示解析成功与否
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvince = new JSONArray(response);
                for (int i = 0; i < allProvince.length(); i++) {
                    JSONObject provinceObject = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析服务器传回来的城市信息，并保存到数据库City表单中
     * @param response json数据
     * @param provinceId 该城市所在省份的Id
     * @return boolean，表示解析成功与否
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析服务器传回来的县镇信息，并保存到数据库County表单中
     * @param response json数据
     * @param cityId 该县所在城市的Id
     * @return boolean，表示解析成功与否
     */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounty = new JSONArray(response);
                for (int i = 0; i < allCounty.length(); i++) {
                    JSONObject countyObject = allCounty.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static Weather handleWeatherResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            Weather weather = new Gson().fromJson(weatherContent, Weather.class);
            MyLog.d("Utility", weather.forecastList.get(0).temperature.max);
            return weather;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
