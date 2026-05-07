package com.store.bookmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.bookmanagement.dao.BookDAO;
import com.store.bookmanagement.entity.Book;

@Service
public class BookServiceImplementation  implements BookService {

	
	  @Autowired
	    private BookDAO bookDAO;

	    // Add Book
	    @Override
	    public Book addBook(Book book) {

	        return bookDAO.addBook(book);
	    }

	    // Get All Books
	    @Override
	    public List<Book> getAllBooks() {

	        return bookDAO.getAllBooks();
	    }

	    // Update Book
	    @Override
	    
	    
	    
	    
	    
	    public Book updateBook(String id, Book book) {

	        return bookDAO.updateBook(id, book);
	    }

	    // Delete Book
	    @Override
	    public String deleteBook(String id) {

	        return bookDAO.deleteBook(id);
	    }
	}

