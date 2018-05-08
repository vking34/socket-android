package com.example.vking34.gas.models;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;
import java.util.Locale;

public class PlaceInfo {
    private String id;
    private String name;
    private String address;
    private LatLng latLng;
    private String attributions;
    private List<Integer> placeTypes;
    private String phoneNumber;
    private Locale locale;

    public PlaceInfo(){

    }

    public PlaceInfo(String id, String name, String address, LatLng latLng, String attributions, List<Integer> placeTypes, String phoneNumber, Locale locale) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.latLng = latLng;
        this.attributions = attributions;
        this.placeTypes = placeTypes;
        this.phoneNumber = phoneNumber;
        this.locale = locale;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public String getAttributions() {
        return attributions;
    }

    public void setAttributions(String attributions) {
        this.attributions = attributions;
    }

    public List<Integer> getPlaceTypes() {
        return placeTypes;
    }

    public void setPlaceTypes(List<Integer> placeTypes) {
        this.placeTypes = placeTypes;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    @Override
    public String toString() {
        return "PlaceInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", latLng=" + latLng +
                ", attributions='" + attributions + '\'' +
                ", placeTypes=" + placeTypes +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", locale=" + locale +
                '}';
    }
}
