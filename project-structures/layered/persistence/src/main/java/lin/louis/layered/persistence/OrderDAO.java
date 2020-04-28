package lin.louis.layered.persistence;

import java.util.Optional;

import lin.louis.layered.persistence.model.Order;

public interface OrderDAO {

	long save(Order order);

	Optional<Order> findById(long orderId);
}
