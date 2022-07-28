package uz.ml.delivering_rest.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ml.delivering_rest.controller.AbstractController;
import uz.ml.delivering_rest.service.service.RequestService;

@RestController
@RequestMapping(value = "/request/*")
public class RequestController extends AbstractController<RequestService> {
    public RequestController(RequestService service) {
        super(service);
    }
}
