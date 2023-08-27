package com.example.REST_API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.REST_API.entities.Book;
import com.example.REST_API.service.BookService;

//if we are working in MVC then @controller can be used to return view but if using REST APIs then we need to use 
//@RestController and with it we don't need @ResponseBody
/*
 * @Controller public class BookController {
 * 
 * @RequestMapping(value = "/books", method = RequestMethod.GET)
 * 
 * @ResponseBody public String getBooks() { return "all books returned"; }
 * 
 * }
 */

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
//	@RequestMapping(value = "/books", method = RequestMethod.GET)
	@GetMapping("/books")
	public List<Book> getBooks() {
//		return "all books returned";
		return bookService.getBooks();
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		Book b = bookService.addBook(book);
		return b;
	}

}
