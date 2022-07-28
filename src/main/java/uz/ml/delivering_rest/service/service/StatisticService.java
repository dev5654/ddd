package uz.ml.delivering_rest.service.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.ml.delivering_rest.dto.region.RegionGetDTO;
import uz.ml.delivering_rest.dto.statistisc.StatisticForRegion;
import uz.ml.delivering_rest.entity.entity.Region;
import uz.ml.delivering_rest.mapper.mapper.RegionMapper;
import uz.ml.delivering_rest.repository.repository.RegionRepository;
import uz.ml.delivering_rest.service.BaseService;

import java.util.*;

@Service
public class StatisticService implements BaseService {


    public StatisticService(RegionRepository regionRepository, RegionMapper mapper) {
        this.regionRepository = regionRepository;
        this.mapper = mapper;
    }

    private final RegionRepository regionRepository;
    private final RegionMapper mapper;

    public ResponseEntity<?> deliveryRegionsPerNT() {
        List<StatisticForRegion> statisticForRegions = new ArrayList<>();
        Map<Integer, List<RegionGetDTO>> map = new HashMap<>();
        List<Region> regions = regionRepository.findAll();
        for (Region region : regions) {
            if (!map.containsKey(region.getTransactionCount())) {
                map.put(region.getTransactionCount(), new ArrayList<>(List.of(mapper.toGetDTO(region))));
            } else
                map.forEach((integer, r) -> {
                    if (Objects.equals(integer, region.getTransactionCount())) {
                        map.get(integer).add(mapper.toGetDTO(region));
                    }
                });
        }

        map.forEach((integer, r) -> {
            StatisticForRegion statisticForRegion = new StatisticForRegion(integer, r);
            statisticForRegions.add(statisticForRegion);
        });
        return new ResponseEntity<>(statisticForRegions.stream()
                .sorted(Comparator.comparing(StatisticForRegion::getTransactionNumber)).toList(), HttpStatus.OK);
    }

}
