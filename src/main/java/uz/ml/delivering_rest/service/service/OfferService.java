package uz.ml.delivering_rest.service.service;

import org.springframework.stereotype.Service;
import uz.ml.delivering_rest.mapper.mapper.OfferMapper;
import uz.ml.delivering_rest.repository.repository.OfferRepository;
import uz.ml.delivering_rest.service.AbstractService;

import javax.transaction.Transactional;

@Service
@Transactional
public class OfferService extends AbstractService<OfferMapper, OfferRepository> {
    public OfferService(OfferMapper mapper, OfferRepository repository) {
        super(mapper, repository);
    }
}
