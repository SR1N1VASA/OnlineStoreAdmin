package com.onlinestoreadmin.service;

import java.util.List;
import com.onlinestoreadmin.domain.Book;

public interface BookService {
	
	Book save(Book book);
	
	List<Book> findAll();
	
	Book findOne(Long id);
	
	void removeOne(Long id);

}
