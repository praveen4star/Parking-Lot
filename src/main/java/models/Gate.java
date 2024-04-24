package models;

import models.constants.GateStatus;
import models.constants.GateType;

public class Gate extends BaseModel {
    private GateType type;
    private String operator;
    private GateStatus status;
    private int parkingFloorNumber;

    public Gate(int id, GateType type, String operator, GateStatus status, int parkingFloorNumber){
        super.setId(id);
        this.type = type;
        this.operator = operator;
        this.status = status;
        this.parkingFloorNumber = parkingFloorNumber;
    }
    public int getParkingFloorNumber() {
        return parkingFloorNumber;
    }
}
