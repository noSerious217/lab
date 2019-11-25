package com.lab.repository;

import com.lab.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {
    Order findById(long id);
}
