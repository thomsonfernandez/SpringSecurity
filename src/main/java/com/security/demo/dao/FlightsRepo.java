package com.security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.demo.model.Flights;

public interface FlightsRepo extends JpaRepository<Flights, String>
{

}
