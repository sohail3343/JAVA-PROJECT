package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.books;
import com.test.services.BookService;
@RestController
public class HomeController {
	@Autowired
	private BookService bookservice;
	@GetMapping("/books")
	public List<books> getBooks()
	{
		
		
		return this.bookservice.getallBooks() ;
	}
	@GetMapping("/books/{id}")
	public books getBook(@PathVariable("id") int id)
	{
		
		return bookservice.getbookByid(id);
	}
	@PostMapping("/books")
	public books addBooks( @RequestBody books b)
	{
		
		 this.bookservice.addBooks(b);
		 return b;
	}
	@DeleteMapping("/books/{id}")
	public  void deleteBooks( @PathVariable("id")int id) {
		 this.bookservice.deleteBooks(id);
		
	}
	@PutMapping("/books/{id}")
	public books updateBook(  @RequestBody books b,@PathVariable("id") int id)
	{
		this.bookservice.updateBooks(b,id);
		return b;
		
	}
}