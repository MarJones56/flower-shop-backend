package iu.edu.marjone.flowershopbackend.controllers;

import iu.edu.marjone.flowershopbackend.model.Flowers;
import iu.edu.marjone.flowershopbackend.repository.FlowerRepository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping("/flowers")
public class FlowerController {

    FlowerRepository flowerRepository;

    public FlowerController(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @GetMapping
    Iterable<Flowers> getAll() throws IOException {
        return flowerRepository.findAll();
    }

    @PostMapping
    public Flowers add(@RequestBody Flowers flowers) {
        return flowerRepository.save(flowers);
    }
}
