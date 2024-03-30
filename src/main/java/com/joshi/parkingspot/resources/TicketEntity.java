package com.joshi.parkingspot.resources;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketEntity {
    private Long entryTime;

    private Vehicle vehicle;

    private ParkingSpot parkingSpot;

}
