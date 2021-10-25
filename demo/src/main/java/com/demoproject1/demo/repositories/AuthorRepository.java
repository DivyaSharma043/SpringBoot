package com.demoproject1.demo.repositories;

import com.demoproject1.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
