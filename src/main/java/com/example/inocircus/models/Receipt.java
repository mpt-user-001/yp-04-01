package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Receipts")
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Receipt;
    @Column(length = 12, nullable = false, unique = true)
    private String Number;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp Date_Receipt;
    @Column(length = 45)
    private String Payment_Gateway;
    @Column(length = 45, nullable = false)
    private String Payment_Method;
    @Column(nullable = false)
    private double Amount_Receipt;

    public Receipt() {}

    public Receipt(int id, String number, Timestamp dr, String pg, String pm, double amount) {
        this.ID_Receipt = id;
        this.Number = number;
        this.Date_Receipt = dr;
        this.Payment_Gateway = pg;
        this.Payment_Method = pm;
        this.Amount_Receipt = amount;
    }

    public int getID_Receipt() {
        return ID_Receipt;
    }

    public void setID_Receipt(int ID_Receipt) {
        this.ID_Receipt = ID_Receipt;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public Timestamp getDate_Receipt() {
        return Date_Receipt;
    }

    public void setDate_Receipt(Timestamp date_Receipt) {
        Date_Receipt = date_Receipt;
    }

    public String getPayment_Gateway() {
        return Payment_Gateway;
    }

    public void setPayment_Gateway(String payment_Gateway) {
        Payment_Gateway = payment_Gateway;
    }

    public String getPayment_Method() {
        return Payment_Method;
    }

    public void setPayment_Method(String payment_Method) {
        Payment_Method = payment_Method;
    }

    public double getAmount_Receipt() {
        return Amount_Receipt;
    }

    public void setAmount_Receipt(double amount_Receipt) {
        Amount_Receipt = amount_Receipt;
    }
}
