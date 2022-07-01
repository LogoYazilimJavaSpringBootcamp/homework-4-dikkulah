package org.dikkulah.model;

import javax.persistence.*;


@Entity
public class Email {
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	private String to;
	private String title;
	private String email;




}
