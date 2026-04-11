package com.saveserve.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository repo;

    // SAVE
    @PostMapping("/add")
    public Food addFood(@RequestBody Food food) {
        return repo.save(food);
    }

    // GET ALL
    @GetMapping
    public List<Food> getAll() {
        return repo.findAll();
    }

    // UPDATE STATUS
    @PutMapping("/{id}")
    public Food updateStatus(@PathVariable Long id, @RequestBody Food newData) {
        Food food = repo.findById(id).orElseThrow();
        food.setStatus(newData.getStatus());
        return repo.save(food);
    }
}