package co.uk.hungerfree.backend.model.need.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Need {

    private String found;

    @Type(type="text")
    private String needs;

    @Id
    private String id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "slug")
    private NeedFoodBank foodbank;

    public Need() {
    }

    public String getFound() {
        return found;
    }

    public void setFound(String found) {
        this.found = found;
    }

    public String getNeeds() {
        return needs;
    }

    public void setNeeds(String needs) {
        this.needs = needs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NeedFoodBank getFoodbank() {
        return foodbank;
    }

    public void setFoodbank(NeedFoodBank foodbank) {
        this.foodbank = foodbank;
    }
}
