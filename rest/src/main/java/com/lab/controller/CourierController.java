package com.lab.controller;

import com.lab.entity.Courier;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourierController extends PagingAndSortingRepository<Courier, Long> {
}
