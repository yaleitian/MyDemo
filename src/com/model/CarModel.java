package com.model;

public class CarModel {
    private  String carName;
    private int carAge;
    private String carMaster;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getCarMaster() {

        return carMaster;
    }

    public void setCarMaster(String carMaster) {
        this.carMaster = carMaster;
    }

    @Override
    public String toString() {
        return " [carName:" + carName + " ,carAge:" + carAge + " ,carMaster:" + carMaster + "]";
    }
}
