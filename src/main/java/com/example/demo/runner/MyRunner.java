package com.example.demo.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entites.AuthorEntity;
import com.example.demo.entites.BookEntity;
import com.example.demo.repository.BookRepository;
@Component
public class MyRunner implements ApplicationRunner {

@Autowired
private BookRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		BookEntity book1 = new BookEntity(109,"Java",null);
		BookEntity book2 = new BookEntity(305,"spring-boot",null);
		
		AuthorEntity author1 = new AuthorEntity(1,"James Gosling");
		AuthorEntity author2 = new AuthorEntity(2,"Patrik");
		AuthorEntity author3 = new AuthorEntity(3,"Jhonson");
		
		List<AuthorEntity> list = new ArrayList<AuthorEntity>();
		list.add(author1);list.add(author2);
		book1.setLstofauthors(list);
		
		List<AuthorEntity> springlist = new ArrayList<AuthorEntity>();
		springlist.add(author3);
		springlist.add(author2);
		book2.setLstofauthors(springlist);
		
		repo.save(book1);
		repo.save(book2);
	}

}
