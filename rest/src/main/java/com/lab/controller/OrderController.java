package com.lab.controller;

import com.lab.entity.Order;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderController extends PagingAndSortingRepository<Order, Long> {
}
