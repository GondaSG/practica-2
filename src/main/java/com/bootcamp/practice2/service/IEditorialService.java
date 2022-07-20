package com.bootcamp.practice2.service;

import com.bootcamp.practice2.model.Editorial;

import java.util.List;

public interface IEditorialService {
    List<Editorial> findAll();

    Editorial findById(long id);

    Editorial create(Editorial editorial);

    Editorial update(Editorial editorial);

    void delete(long id);

    void deleteById(long id);

    Editorial save(Editorial editorial);
}
