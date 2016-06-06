package com.sp.dao;

import java.util.List;

import com.sp.domain.Book;

public interface DAO {
	List<Book> findAll();
	boolean update(Book book);
	boolean delete(int id);
	Book findById(int id);
	void insert(Book book);
}
