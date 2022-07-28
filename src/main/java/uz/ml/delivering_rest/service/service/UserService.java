package uz.ml.delivering_rest.service.service;

import org.springframework.stereotype.Service;
import uz.ml.delivering_rest.mapper.mapper.UserMapper;
import uz.ml.delivering_rest.repository.repository.UserRepository;
import uz.ml.delivering_rest.service.AbstractService;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService extends AbstractService<UserMapper, UserRepository> {
    public UserService(UserMapper mapper, UserRepository repository) {
        super(mapper, repository);
    }
}
