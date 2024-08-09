package vnua.fita.sbcrudrestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vnua.fita.sbcrudrestful.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
