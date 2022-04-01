package co.uk.hungerfree.backend.model.location.entity;


import javax.persistence.*;

@Entity
public class LocationFoodBank {

    @Id
    private String slug;

    public LocationFoodBank() {
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
