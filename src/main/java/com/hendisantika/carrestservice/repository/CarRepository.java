package com.hendisantika.carrestservice.repository;

import com.hendisantika.carrestservice.domain.Car;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : car-rest-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/11/17
 * Time: 06.45
 * To change this template use File | Settings | File Templates.
 */
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findByBrand(@Param("brand") String brand);

    List<Car> findByModel(@Param("model") String model);

    List<Car> findByFuel(@Param("fuel") String fuel);

    List<Car> findByColor(@Param("color") String color);

    List<Car> findByYear(@Param("year") int year);

    @Query("SELECT DISTINCT c.brand as brand, c.color as color from Car c")
    List<Map<String, String>> getBrand(Pageable pageable);

}
