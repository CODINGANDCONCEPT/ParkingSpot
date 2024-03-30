package com.joshi.parkingspot.service;


import com.joshi.parkingspot.resources.ParkingSpot;
import com.joshi.parkingspot.resources.Vehicle;

import java.util.List;

public abstract class ParkingManagerSpotManager {

    List<ParkingSpot> parkingSpotList;

    public ParkingManagerSpotManager(List<ParkingSpot> parkingSpotList){
        this.parkingSpotList=parkingSpotList;
    }


    public abstract ParkingSpot findParkingSpot();


    public void parkVehicle(Vehicle vehicle){
        ParkingSpot parkingSpot=findParkingSpot();

    }

    public void removeVehicle(Vehicle vehicle){

    }

}

