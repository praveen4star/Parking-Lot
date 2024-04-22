package models;

import models.constants.PaymentMode;
import models.constants.PaymentStatus;

import java.util.Date;

public class Payment extends BaseModel {
    private String transactionId;
    private double amount;
    private PaymentStatus status;
    private Bill bill;
    private Date paymentDate;
    private PaymentMode paymentMode;
    private String paymentGateway;
}
