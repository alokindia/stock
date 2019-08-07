package com.cts.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.Book;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void saveBook(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
		System.out.println();
		
	}

	@Override
	public List<Book> listBooks() {
		System.out.println("hello" +sessionFactory);
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
		Root<Book> root = criteriaQuery.from(Book.class);
		criteriaQuery.select(root);
		Query query = session.createQuery(criteriaQuery);
		return query.getResultList();
	}

	@Override
	public Book getBook(int bookId) {
		Book book = null;
		try{
			Session session = sessionFactory.getCurrentSession();
			book = session.get(Book.class, bookId);
			System.out.println("Book id was "+bookId+" Object is "+book);
			if(book==null){
				
				System.out.println("Book does not exist");
			}
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return book;
	}

	@Override
	public void deleteBook(int id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = (Book)session.load(Book.class, id);
		session.delete(book);
	}

	@Override
	public void editBook(Book b) {
		Session session = sessionFactory.getCurrentSession();
		Book book = (Book)session.load(Book.class, b.getId());

		session.saveOrUpdate(book);
		
	}

}
