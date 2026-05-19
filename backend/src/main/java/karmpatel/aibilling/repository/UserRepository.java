package karmpatel.aibilling.repository;

import karmpatel.aibilling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}