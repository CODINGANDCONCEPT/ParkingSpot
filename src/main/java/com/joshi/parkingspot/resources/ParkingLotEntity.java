package com.joshi.parkingspot.resources;


import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLotEntity {

    private int id;
    private Vehicle vehicle;

}
