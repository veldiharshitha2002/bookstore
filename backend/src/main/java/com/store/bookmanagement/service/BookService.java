package com.store.bookmanagement.service;

import java.util.List;

import com.store.bookmanagement.entity.Book;

public interface BookService {

	
	  Book addBook(Book book);

	    List<Book> getAllBooks();

	    Book updateBook(String id, Book book);

	    String deleteBook(String id);
	    
}
