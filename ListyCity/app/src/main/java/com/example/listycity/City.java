package com.example.listycity;

import java.util.Objects;

/**
 * A class that defines a City.
 * */
public class City implements Comparable<City> {
    /** City name */
    private final String city;
    /**Province name */
    private final String province;

    /**
     * Construct a City object.
     * @param city city name
     * @param province province name
     * */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }
    /**
     * Get the city name
     * @return city name
     * */
    public String getCityName(){
        return this.city;
    }

    /**
     * Get the province name
     * @return province name
     * */
    public String getProvinceName() {
        return this.province;
    }

    /***
     * Compare 2 City objects by city name
     * @param other another City
     * @return -/0/+ depending on order
     */
    @Override
    public int compareTo(City other){
        return this.city.compareTo(other.getCityName());
    }
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if (!(o instanceof City)) {
            return false;
        }
        City city1 = (City) o;

        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }
    @Override public int hashCode(){
        return Objects.hash(city, province);
    }
}
