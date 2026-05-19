package karmpatel.aibilling.repository;

import karmpatel.aibilling.entity.BillItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillItemRepository extends JpaRepository<BillItem, Long> {

}