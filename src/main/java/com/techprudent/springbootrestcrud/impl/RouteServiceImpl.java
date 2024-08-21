package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Route;
import com.techprudent.springbootrestcrud.repository.RouteRepository;
import com.techprudent.springbootrestcrud.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	private RouteRepository routeRepository;
	
	@Override
	public void delete(long id) {
		routeRepository.deleteById(id);
	}

	@Override
	public Route update(Route route) {
		return routeRepository.save(route);
	}

	@Override
	public Route create(Route route) {
		return routeRepository.save(route);
	}

	@Override
	public Route findById(long id) {
		return routeRepository.findRouteById(id);
	}

	@Override
	public List<Route> findAll() {
		return routeRepository.findAll();
	}

	@Override
	public List<Route> findByDepartureCityAndCityArrival(String partida,String chegada) {
		List<Route> listRoute=new ArrayList<Route>();

		if (partida!="null" && chegada.equalsIgnoreCase("null")) {
			listRoute = routeRepository.findByCityArrivalContains(partida);
		}else if (partida.equalsIgnoreCase("null") && chegada!="null"){
			listRoute = routeRepository.findByDepartureCityContains(chegada);
		}else if(partida!="null" && chegada!="null"){
			listRoute = routeRepository.findByDepartureCityAndCityArrival(chegada,partida );
		}

		if (partida.equalsIgnoreCase("null")&& chegada.equalsIgnoreCase("null")){
			listRoute=routeRepository.findAll();
		}

		return listRoute;
	}

}
