package com.driver.model;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Boolean paymentcompleted;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @OneToOne
    @JoinColumn
    Reservation reservation;

    public Payment() {
    }

    public Payment(int id, Boolean paymentcompleted, PaymentMode paymentMode, Reservation reservation) {
        this.id = id;
        this.paymentcompleted = paymentcompleted;
        this.paymentMode = paymentMode;
        this.reservation = reservation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getPaymentcompleted() {
        return paymentcompleted;
    }

    public void setPaymentcompleted(Boolean paymentcompleted) {
        this.paymentcompleted = paymentcompleted;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
