package uz.ml.delivering_rest.controller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ml.delivering_rest.controller.AbstractController;
import uz.ml.delivering_rest.dto.response.DataDTO;
import uz.ml.delivering_rest.dto.transactions.TransactionsCreateDTO;
import uz.ml.delivering_rest.dto.transactions.TransactionsGetDTO;
import uz.ml.delivering_rest.repository.repository.CarrierRepository;
import uz.ml.delivering_rest.repository.repository.OfferRepository;
import uz.ml.delivering_rest.repository.repository.RequestRepository;
import uz.ml.delivering_rest.service.service.TransactionsService;

@RestController
@RequestMapping(value = "/transactions/*")
public class TransactionsController extends AbstractController<TransactionsService> {

    private final CarrierRepository carrierRepository;
    private final RequestRepository requestRepository;
    private final OfferRepository offerRepository;

    public TransactionsController(TransactionsService service, CarrierRepository carrierRepository, RequestRepository requestRepository, OfferRepository offerRepository) {
        super(service);
        this.carrierRepository = carrierRepository;
        this.requestRepository = requestRepository;
        this.offerRepository = offerRepository;
    }

    @PostMapping
    public ResponseEntity<DataDTO<TransactionsGetDTO>> createTransaction(@RequestBody TransactionsCreateDTO createDTO) {
        return service.create(createDTO);
    }
}
