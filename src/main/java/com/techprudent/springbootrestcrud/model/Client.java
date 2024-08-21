package com.techprudent.springbootrestcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Santos Russo
 */

@Entity
@Table(name = "client")
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_client")
	@Getter @Setter
	private long id;

	@Column(name = "name",length = 100)
	@Getter @Setter
	private String name;

	@Column(name = "BI",length = 80)
	@Getter @Setter
	private String bi;

	@Column(name = "Neighborhood",nullable = false,length =100)
	@Getter @Setter
	private String neighborhood;

	@Column(name = "Phone",nullable = false,length =100)
	@Getter @Setter
	private Long phone;

}
