package com.hendisantika.carrestservice.controller;

import com.hendisantika.carrestservice.domain.Car;
import com.hendisantika.carrestservice.projection.Brand;
import com.hendisantika.carrestservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    CarRepository carRepository;

    @GetMapping("")
    Iterable<Car> getCars(){
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    Car getCar(@PathVariable("id") String id){
        return carRepository.findOne(Long.parseLong(id));
    }

    @GetMapping("/brand")
    List<Brand> getBrandOnly(@RequestParam("brand") String b) {
        return carRepository.findDistinctByBrand(b);
    }
}
