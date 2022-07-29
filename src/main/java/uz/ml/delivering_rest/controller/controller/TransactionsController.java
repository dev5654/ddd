package uz.ml.delivering_rest.controller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    public TransactionsController(TransactionsService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<DataDTO<Long>> createTransaction(@RequestBody TransactionsCreateDTO createDTO) {
        return service.create(createDTO);
    }
    @GetMapping
    public ResponseEntity<DataDTO<Boolean>> evaluateTransaction(Long transactionId,int score) {
        return service.evaluateTransaction(transactionId,score);
    }

}
