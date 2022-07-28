package uz.ml.delivering_rest.service.service;

import org.springframework.stereotype.Service;
import uz.ml.delivering_rest.mapper.mapper.TransactionsMapper;
import uz.ml.delivering_rest.repository.repository.TransactionsRepository;
import uz.ml.delivering_rest.service.AbstractService;

import javax.transaction.Transactional;

@Service
@Transactional
public class TransactionsService extends AbstractService<TransactionsMapper, TransactionsRepository> {
    public TransactionsService(TransactionsMapper mapper, TransactionsRepository repository) {
        super(mapper, repository);
    }


}
