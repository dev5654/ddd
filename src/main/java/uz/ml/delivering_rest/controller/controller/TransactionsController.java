package uz.ml.delivering_rest.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ml.delivering_rest.controller.AbstractController;
import uz.ml.delivering_rest.service.service.TransactionsService;

@RestController
@RequestMapping(value = "/transactions/*")
public class TransactionsController extends AbstractController<TransactionsService> {
    public TransactionsController(TransactionsService service) {
        super(service);
    }
}
