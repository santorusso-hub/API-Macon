package com.techprudent.springbootrestcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trip")
public class Trip {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_trip")
	@Getter @Setter
	private long id;

	@ManyToOne
	@JoinColumn(name="id_ticket")
	@Getter @Setter
	private Tickets idTicket;

	@Column(name = "priceTotal")
	@Getter @Setter
	private Long priceTotal;


	public Trip() {
		//this.priceTotal=idTicket.getIdRoute().getPrice()*ticketAmount;
	}
}
