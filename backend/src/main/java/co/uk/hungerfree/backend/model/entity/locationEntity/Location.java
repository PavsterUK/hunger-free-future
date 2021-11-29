package co.uk.hungerfree.backend.model.entity.locationEntity;


import javax.persistence.*;

@Entity
public class Location {

    private String phone;

    private String lat_lng;

    private String name;

    private String address;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "location_food_bank_slug")
    private LocationFoodBank foodbank;

    private String postcode;

    @Id
    private String slug;

    private String email;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLat_lng() {
        return lat_lng;
    }

    public void setLat_lng(String lat_lng) {
        this.lat_lng = lat_lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocationFoodBank getFoodbank() {
        return foodbank;
    }

    public void setFoodbank(LocationFoodBank foodbank) {
        this.foodbank = foodbank;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
