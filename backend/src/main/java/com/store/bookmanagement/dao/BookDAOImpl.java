package com.store.bookmanagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.store.bookmanagement.entity.Book;
import com.store.bookmanagement.repository.BookRepository;

@Repository
public class BookDAOImpl implements BookDAO{

	@Autowired
	private BookRepository bookRepository;

	// Add Book
	@Override
	public Book addBook(Book book) {

		return bookRepository.save(book);
	}

	// Get All Books
	@Override
	public List<Book> getAllBooks() {

		return bookRepository.findAll();
	}

	// Update Book
	@Override
	public Book updateBook(String id, Book book) {

		Optional<Book> optionalBook = bookRepository.findById(id);

		if (optionalBook.isPresent()) {

			Book existingBook = optionalBook.get();

			existingBook.setTitle(book.getTitle());
			existingBook.setAuthor(book.getAuthor());
			existingBook.setPrice(book.getPrice());
			existingBook.setCategory(book.getCategory());

			return bookRepository.save(existingBook);
		}

		return null;
	}

	// Delete Book
	@Override
	public String deleteBook(String id) {

		bookRepository.deleteById(id);

		return "Book Deleted Successfully";
	}

}
