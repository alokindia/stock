package com.cts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.BookDAO;
import com.cts.entity.Book;

@Service("bookService")
public class BookServiceImpl implements BookService{

	@Autowired //To create object
	private BookDAO bookDAO;

	@Override
	@Transactional //To handle at spring level 
	public void saveBook(Book book) {
		System.out.println("Save from service");
		bookDAO.saveBook(book);
		
	}

	@Override
	@Transactional
	public List<Book> listAllBooks() {
		
		return bookDAO.listBooks();
	}

	@Override
	@Transactional
	public Book getBook(int theId) {
		Book book = bookDAO.getBook(theId);
		System.out.println("service book "+book.getAuthor());
		return book;
	}

	@Override
	@Transactional
	public void deleteBook(int id) {
		bookDAO.deleteBook(id);
	}

	@Override
	@Transactional
	public void editBook(Book book) {
		bookDAO.editBook(book);
	}
}
