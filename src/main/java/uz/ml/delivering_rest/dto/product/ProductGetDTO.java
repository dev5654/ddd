package uz.ml.delivering_rest.dto.product;

import lombok.*;
import uz.ml.delivering_rest.dto.GenericDTO;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductGetDTO extends GenericDTO {
    private String title;
    private String description;
    private String imagePath;
    private String price;
}
