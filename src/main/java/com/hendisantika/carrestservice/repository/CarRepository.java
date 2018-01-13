package com.hendisantika.carrestservice.repository;

import com.hendisantika.carrestservice.domain.Car;
import com.hendisantika.carrestservice.projection.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

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

    //    @Query("SELECT DISTINCT c.brand as brand from Car c")
//    List<String> getBrand();
//    Collection<BrandOnly> getBrand();
    List<Brand> findDistinctByBrand(String brand);

}
