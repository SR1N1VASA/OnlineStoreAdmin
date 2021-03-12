package com.onlinestoreadmin.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinestoreadmin.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
