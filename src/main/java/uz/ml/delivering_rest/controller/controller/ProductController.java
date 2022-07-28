package uz.ml.delivering_rest.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ml.delivering_rest.controller.AbstractController;
import uz.ml.delivering_rest.service.service.ProductService;

@RestController
@RequestMapping(value = "/product/*")
public class ProductController extends AbstractController<ProductService> {
    public ProductController(ProductService service) {
        super(service);
    }
}
