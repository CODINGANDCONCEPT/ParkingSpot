package com.joshi.parkingspot.service.impl;

import com.joshi.parkingspot.resources.ParkingSpot;
import com.joshi.parkingspot.service.ParkingManagerSpotManager;

import java.util.List;

public class TwoWheelerManager extends ParkingManagerSpotManager {

    private List<ParkingSpot> parkingSpotList;

    public TwoWheelerManager(List<ParkingSpot> parkingSpotList){
        super(parkingSpotList);
    }

    @Override
    public ParkingSpot findParkingSpot(){
        ParkingSpot parkingSpot=new ParkingSpot();

        return parkingSpot;
    }




}
