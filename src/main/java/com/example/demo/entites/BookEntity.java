package com.example.demo.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity 
{
	@Id
	private Integer id;
	@Column(length = 14)
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="BOOK_AUTHORS",joinColumns = @JoinColumn(name = "BOOK_ID_FK"),
	inverseJoinColumns = @JoinColumn(name="AUTHOR_ID_FK"))
	private List<AuthorEntity> lstofauthors;
}
