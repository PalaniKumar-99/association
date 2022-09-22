package com.example.demo.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="Authors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEntity {
	@Id
	private Integer id;
	@Column(length = 20)
	private String name;
}
