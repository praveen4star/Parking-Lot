package controller;

import dtos.BillRequestDto;
import dtos.BillResponseDto;
import service.BillService;

public class BillController {
    private BillService billService;
    public BillController() {
        billService = new BillService();
    }
    public BillResponseDto generateBill(BillRequestDto billRequestDto) {
        return null;
    }
}
