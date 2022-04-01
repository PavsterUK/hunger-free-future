package co.uk.hungerfree.backend.model.foodbank.entity;


import javax.persistence.*;

@Entity
public class FoodBank {

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "homepage")
    private FoodBankUrls urls;

    private String name;

    private String country;

    private String email;

    private String phone;

    private String lat_lng;

    private boolean closed;

    private String address;

    @Id
    private String slug;

    private String postcode;

    public FoodBank() {
    }

    public FoodBankUrls getUrls() {
        return urls;
    }

    public void setUrls(FoodBankUrls urls) {
        this.urls = urls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

}

