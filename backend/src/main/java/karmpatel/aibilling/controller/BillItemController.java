package karmpatel.aibilling.controller;

import karmpatel.aibilling.entity.BillItem;
import karmpatel.aibilling.service.BillService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bill-items")
public class BillItemController {

    private final BillService billService;

    public BillItemController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping
    public BillItem createBillItem(@RequestBody BillItem billItem) {
        return billService.createBillItem(billItem);
    }
}