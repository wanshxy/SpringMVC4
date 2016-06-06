package com.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sp.domain.Book;

@Controller
public class AjaxController {
	@RequestMapping(value="ajax",method=RequestMethod.GET)
	public Book Ajax(){
		Book book=new Book();
		book.setId(3);
		book.setName("haoshu");
		book.setPage("36");
		return book;
		
	}
}
