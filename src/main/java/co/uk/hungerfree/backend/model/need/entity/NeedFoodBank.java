package co.uk.hungerfree.backend.model.need.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class NeedFoodBank {

    private String name;

    @Id
    @Column(name = "main_bank_slug")
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
