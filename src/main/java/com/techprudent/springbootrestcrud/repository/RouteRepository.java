package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Route;
import com.techprudent.springbootrestcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RouteRepository extends JpaRepository<Route, Long> {

        Route findRouteById(Long id);

        List<Route> findByDepartureCityContains(String departureCity);

        List<Route> findByCityArrivalContains(String cityArrival);

        List<Route> findByDepartureCityAndCityArrival(String departureCity,String cityArrival);

}
