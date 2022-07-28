package uz.ml.delivering_rest.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.ml.delivering_rest.dto.carrier.CarrierCreateDTO;
import uz.ml.delivering_rest.dto.carrier.CarrierGetDTO;
import uz.ml.delivering_rest.dto.response.AppErrorDTO;
import uz.ml.delivering_rest.dto.response.DataDTO;
import uz.ml.delivering_rest.entity.entity.Carrier;
import uz.ml.delivering_rest.entity.entity.Region;
import uz.ml.delivering_rest.mapper.mapper.CarrierMapper;
import uz.ml.delivering_rest.repository.repository.CarrierRepository;
import uz.ml.delivering_rest.repository.repository.RegionRepository;
import uz.ml.delivering_rest.service.AbstractService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class CarrierService extends AbstractService<CarrierMapper, CarrierRepository> {

    @Autowired
    RegionRepository regionRepository;

    public CarrierService(CarrierMapper mapper, CarrierRepository repository) {
        super(mapper, repository);
    }

    public ResponseEntity<DataDTO<CarrierGetDTO>> create(CarrierCreateDTO createDTO) {
        Carrier carrier = mapper.fromCreateDTO(createDTO);
        for (String name : createDTO.getRegionsName()) {
            if (regionRepository.existsByName(name)) {
                carrier.getRegions().add(regionRepository.findByName(name));
            }
        }
        return new ResponseEntity<>(new DataDTO<>(mapper.toGetDTO(repository.save(carrier))), HttpStatus.CREATED);
    }

    public ResponseEntity<DataDTO<List<CarrierGetDTO>>> getCarriersForRegion(String regionName) {
        Region region = regionRepository.findByName(regionName);
        if (Objects.nonNull(region)) {
//            List<Carrier> carriers = region.getCarriers();
//            return new ResponseEntity<>(new DataDTO<>(mapper.toGetDTO(carriers)), HttpStatus.OK);
        }
        return new ResponseEntity<>(new DataDTO<>(AppErrorDTO.builder().message("Region not found").build()), HttpStatus.BAD_REQUEST);
    }
}
