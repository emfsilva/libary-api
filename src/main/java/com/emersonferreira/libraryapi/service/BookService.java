package com.emersonferreira.libraryapi.service;


import com.emersonferreira.libraryapi.api.model.entity.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Book save (Book any);
}
