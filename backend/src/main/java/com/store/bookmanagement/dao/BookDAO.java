package com.store.bookmanagement.dao;

import java.util.List;

import com.store.bookmanagement.entity.Book;

public interface BookDAO {
	Book addBook(Book book);

	List<Book> getAllBooks();

	Book updateBook(String id, Book book);

	String deleteBook(String id);
}
