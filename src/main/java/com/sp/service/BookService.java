package com.sp.service;

import java.util.List;

import com.sp.domain.Book;

public interface BookService {
	List<Book> findAll();
	boolean update(Book book);
	boolean delete(int id);
	Book findById(int id);
	void insert(Book book);
}
