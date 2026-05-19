package karmpatel.aibilling.repository;

import karmpatel.aibilling.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}