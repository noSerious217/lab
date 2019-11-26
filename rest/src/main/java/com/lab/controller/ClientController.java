package com.lab.controller;

import com.lab.entity.Client;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientController extends PagingAndSortingRepository<Client,Long> {

}
