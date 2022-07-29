package uz.ml.delivering_rest.controller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
        System.out.println("123");
        return service.create(createDTO);
    }

    @GetMapping()
    public ResponseEntity<DataDTO<?>> getAllSortedRegions() {
        return service.getAll();
    }
}
