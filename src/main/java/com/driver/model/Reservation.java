package com.driver.model;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int numberofhours;

    @ManyToOne
    @JoinColumn
    Spot spot;

    @ManyToOne
    @JoinColumn
    User user;

    @OneToOne(mappedBy = "reservation",cascade = CascadeType.ALL)
    private Payment payment;



    public Reservation() {
    }

    public Reservation(int id, int numberofhours, Spot spot, User user, Payment payment) {
        this.id = id;
        this.numberofhours = numberofhours;
        this.spot = spot;
        this.user = user;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberofhours() {
        return numberofhours;
    }

    public void setNumberofhours(int numberofhours) {
        this.numberofhours = numberofhours;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
