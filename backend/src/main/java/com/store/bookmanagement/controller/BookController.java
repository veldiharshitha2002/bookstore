package com.store.bookmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.bookmanagement.entity.Book;
import com.store.bookmanagement.service.BookService;

@RestController
@RequestMapping("/books")
@CrossOrigin("*")
public class BookController {

	
	//----@#$
	 @Autowired
	    private BookService bookService;

	    // Add Book
	    @PostMapping
	    public Book addBook(@RequestBody Book book) {

	        return bookService.addBook(book);
	    }

	    // Get All Books 
	    @GetMapping
	    public List<Book> getAllBooks() {

	        return bookService.getAllBooks();
	    }

	    // Update Book
	    @PutMapping("/{id}")
	    public Book updateBook(@PathVariable String id,
	                           @RequestBody Book book) {
	   return bookService.updateBook(id, book);
	    }

	    // Delete Book
	    @DeleteMapping("/{id}")
	    public String deleteBook(@PathVariable String id) {

	        return bookService.deleteBook(id);
	    }

//Controller to know update
}

