package uz.ml.delivering_rest.service.service;

import org.springframework.stereotype.Service;
import uz.ml.delivering_rest.mapper.mapper.RequestMapper;
import uz.ml.delivering_rest.repository.repository.RequestRepository;
import uz.ml.delivering_rest.service.AbstractService;

import javax.transaction.Transactional;

@Service
@Transactional
public class RequestService extends AbstractService<RequestMapper, RequestRepository> {
    public RequestService(RequestMapper mapper, RequestRepository repository) {
        super(mapper, repository);
    }
}
