package controllers;

import model.PrimesRecord;
import org.springframework.web.bind.annotation.*;
import repository.PrimesHistoryRepository;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesHistoryController {
    private final PrimesHistoryRepository primesHistoryRepository;
    public PrimesHistoryController(
            PrimesHistoryRepository primesHistoryRepository){
        this.primesHistoryRepository = primesHistoryRepository;
    }
    @GetMapping("/{customers}")
    public List<PrimesRecord> findAll(@PathVariable String customer){
        return primesHistoryRepository.findAllByCustomer(customer);
    }
}
