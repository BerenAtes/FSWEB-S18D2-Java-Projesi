package com.workintech.s18d2.controller;

import com.workintech.s18d2.dto.FruitResponse;
import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import com.workintech.s18d2.services.FruitServiceImpl;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@AllArgsConstructor
@RestController
@RequestMapping("/fruit")
public class FruitController {

    private final FruitService fruitService;


    @GetMapping
    public List<Fruit> findAll(){
        return fruitService.getByPriceAsc();
    }

    @GetMapping("/{id}")
    public FruitResponse get(@Positive @PathVariable long id){
        return new FruitResponse("find by id success",fruitService.getById(id));
    }
    @GetMapping("/desc")
    public List<Fruit> findAllDesc(){
        return fruitService.getByPriceDesc();
    }

     @PostMapping
    public Fruit save(@Validated @RequestBody Fruit fruit){
        return fruitService.save(fruit);

     }


     @GetMapping("/search/{name}")
        public List<Fruit> searchByName(@Size(min = 3,max = 50) @PathVariable String name){
        return fruitService.searchByName(name);
     }

     @DeleteMapping("/{id}")
        public Fruit delete(@Positive @PathVariable long id){
        return fruitService.delete(id);
     }
}
