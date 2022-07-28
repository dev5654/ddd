package uz.ml.delivering_rest.service.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.ml.delivering_rest.dto.region.RegionGetDTO;
import uz.ml.delivering_rest.dto.response.DataDTO;
import uz.ml.delivering_rest.dto.statistisc.StatisticForRegion;
import uz.ml.delivering_rest.entity.entity.Region;
import uz.ml.delivering_rest.mapper.mapper.RegionMapper;
import uz.ml.delivering_rest.repository.repository.RegionRepository;
import uz.ml.delivering_rest.repository.repository.TransactionsRepository;
import uz.ml.delivering_rest.service.BaseService;

import java.util.*;

@Service
public class StatisticService implements BaseService {

    List<StatisticForRegion> statisticForRegions = new ArrayList<>();

    public StatisticService( RegionRepository regionRepository, RegionMapper mapper) {
        this.regionRepository = regionRepository;
        this.mapper = mapper;
    }

    private final RegionRepository regionRepository;
    private final RegionMapper mapper;

    public ResponseEntity<?> deliveryRegionsPerNT() {
        Map<Integer, List<RegionGetDTO>> map = new HashMap<>();
        List<Region> regions = regionRepository.findAll();
        List<RegionGetDTO> list = new ArrayList<>();
        for (Region region : regions) {
            RegionGetDTO regionGetDTO = mapper.toGetDTO(region);
            if (map.isEmpty()) {
                list.add(regionGetDTO);
                map.put(region.getTransactionCount(), list);
            } else {
                map.forEach((integer, regions1) -> {
                    if (integer == region.getTransactionCount()) {
                        regions1.add(mapper.toGetDTO(region));
                    }
                });
            }
        }

        map.forEach((integer, regions1) -> {
            StatisticForRegion statisticForRegion = new StatisticForRegion(integer, regions1);
            statisticForRegions.add(statisticForRegion);
        });
        return new ResponseEntity<>(statisticForRegions.stream()
                .sorted(Comparator.comparing(StatisticForRegion::getTransactionNumber)).toList(), HttpStatus.OK);
    }

}
