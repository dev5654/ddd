package uz.ml.delivering_rest.service.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.ml.delivering_rest.entity.entity.Region;
import uz.ml.delivering_rest.entity.entity.Transactions;
import uz.ml.delivering_rest.repository.repository.RegionRepository;
import uz.ml.delivering_rest.repository.repository.TransactionsRepository;
import uz.ml.delivering_rest.service.AbstractService;

import java.util.List;

@Service
public class StatisticService extends AbstractService<StatisticMapper, StatisticRepository> {


    public StatisticService(StatisticMapper mapper, StatisticRepository repository, TransactionsRepository transactionsRepository, RegionRepository regionRepository) {
        super(mapper, repository);
        this.transactionsRepository = transactionsRepository;
        this.regionRepository = regionRepository;
    }

    private final TransactionsRepository transactionsRepository;
    private final RegionRepository regionRepository;

    public ResponseEntity<?> deliveryRegionsPerNT() {
        List<Transactions> transactions = transactionsRepository.findAll();
        for (Transactions transaction : transactions) {
            findTransactionCountOfRegion(transaction.getOffer().getRegion().getId());
        }
        return null;
    }

    private void findTransactionCountOfRegion(Long id) {
        List<Region> regions = regionRepository.findAll();
        for (Region region : regions) {
            if (region.getId().equals(id)) {
                region.setTransactionCount(region.getTransactionCount() + 1);
            }
        }
    }
}
