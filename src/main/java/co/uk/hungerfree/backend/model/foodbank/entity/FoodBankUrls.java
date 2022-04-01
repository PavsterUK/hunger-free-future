package co.uk.hungerfree.backend.model.foodbank.entity;

import javax.persistence.*;

@Entity
public class FoodBankUrls {

    @Id
    private String homepage;

    public FoodBankUrls() {
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }


}
