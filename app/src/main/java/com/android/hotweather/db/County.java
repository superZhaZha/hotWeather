package com.android.hotweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Dearwuer on 2017/3/1 0001.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {

        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public String getCountyName() {
        return countyName;
    }
}
