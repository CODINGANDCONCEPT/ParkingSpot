package com.joshi.parkingspot.resources;

import com.joshi.parkingspot.factory.ParkingSpotManagerFactory;
import lombok.*;

@Getter
@Setter
@Data
public class ExitGate {

    private ParkingSpotManagerFactory parkingSpotManagerFactory;

    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
        this.parkingSpotManagerFactory=parkingSpotManagerFactory;
    }



}
