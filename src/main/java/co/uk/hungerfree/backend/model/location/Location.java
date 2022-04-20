package co.uk.hungerfree.backend.model.location;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String phone;

    @Transient
    @Setter(AccessLevel.NONE)
    private String lat_lng;

    private double latitude;

    private double longitude;

    private String name;

    private String address;

    @Embedded
    private LocationFoodBank foodbank;

    private String postcode;

    private String slug;

    private String email;

    public void setLat_lng(String lat_lng) {
        String[] latLong = lat_lng.split("\\s*,\\s*");
        setLatitude(Double.parseDouble(latLong[0]));
        setLongitude(Double.parseDouble(latLong[1]));
    }

}
