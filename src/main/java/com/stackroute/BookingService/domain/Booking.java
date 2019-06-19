package com.stackroute.BookingService.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {
    @Id
    private String wareHouseUuid;
    private String customerMailId;
    private String ownerMailId;
    private String location;
    private String area;
    private String startDate;
    private String endDate;
    private String partitionId;
}
