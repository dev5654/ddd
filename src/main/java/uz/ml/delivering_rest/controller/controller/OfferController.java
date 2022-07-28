package uz.ml.delivering_rest.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ml.delivering_rest.controller.AbstractController;
import uz.ml.delivering_rest.service.service.OfferService;

@RestController
@RequestMapping(value = "/offer/*")
public class OfferController extends AbstractController<OfferService> {
    public OfferController(OfferService service) {
        super(service);
    }
}
