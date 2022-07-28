package uz.ml.delivering_rest.service.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.ml.delivering_rest.entity.entity.Region;
import uz.ml.delivering_rest.entity.entity.Transactions;
import uz.ml.delivering_rest.repository.repository.RegionRepository;
import uz.ml.delivering_rest.repository.repository.TransactionsRepository;

import java.util.List;

@Service
public class StatisticService {

    public StatisticService(TransactionsRepository transactionsRepository, RegionRepository regionRepository) {
        this.transactionsRepository = transactionsRepository;
        this.regionRepository = regionRepository;
    }

    private final TransactionsRepository transactionsRepository;
    private final RegionRepository regionRepository;

    public ResponseEntity<?> deliveryRegionsPerNT() {
        List<Transactions> transactions = transactionsRepository.findAll();

        return null;
    }


}
