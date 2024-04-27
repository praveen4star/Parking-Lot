package controller;

import dtos.BillRequestDto;
import dtos.BillResponseDto;
import models.constants.ResponseStatus;
import service.BillService;

public class BillController {
    private BillService billService;
    public BillController() {
        billService = new BillService();
    }
    public BillResponseDto generateBill(BillRequestDto billRequestDto) {
        try {
//            if(billRequestDto.getTicketId() == 0 || billRequestDto.getParkingLotId() == 0 || billRequestDto.getExitTime() == null || billRequestDto.getGateId() == 0){
//                throw new Exception("Invalid request data");
//            }
            BillResponseDto billResponseDto = new BillResponseDto();
            billResponseDto.setBill(billService.generateBill(billRequestDto.getTicketId(), billRequestDto.getParkingLotId(), billRequestDto.getExitTime(), billRequestDto.getGateId()));
            billResponseDto.setStatus(ResponseStatus.SUCCESS);
            billResponseDto.setMesssage("Bill generated successfully");
            return billResponseDto;
        }
        catch (Exception e) {
            BillResponseDto billResponseDto = new BillResponseDto();
            billResponseDto.setStatus(ResponseStatus.FAILURE);
            billResponseDto.setMesssage(e.getMessage());
            return billResponseDto;
        }

    }
}
