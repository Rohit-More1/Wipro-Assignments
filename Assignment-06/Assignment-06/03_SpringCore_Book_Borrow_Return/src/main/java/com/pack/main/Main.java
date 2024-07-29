package com.pack.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.model.Book;
import com.pack.service.BookService;
import com.pack.service.BorrowService;
import com.pack.service.NotificationService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService bookService = (BookService) context.getBean("bookService");
		BorrowService borrowService = (BorrowService) context.getBean("borrowService");
		NotificationService notificationService = (NotificationService) context.getBean("notificationService");
		
		// Add books to the catalog
		Book book1 = new Book();
		// Populate the book object
		book1.setTitle("Shiva The Lord");
		book1.setAuthor("Ram");
		book1.setAvailable(true);
		// Add it to list
		bookService.addBook(book1);
		
		Book book2 = new Book();
		// Populate the book object
		book2.setTitle("Jai Hind");
		book2.setAuthor("Roy");
		book2.setAvailable(true);
		// Add it to list
		bookService.addBook(book2);
		
		// Borrow a book
		borrowService.borrowBook("Ram", "Shiva The Lord",bookService);
		// Return a book and send notification
		System.out.println(borrowService.getTransactions());
		borrowService.returnBook("Shiva The Lord",bookService);
		notificationService.notifyReturn("Shiva The Lord");

	}

}
