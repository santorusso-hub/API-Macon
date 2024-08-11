package com.techprudent.springbootrestcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Santos Russo
 */

@Entity
@Table(name = "route")
public class Route {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_route",unique = true,nullable = false)
	@Getter @Setter
	private long id;

	@Column(name = "price")
	@Getter @Setter
	private Long price;

	@Column(name = "DepartureCity",length = 100)
	@Getter @Setter
	private String departureCity;

	@Column(name = "CityArrival",length = 100)
	@Getter @Setter
	private String cityArrival;

	@Column(name = "BusStop",length = 100)
	@Getter @Setter
	private String busStop;

	@Column(name = "description",length = 100)
	@Getter @Setter
	private String description;

	public Route() {
		//this.price=0L;
	}
}
