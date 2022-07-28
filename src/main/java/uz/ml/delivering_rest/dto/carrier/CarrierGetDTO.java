package uz.ml.delivering_rest.dto.carrier;

import lombok.*;
import uz.ml.delivering_rest.dto.GenericDTO;
import uz.ml.delivering_rest.entity.entity.Region;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CarrierGetDTO extends GenericDTO {
    private String name;

    private List<Region> regions;
}
