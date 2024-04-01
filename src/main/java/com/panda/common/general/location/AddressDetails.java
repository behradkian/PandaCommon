package com.panda.common.general.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDetails {

    private String postalCode;
    private String province;
    private String townShip;
    private String village;
    private String city;
    private String localityType;
    private String localityName;
    private String localityCode;
    private String subLocality;
    private String zone;
    private String street1;
    private String street2;
    private String buildingName;
    private String floorNumber;
    private String sideFloor;
    private String houseNumber;
    private String location;
    private String locationType;
    private String totalAddress;
}
