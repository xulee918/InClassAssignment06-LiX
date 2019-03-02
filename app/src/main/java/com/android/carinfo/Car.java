package com.android.carinfo;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private boolean convertible;
    private String type;

    public Car(String brand, boolean convertible, String type) {
        this.brand = brand;
        this.convertible = convertible;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isConvertible() {
        return convertible;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nConvertible: " + convertible + "\nType: " + type;
    }
}
