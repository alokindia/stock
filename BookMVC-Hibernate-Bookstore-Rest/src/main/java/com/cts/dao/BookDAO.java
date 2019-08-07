package com.cts.dao;

import java.util.List;

import com.cts.entity.Book;

public interface BookDAO {
	void saveBook(Book book);
	void editBook(Book book);
	List<Book> listBooks();
	Book getBook(int theId);
	void deleteBook(int id);
}
