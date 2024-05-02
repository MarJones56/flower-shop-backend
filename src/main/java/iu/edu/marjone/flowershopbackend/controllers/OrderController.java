package iu.edu.marjone.flowershopbackend.controllers;

import iu.edu.marjone.flowershopbackend.model.Order;
import iu.edu.marjone.flowershopbackend.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {

    OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public Order add(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping("/{email}")
    List<Order> get(@PathVariable String email){
        return orderRepository.findByEmail(email);
    }
}
