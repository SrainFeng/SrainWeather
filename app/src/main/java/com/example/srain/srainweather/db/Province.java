package com.example.srain.srainweather.db;

import org.litepal.crud.DataSupport;

/**
 * Project: SrainWeather
 * Date: 2018/4/30
 *
 * @author srain
 */
public class Province extends DataSupport {

    private int id;

    private String provinceCode;

    private int provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(int provinceName) {
        this.provinceName = provinceName;
    }
}
