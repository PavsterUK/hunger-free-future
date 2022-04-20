package co.uk.hungerfree.backend.model.foodbank;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Embeddable
public class FoodBankUrls {

    private String homepage;

}
