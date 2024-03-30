package com.joshi.parkingspot;

import com.joshi.parkingspot.factory.ParkingSpotManagerFactory;
import com.joshi.parkingspot.resources.EntranceGate;
import com.joshi.parkingspot.resources.ExitGate;
import com.joshi.parkingspot.resources.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<ParkingSpot> parkingSpotList=new ArrayList<>();

        for(int i=0;i<100;i++){
            if(i<50){
                parkingSpotList.add(new ParkingSpot(i,10));
            }
            else{
                parkingSpotList.add(new ParkingSpot(i,20));
            }
        }

        ParkingSpotManagerFactory parkingSpotManagerFactory=new ParkingSpotManagerFactory();

        EntranceGate entranceGate =new EntranceGate(parkingSpotManagerFactory);

        ExitGate exitGateEntity=new ExitGate(parkingSpotManagerFactory);


    }
}