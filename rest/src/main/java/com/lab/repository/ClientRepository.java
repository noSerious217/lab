package com.lab.repository;

import com.lab.entity.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client,Long> {
    List<Client> findByEmailContains(String email);
    Client findById(long id);
}
