package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cts.entity.Book;
import com.cts.service.BookService;

@RestController
@RequestMapping( "/book")
/*
 * 
 * @Controller
 * 
 * @RequestMapping(value = "/book")
 */
public class BookController {

	@Autowired
	BookService bookService;

	// @RequestMapping(value="list", method=RequestMethod.GET)
	// public ModelAndView listAllBooksFromLogin(@RequestParam("username")
	// String username, @RequestParam("password") String password){
	// ModelAndView view = new ModelAndView("listbook");
	// view.addObject("username", username);
	// view.addObject("password", password);
	// return view;
	// }
	@RequestMapping("/")
	public String sayHi() {
		return "Hi spring boot";
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<Book>> listAllBooks() {
		List<Book> list = bookService.listAllBooks();
		System.out.println(list);
		 HttpHeaders responseHeaders = new HttpHeaders();
		 responseHeaders.set("Access-Control-Allow-Origin", "*");
		//model.addAttribute("books", list);
		//System.out.println("Return string");
		return new ResponseEntity<List<Book>>(list,responseHeaders, HttpStatus.OK);
	}
	/*public List<Book> listAllBooks(Model model) {
		List<Book> list = bookService.listAllBooks();
		System.out.println(list);
		//model.addAttribute("books", list);
		//System.out.println("Return string");
		return list;
	}*/
	/*
	 * @GetMapping("/list") public String listAllBooks(Model model) { List<Book>
	 * list = bookService.listAllBooks(); System.out.println(list);
	 * model.addAttribute("books", list); System.out.println("Return string");
	 * return "listbook"; }
	 * 
	 * @GetMapping("/insert") public String showAddForm() { return "addForm"; }
	 * 
	 * @GetMapping("/edit") public String showEditForm(@RequestParam("id") int
	 * id,Model model){ Book book = new Book(); book = bookService.getBook(id);
	 * System.out.println("book >> "+book.getId());
	 * model.addAttribute("bookList", book); return "editForm";
	 * 
	 * }
	 * 
	 * @GetMapping("/addBook") public String addBook(@RequestParam("title")
	 * String title, @RequestParam("author") String author,
	 * 
	 * @RequestParam("price") float price) { Book book = new Book(title, author,
	 * price); bookService.saveBook(book); return "redirect:/book/list"; }
	 * 
	 * @GetMapping("/editBook") public String editBook(@RequestParam("id") int
	 * id,@RequestParam("title") String title, @RequestParam("author") String
	 * author,
	 * 
	 * @RequestParam("price") float price) { Book book = new Book();
	 * book.setId(id); book.setPrice(price); book.setTitle(title);
	 * book.setAuthor(author);
	 * 
	 * bookService.saveBook(book); return "redirect:/book/list"; }
	 * 
	 * @GetMapping("/deleteBook") public String deleteBook(@RequestParam("id")
	 * int id) { bookService.deleteBook(id);
	 * 
	 * return "redirect:/book/list"; }
	 */
}
