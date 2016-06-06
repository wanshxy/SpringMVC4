package com.sp.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sp.dao.DAO;
import com.sp.domain.Book;
import com.sp.service.BookService;
@Service
@Transactional
public class BookServiceImpl implements BookService{

	@Resource
	private DAO dao;
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public boolean update(Book book) {
		// TODO Auto-generated method stub
		return dao.update(book);
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	public Book findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	public void insert(Book book) {
		// TODO Auto-generated method stub
		dao.insert(book);
	}

}
