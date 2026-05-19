package karmpatel.aibilling.service;

import karmpatel.aibilling.entity.BillItem;
import karmpatel.aibilling.entity.Product;
import karmpatel.aibilling.repository.BillItemRepository;
import karmpatel.aibilling.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    private final ProductRepository productRepository;
    private final BillItemRepository billItemRepository;

    public BillService(ProductRepository productRepository,
                       BillItemRepository billItemRepository) {

        this.productRepository = productRepository;
        this.billItemRepository = billItemRepository;
    }

    public BillItem createBillItem(BillItem billItem) {

        Product product = productRepository.findById(billItem.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (product.getQuantity() < billItem.getQuantity()) {
            throw new RuntimeException("Not enough stock available");
        }

        product.setQuantity(product.getQuantity() - billItem.getQuantity());

        productRepository.save(product);

        return billItemRepository.save(billItem);
    }
}