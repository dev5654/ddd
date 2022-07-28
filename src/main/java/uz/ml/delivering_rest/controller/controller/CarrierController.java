package uz.ml.delivering_rest.controller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.ml.delivering_rest.controller.AbstractController;
import uz.ml.delivering_rest.dto.carrier.CarrierCreateDTO;
import uz.ml.delivering_rest.dto.carrier.CarrierGetDTO;
import uz.ml.delivering_rest.dto.response.DataDTO;
import uz.ml.delivering_rest.service.service.CarrierService;

import java.util.List;

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
    @GetMapping("getForRegion")
    public ResponseEntity<DataDTO<List<CarrierGetDTO>>> getCarriersForRegion(@RequestParam String regionName){
        return service.getCarriersForRegion(regionName);
    }
}
