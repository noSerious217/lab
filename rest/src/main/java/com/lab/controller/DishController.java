package com.lab.controller;

import com.lab.entity.Dish;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DishController extends PagingAndSortingRepository<Dish, Long> {
}
