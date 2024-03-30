package com.joshi.parkingspot.service.impl;

import com.joshi.parkingspot.resources.ParkingSpot;
import com.joshi.parkingspot.service.ParkingManagerSpotManager;

import java.util.List;

public class FourWheelerManager extends ParkingManagerSpotManager {

    public FourWheelerManager(List<ParkingSpot> list){
        super(list);
    }


    @Override
    public ParkingSpot findParkingSpot(){
        ParkingSpot parkingSpot=new ParkingSpot();

        return parkingSpot;
    }





}
