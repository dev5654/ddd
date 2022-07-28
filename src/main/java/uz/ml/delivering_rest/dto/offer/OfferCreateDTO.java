package uz.ml.delivering_rest.dto.offer;

import lombok.*;
import uz.ml.delivering_rest.dto.BaseDTO;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OfferCreateDTO implements BaseDTO {
    private Long regionId;
    private Long productId;
}
