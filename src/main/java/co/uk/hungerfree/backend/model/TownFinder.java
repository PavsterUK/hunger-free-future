package co.uk.hungerfree.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TownFinder {

    @Id
    private Long id;

    /** Town or City name **/
    private String name;

    private String county;

    private String country;

    private double latitude;

    private double longitude;

    private String postcode_area;

    public TownFinder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPostcode_area() {
        return postcode_area;
    }

    public void setPostcode_area(String postcode_area) {
        this.postcode_area = postcode_area;
    }
}
