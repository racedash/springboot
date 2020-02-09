package com.sin.pattern.movieticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sin.pattern.movieticket.DAO.TicketDao;
import com.sin.pattern.movieticket.entites.Movieticket;

@Controller
public class TicketController {
	@Autowired
	private TicketDao dao;
	
	@RequestMapping("/showCreateTicket")
	public String showCreateTicket() {
		return "createTicket";
	}
		public String createTicket(Movieticket ticket,ModelMap modelmap) {
			((TicketDao) dao).create(ticket);
			modelmap.addAttribute("msg","ticket created");
			
			return "createTicket";
			
			
		}
		
	
	

}
