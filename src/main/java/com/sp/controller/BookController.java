package com.sp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sp.domain.Book;
import com.sp.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService bookService;

	// 最好能改成json的形式
	@RequestMapping("")
	public String list(HttpServletRequest request) {
		List<Book> list = bookService.findAll();
		// 这是session的
		request.setAttribute("list", list);
		return "list";
	}

	@RequestMapping("/toinsert")
	public String toinsert() {
		return "/insertBook";
	}

	// 插入
	@RequestMapping("/insert")
	public String insert(Book book, HttpServletRequest request) {
		bookService.insert(book);
		return "redirect:/book";
	}

	// 删除
	@RequestMapping("/delete")
	public String delete(int id, HttpServletRequest request) {
		bookService.delete(id);
		return "redirect:/book";
	}

	// 去修改页面
	@RequestMapping("toedit")
	public String toedit() {
		return "editBook";
	}

	// 修改
	@RequestMapping("edit")
	public String edit(Book book, HttpServletRequest request) {
		bookService.update(book);
		return "redirect:/book";
	}
}
