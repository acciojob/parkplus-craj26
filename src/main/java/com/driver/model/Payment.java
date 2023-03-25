package com.driver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "TINYINT(1)")
    private Boolean isPaymentCompleted;//isPaymentCompleted()

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @OneToOne
    @JoinColumn
    @JsonIgnore
    private  Reservation reservation;

    public Payment() {
    }

    public Payment(int id, Boolean isPaymentCompleted, PaymentMode paymentMode, Reservation reservation) {
        this.id = id;
        this.isPaymentCompleted = isPaymentCompleted;
        this.paymentMode = paymentMode;
        this.reservation = reservation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Boolean getisPaymentCompleted() {
        return isPaymentCompleted;
    }

    public void setisPaymentCompleted(Boolean paymentCompleted) {
        this.isPaymentCompleted = paymentCompleted;
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
