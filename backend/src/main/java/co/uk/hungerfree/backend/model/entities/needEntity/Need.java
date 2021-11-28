package co.uk.hungerfree.backend.model.entities.needEntity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Need implements Serializable {

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

    public String getNeeds() {
        return needs;
    }

    public void setNeeds(String needs) {
        this.needs = needs;
    }

    public NeedFoodBank getFoodbank() {
        return foodbank;
    }

    public void setFoodbank(NeedFoodBank foodbank) {
        this.foodbank = foodbank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFound() {
        return found;
    }

    public void setFound(String found) {
        this.found = found;
    }

}
