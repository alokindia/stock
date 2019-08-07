package com.cts.service;

import java.util.List;

import com.cts.entity.Book;

public interface BookService {
	void saveBook(Book book);
	void editBook(Book book);
	List<Book> listAllBooks();
	public Book getBook(int theId);
	public void deleteBook(int theId);
}
