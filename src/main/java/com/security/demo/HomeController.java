package com.security.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.security.demo.dao.FlightsRepo;
import com.security.demo.model.Flights;


@Controller
public class HomeController 
{
	@Autowired
	FlightsRepo repo;
	
	@RequestMapping("home")
	public String home() 
	{
		
		return "home";
		
	}
	
	@RequestMapping("/getFlights")
	public ModelAndView addFlights(String flightNumber) 
	{
		ModelAndView mv = new ModelAndView("showFlights");
		Flights fl = repo.findById(flightNumber).orElse(new Flights());
		mv.addObject(fl);
		
//		System.out.println(repo.findByDepartureAirport("DXB"));
		return mv;
		
	}
	
	/*
	 * @RequestMapping("home") public ModelAndView myMethod(Flights flights) {
	 * ModelAndView mv = new ModelAndView(); mv.addObject("obj",flights);
	 * mv.setViewName("home"); return mv; }
	 */
}
