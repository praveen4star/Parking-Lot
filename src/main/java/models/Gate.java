package models;

import models.constants.GateStatus;
import models.constants.GateType;

public class Gate extends BaseModel {
    private GateType type;
    private Operator operator;
    private GateStatus status;

}
