package com.example.REST_API.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.REST_API.entities.Book;

@Service
public class BookService {
	
	private static List<Book> list = new ArrayList<>();
	static {
		list.add(new Book(123, "ABC", "auto"));
		list.add(new Book(1234, "ABCd", "auto2"));
		list.add(new Book(1235, "ABCr", "aut3"));
	}
	
	public List<Book> getBooks(){
		return list;
	}
	
	public Book getBookById(int id) {
		
		Book book = list.stream().filter(e -> e.getId()==id).findFirst().get();
		return book;
	}
	
	public Book addBook(Book book) {
		list.add(book);
		return book;
	}

}

