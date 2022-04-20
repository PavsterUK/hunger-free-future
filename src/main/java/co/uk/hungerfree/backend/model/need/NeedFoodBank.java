package co.uk.hungerfree.backend.model.need;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class NeedFoodBank {

    private String name;

    private String slug;
}
