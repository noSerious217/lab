package com.lab.repository;

import com.lab.entity.DishInOrder;
import com.lab.util.DishInOrderId;
import org.springframework.data.repository.CrudRepository;

public interface DishInOrderRepository extends CrudRepository<DishInOrder, DishInOrderId> {
    DishInOrder findByDishidAndOrderid(Long dishid, Long orderid);
}
