package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.Route;

import java.util.List;

public interface RouteService {

	public void delete(long id) ;

	public Route update(Route route);

	public Route create(Route route) ;

	public Route findById(long id) ;

	public List<Route> findAll();

	public List<Route> findByDepartureCityAndCityArrival(String partida,String chegada);



}
