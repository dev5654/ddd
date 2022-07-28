package uz.ml.delivering_rest.dto.product;

import lombok.*;
import uz.ml.delivering_rest.dto.BaseDTO;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateDTO implements BaseDTO {
    private String title;
    private String description;
    private String imagePath;
    private String price;
}
