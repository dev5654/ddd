package uz.ml.delivering_rest.controller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ml.delivering_rest.controller.AbstractController;
import uz.ml.delivering_rest.dto.carrier.CarrierCreateDTO;
import uz.ml.delivering_rest.dto.carrier.CarrierGetDTO;
import uz.ml.delivering_rest.dto.response.DataDTO;
import uz.ml.delivering_rest.entity.entity.Carrier;
import uz.ml.delivering_rest.service.service.CarrierService;

@RestController
@RequestMapping(value = "/carrier/*")
public class CarrierController extends AbstractController<CarrierService> {
    public CarrierController(CarrierService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<DataDTO<CarrierGetDTO>> addCarrier(@RequestBody CarrierCreateDTO createDTO) {
     return service.create(createDTO);
    }
}
