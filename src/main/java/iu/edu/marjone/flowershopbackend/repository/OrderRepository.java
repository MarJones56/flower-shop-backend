package iu.edu.marjone.flowershopbackend.repository;

import iu.edu.marjone.flowershopbackend.model.Customer;
import iu.edu.marjone.flowershopbackend.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {
    List<Order> findByEmail(String email);
}
