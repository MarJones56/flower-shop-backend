package iu.edu.marjone.flowershopbackend.repository;

import iu.edu.marjone.flowershopbackend.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository
        extends CrudRepository<Customer, String> {
    Customer findByEmail(String email);

}
