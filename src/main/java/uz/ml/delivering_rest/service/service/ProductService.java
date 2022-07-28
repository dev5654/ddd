package uz.ml.delivering_rest.service.service;

import org.springframework.stereotype.Service;
import uz.ml.delivering_rest.mapper.mapper.ProductMapper;
import uz.ml.delivering_rest.repository.repository.ProductRepository;
import uz.ml.delivering_rest.service.AbstractService;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductService extends AbstractService<ProductMapper, ProductRepository> {
    public ProductService(ProductMapper mapper, ProductRepository repository) {
        super(mapper, repository);
    }

}
