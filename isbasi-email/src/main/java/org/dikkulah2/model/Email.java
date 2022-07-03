package org.dikkulah2.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Email {
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	private String to;
	private String title;
	private String email;


}
