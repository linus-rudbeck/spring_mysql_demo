package com.example.spring_mysql_demo.controllers;

import com.example.spring_mysql_demo.models.Car;
import com.example.spring_mysql_demo.models.User;
import com.example.spring_mysql_demo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/cars")
public class CarsController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/{id}")
    public Car read(@PathVariable int id){
        var optionalCar =  carRepository.findById(id);
        return optionalCar.orElse(null);
    }

    @PostMapping("/")
    public Car create(@RequestBody Car car){
        carRepository.save(car);
        return car;
    }

}
