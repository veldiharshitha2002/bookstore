package com.store.bookmanagement.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "books")
@Data
public class Book {
	
	  @Id
	    private String id;

	    private String title;

	    private String author;

	    private Double price;

	    private String category;
	
}