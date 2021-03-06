package com.onlinestoreadmin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinestoreadmin.domain.Book;
import com.onlinestoreadmin.repository.BookRepository;
import com.onlinestoreadmin.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book save(Book book) {
		return bookRepository.save(book);
	}
	
	public List<Book> findAll() {
		return (List<Book>) bookRepository.findAll();
	}
	
	public Book findOne(Long id) {
		return bookRepository.findById(id).orElse(null);
	}
	
	public void removeOne(Long id) {
		bookRepository.deleteById(id);
	}
}
