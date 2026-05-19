package karmpatel.aibilling.controller;

import karmpatel.aibilling.entity.Bill;
import karmpatel.aibilling.repository.BillRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillController {

    private final BillRepository billRepository;

    public BillController(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    @GetMapping
    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {

        bill.setBillDate(LocalDateTime.now());

        return billRepository.save(bill);
    }
}