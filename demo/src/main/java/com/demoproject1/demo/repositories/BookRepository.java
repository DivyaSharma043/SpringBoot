package com.demoproject1.demo.repositories;

import com.demoproject1.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
