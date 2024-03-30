package com.joshi.parkingspot.resources;

import com.joshi.parkingspot.factory.ParkingSpotManagerFactory;
import com.joshi.parkingspot.service.ParkingManagerSpotManager;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
public class EntranceGate {

    private ParkingSpotManagerFactory parkingSpotManagerFactory;

    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
        this.parkingSpotManagerFactory=parkingSpotManagerFactory;
    }

    public ParkingSpot findParkingSpace(Vehicle vehicle, List<ParkingSpot> parkingSpotList){
        ParkingManagerSpotManager parkingManagerSpotManager=parkingSpotManagerFactory.getParkingSpotManagerFactory(vehicle,parkingSpotList);

        return null;
    }

}
