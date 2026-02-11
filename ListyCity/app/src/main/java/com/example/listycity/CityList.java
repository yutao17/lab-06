package com.example.listycity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Class that keeps track of a list of city obj
 */
public class CityList {
    /** Internal list that stores City obj*/
    private final List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city This is a candidate city to add
     * @throws IllegalArgumentException if the city already exists
     * */
    public void add(City city) {
        if(cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * Check whether a city is in the list
     * @param city the city to check
     * @return true if the city exists, otherwise return false
     * */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Delete a city from the list if it exists
     * @param city the city to delete
     * @throws IllegalArgumentException if the city does not exist
     * */
    public void delete(City city) {
        if (!hasCity(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
    /**
     * Count how many cities are in the list
     * @return number of cities in the list
     * */
    public int countCities(){
        return cities.size();
    }

    /**
     * This return a sorted list of cities
     * @return Return the sorted list
     * */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }

}




