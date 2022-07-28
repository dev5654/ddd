package uz.ml.delivering_rest.dto.request;

import lombok.*;
import uz.ml.delivering_rest.dto.BaseDTO;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RequestCreateDTO implements BaseDTO {
    private Long regionId;

    private Long productId;
}
