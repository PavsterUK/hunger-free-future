package co.uk.hungerfree.backend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NeedsFoodBank {

    private String name;

    @Id
    private String slug;

    public NeedsFoodBank() {
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
