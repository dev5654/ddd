package uz.ml.delivering_rest.controller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ml.delivering_rest.controller.AbstractController;
import uz.ml.delivering_rest.dto.region.RegionCreateDTO;
import uz.ml.delivering_rest.dto.region.RegionGetDTO;
import uz.ml.delivering_rest.dto.response.DataDTO;
import uz.ml.delivering_rest.entity.entity.Region;
import uz.ml.delivering_rest.service.service.RegionService;

@RestController
@RequestMapping(value = "/region/*")
public class RegionController extends AbstractController<RegionService> {
    public RegionController(RegionService service) {
        super(service);
    }

    @PostMapping()
    public ResponseEntity<DataDTO<RegionGetDTO>> addRegion(@RequestBody RegionCreateDTO createDTO) {
        return service.create(createDTO);
    }
}
