package com.hendisantika.carrestservice.projection;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * Project : car-rest-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/01/18
 * Time: 07.12
 * To change this template use File | Settings | File Templates.
 */
public class Brand {
    private final String brand;

    public Brand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand1 = (Brand) o;
        return Objects.equals(brand, brand1.brand);
    }

    @Override
    public int hashCode() {

        return Objects.hash(brand);
    }
}
