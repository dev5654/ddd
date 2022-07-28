package uz.ml.delivering_rest.dto.offer;

import lombok.*;
import uz.ml.delivering_rest.dto.GenericDTO;
import uz.ml.delivering_rest.entity.entity.Product;
import uz.ml.delivering_rest.entity.entity.Region;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OfferGetDTO extends GenericDTO {
    private Region region;
    private Product product;
}
