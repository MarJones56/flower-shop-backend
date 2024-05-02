package iu.edu.marjone.flowershopbackend.repository;

import iu.edu.marjone.flowershopbackend.model.Flowers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends CrudRepository<Flowers, String> {

}