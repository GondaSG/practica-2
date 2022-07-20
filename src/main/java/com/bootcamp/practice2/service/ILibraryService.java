package com.bootcamp.practice2.service;

import com.bootcamp.practice2.model.Library;

import java.util.List;

public interface ILibraryService {

    List<Library> findAll();

    Library findById(long id);

    Library create(Library library);

    Library update(Library library);

    void delete(long id);

    void deleteById(long id);

    Library save(Library library);
}
