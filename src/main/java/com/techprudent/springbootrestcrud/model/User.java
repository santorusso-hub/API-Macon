package com.techprudent.springbootrestcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Santos Russo
 */

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_user")
	@Getter @Setter
	private long id;

	@Column(name = "name",length = 100)
	@Getter @Setter
	private String name;

	@Column(name = "login",length = 100)
	@Getter @Setter
	private String login;

	@Column(name = "Password",nullable = false,length =100)
	@Getter @Setter
	private String password;

}
