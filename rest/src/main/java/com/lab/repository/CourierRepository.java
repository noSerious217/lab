package com.lab.repository;

import com.lab.entity.Courier;
import org.springframework.data.repository.CrudRepository;

public interface CourierRepository extends CrudRepository<Courier,Long> {
    Courier findById(long id);
}
