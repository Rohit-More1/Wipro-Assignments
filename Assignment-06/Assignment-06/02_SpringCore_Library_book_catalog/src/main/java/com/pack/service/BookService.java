package com.pack.service;

import java.util.ArrayList;
import java.util.List;

import com.pack.model.Book;

public class BookService {

	private List<Book> bookList = new ArrayList<>();
	

	
	public BookService() {
		super();
	}
	public void addBook(Book book) {
		//System.out.println("done");
		this.bookList.add(book);
		
	}
	public Book getBookByTitle(String title){
		Book customer = this.bookList.stream()
        .filter(p -> p.getBkTitle().equals(title))
        .findFirst().orElse(null);
		
		return customer;
	}
	
	public List<Book> getAllBooks(){
		return this.bookList;
	}

}
