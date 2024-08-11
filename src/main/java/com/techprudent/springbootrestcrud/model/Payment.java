package com.techprudent.springbootrestcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Santos Russo
 */

@Entity
@Table(name = "payment")
public class Payment {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_payment")
	@Getter @Setter
	private long id;

	@ManyToOne
	@JoinColumn(name="id_type_payment")
	@Getter @Setter
	private TypePayment idTypePayment;

	@Column(name = "Password",length = 100)
	@Getter @Setter
	private String password;

}
