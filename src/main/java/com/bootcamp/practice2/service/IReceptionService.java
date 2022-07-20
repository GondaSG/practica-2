package com.bootcamp.practice2.service;

import com.bootcamp.practice2.model.Reception;

import java.util.List;

public interface IReceptionService {

    List<Reception> findAll();
    Reception findById(long id);
    Reception create(Reception reception);
    Reception update(Reception reception);
    void delete(long id);

    void deleteById(long id);

    Reception save(Reception reception);
}
