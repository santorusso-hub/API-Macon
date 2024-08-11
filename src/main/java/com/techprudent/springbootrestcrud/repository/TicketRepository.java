package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Payment;
import com.techprudent.springbootrestcrud.model.Tickets;
import com.techprudent.springbootrestcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TicketRepository extends JpaRepository<Tickets, Long> {
       //User findUse;

    @Query(value = "SELECT * FROM tickets  as t INNER JOIN client  as c " +
            " ON t.id_client=c.id_client" +
            " INNER JOIN route as r" +
            " ON t.id_route=r.id_route;", nativeQuery = true)
    List<Tickets> getAllTickets();

    @Query(value = "SELECT * FROM tickets  as t INNER JOIN client  as c " +
            " ON t.id_client=c.id_client" +
            " INNER JOIN route as r" +
            " ON t.id_route=r.id_route" +
            "WHERE r.city_arrival=:cityArrival  AND r.departure_city=:departureCity;", nativeQuery = true)
    Tickets getRangeCity(@Param("cityArrival") String cityArrival,@Param("departureCity") String departureCity);


    public Tickets findByIdRoute_Id(Long id);

    @Modifying
    @Transactional
    public void  deleteTicketsById(long id);

    /*
    @Modifying
    @Query("set foreign_key_checks=0; delete from Tickets as t where t.id = ?1;")
    void deleteTicketsById(long id);

    @Modifying
    @Query("delete from Tickets t where t.id=:id")
    void deleteTicketsById(@Param("id") long id);
     */


    @Query(value = "SELECT * FROM tickets ORDER BY id_ticket DESC;", nativeQuery = true)
    List<Tickets> findLastNumberTickets();

    List<Tickets> findByIdClient_NameContains(String nome);





}
