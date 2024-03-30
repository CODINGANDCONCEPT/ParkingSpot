package com.joshi.parkingspot.resources;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    private String vehicleNumber;

    private VehicleType VehicleType;


}
