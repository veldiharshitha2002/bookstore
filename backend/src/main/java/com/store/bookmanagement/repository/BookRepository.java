
package com.store.bookmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.store.bookmanagement.entity.Book;

public interface BookRepository extends MongoRepository<Book, String>{

}
