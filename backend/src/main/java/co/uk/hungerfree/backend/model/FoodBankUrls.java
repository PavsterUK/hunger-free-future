package co.uk.hungerfree.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FoodBankUrls implements Serializable {

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
