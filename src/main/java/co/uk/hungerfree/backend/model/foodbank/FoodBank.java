package co.uk.hungerfree.backend.model.foodbank;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class FoodBank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private FoodBankUrls urls;

    private String name;

    private String country;

    private String email;

    private String phone;

    @Transient
    @Setter(AccessLevel.NONE)
    private String lat_lng;

    private double latitude;

    private double longitude;

    private boolean closed;

    private String address;

    private String slug;

    private String postcode;


    public void setLat_lng(String lat_lng) {
        String[] latLong = lat_lng.split("\\s*,\\s*");
        setLatitude(Double.parseDouble(latLong[0]));
        setLongitude(Double.parseDouble(latLong[1]));
    }

}

