package com.techprudent.springbootrestcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Santos Russo
 */

@Entity
@Table(name = "typePayment")
public class TypePayment {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_type_payment")
	@Getter @Setter
	private Long id;

	@Column(name = "typePayment",length = 100)
	@Getter @Setter
	private String typePayment;

}
