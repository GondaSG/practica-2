package com.bootcamp.practice2.service;

import com.bootcamp.practice2.model.Client;

import java.util.List;

public interface IClientService {
    List<Client> findAll();
    Client findById(long id);
    Client create(Client client);
    Client update(Client client);
    void delete(long id);
}
