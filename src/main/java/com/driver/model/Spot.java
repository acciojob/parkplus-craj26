package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  int priceperhour;
    private Boolean occupide;
    @Enumerated(EnumType.STRING)
    private SpotType spotType;

    @ManyToOne
    @JoinColumn
    ParkingLot parkingLot;

    @OneToMany(mappedBy = "spot",cascade = CascadeType.ALL)
    List<Reservation> reservationList=new ArrayList<>();

    public Spot(){

    }

    public Spot(int id, int priceperhour, Boolean occupide, SpotType spotType, ParkingLot parkingLot, List<Reservation> reservationList) {
        this.id = id;
        this.priceperhour = priceperhour;
        this.occupide = occupide;
        this.spotType = spotType;
        this.parkingLot = parkingLot;
        this.reservationList = reservationList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriceperhour() {
        return priceperhour;
    }

    public void setPriceperhour(int priceperhour) {
        this.priceperhour = priceperhour;
    }

    public Boolean getOccupide() {
        return occupide;
    }

    public void setOccupide(Boolean occupide) {
        this.occupide = occupide;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}
