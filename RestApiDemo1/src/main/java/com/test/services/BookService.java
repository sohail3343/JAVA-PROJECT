package com.test.services;

import com.test.entities.books;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.test.entities.books;

@Service
public class BookService {
	private static List<books> l = new ArrayList<>();

	static {
		l.add(new books(1, "java", "md"));
		l.add(new books(12, "python", "sk"));
		l.add(new books(123, "ccc", "md"));
		l.add(new books(1333, "android", "md"));
	}

	public List<books> getallBooks() {

		return l;
	}

	public books getbookByid(int id) {
		books books = l.stream().filter(e -> e.getId() == id).findFirst().get();
		return books;

	}

// adding the books
	public void addBooks(books b) {
		l.add(b);

	}

	// delete the books
	public void deleteBooks(int id) {
		l = l.stream().filter(book -> book.getId() != id).collect(Collectors.toList());

	}

	// update the book
	public void updateBooks(books b, int id) {
		l=l.stream().map(book -> {
			if (book.getId() == id) {
				book.setTitle(b.getTitle());
				book.setAuthor(b.getAuthor());

			}

			return book;
		}).collect(Collectors.toList());

	}
	
}
