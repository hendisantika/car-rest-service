package com.hendisantika.carrestservice.controller;

import com.hendisantika.carrestservice.domain.Car;
import com.hendisantika.carrestservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : car-rest-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/11/17
 * Time: 06.49
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping
    Iterable<Car> getCars(){
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Car> getCar(@PathVariable("id") String id) {
        return carRepository.findById(Long.parseLong(id));
    }

    @GetMapping("/brand")
    List<Map<String, String>> getBrandOnly(Pageable pageable) {
        return carRepository.getBrand(pageable);
    }
}
