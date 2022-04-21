package co.uk.hungerfree.backend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class TownFinder {

    @Id
    private Long id;

    private String county;

    private String country;

    private double latitude;

    private double longitude;

    private String name;

    private String postcode_area;

}
