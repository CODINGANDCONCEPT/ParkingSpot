package com.joshi.parkingspot.factory;

import com.joshi.parkingspot.resources.ParkingSpot;
import com.joshi.parkingspot.resources.Vehicle;
import com.joshi.parkingspot.service.impl.FourWheelerManager;
import com.joshi.parkingspot.service.impl.TwoWheelerManager;
import com.joshi.parkingspot.service.ParkingManagerSpotManager;

import java.util.List;

public class ParkingSpotManagerFactory {

    public ParkingManagerSpotManager getParkingSpotManagerFactory(Vehicle vehicleType, List<ParkingSpot> spotList){
      if(vehicleType.equals("TwoWheeler")){
          return new TwoWheelerManager(spotList);
      }else if(vehicleType.equals("FourWheeler")){
          return new FourWheelerManager(spotList);
      }
      return null;
    }

}
