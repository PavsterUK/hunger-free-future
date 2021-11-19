package co.uk.hungerfree.backend.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Urls implements Serializable {

    @Id
    private String homepage;

    public Urls() {
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }


}
