package com.joshi.parkingspot.resources;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpot {

    private int id;
    private boolean isEmpty;
    private Vehicle vehicle;
    private int price;

    public ParkingSpot(int id,int price){
        this.id=id;
        this.price=price;
    }

    public void ParkVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        this.isEmpty=false;
    }

    public void removeVehivle(){
        this.vehicle=null;
        this.isEmpty=true;
    }
}
