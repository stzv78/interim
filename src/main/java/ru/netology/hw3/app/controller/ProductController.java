package ru.netology.hw3.app.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.hw3.app.repository.DataBaseRepository;

@RestController
@RequestMapping("/products")

public class ProductController {

    private DataBaseRepository dataBaseRepository;

    public ProductController(DataBaseRepository dataBaseRepository){
        this.dataBaseRepository = dataBaseRepository;
    }

    @GetMapping("/fetch-product")
    public String fetchProduct(@RequestParam(value = "name", required = true) String name) {
        return dataBaseRepository.getProductName(name);
    }
}
