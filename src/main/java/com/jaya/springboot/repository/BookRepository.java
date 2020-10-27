package com.jaya.springboot.repository;

import com.jaya.springboot.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
