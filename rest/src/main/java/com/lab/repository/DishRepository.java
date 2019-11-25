package com.lab.repository;

import com.lab.entity.Dish;
import org.springframework.data.repository.CrudRepository;

public interface DishRepository extends CrudRepository<Dish,Long> {
    Dish findById(long id);
}
