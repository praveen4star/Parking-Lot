package models;

import java.util.Date;

public class Payment {
    private String transactionId;
    private double amount;
    private PaymentStatus status;
    private Bill bill;
    private Date paymentDate;
    private PaymentMode paymentMode;
    private String paymentGateway;
}
