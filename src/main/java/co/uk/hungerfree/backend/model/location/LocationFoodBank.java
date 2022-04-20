package co.uk.hungerfree.backend.model.location;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Embeddable
public class LocationFoodBank {

    @Column(name = "parent_slug")
    private String slug;
}
