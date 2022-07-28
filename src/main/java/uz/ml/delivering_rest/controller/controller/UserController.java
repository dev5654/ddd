package uz.ml.delivering_rest.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ml.delivering_rest.controller.AbstractController;
import uz.ml.delivering_rest.service.service.UserService;

@RestController
@RequestMapping(value = "/user/*")
public class UserController extends AbstractController<UserService> {
    public UserController(UserService service) {
        super(service);
    }
}
