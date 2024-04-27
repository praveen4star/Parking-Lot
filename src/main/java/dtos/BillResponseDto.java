package dtos;

import models.Bill;
import models.constants.ResponseStatus;

public class BillResponseDto {
    private Bill bill;
    private String messsage;
    private ResponseStatus status;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
