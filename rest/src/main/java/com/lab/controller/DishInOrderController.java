package com.lab.controller;

import com.lab.entity.DishInOrder;
import com.lab.util.DishInOrderId;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DishInOrderController extends PagingAndSortingRepository<DishInOrder, DishInOrderId> {
}
