package models;

import models.constants.VehicleType;

public class Vehicle extends BaseModel {
    private String model;
    private VehicleType type;
    private String number;
    private String color;
    public Vehicle(int id, String number, String color, String model, VehicleType type){
        super.setId(id);
        this.number = number;
        this.color = color;
        this.model = model;
        this.type = type;
    }
    public VehicleType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }
}
