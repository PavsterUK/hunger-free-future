package co.uk.hungerfree.backend.model.entities.needEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NeedFoodBank {

    private String name;

    @Id
    private String slug;

    public NeedFoodBank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
