package com.sin.pattern.movieticket.DAO;
//import  com.sin.pattern.movieticket.DAO.TicketDao.create;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sin.pattern.movieticket.entites.Movieticket;
@Repository
public class TicketDaoImpl implements TicketDao {

	private static final String sql = "insert into ticket(movie,screen,seat) values(?,?,?)";
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	
   public void create (Movieticket ticket) {
		
		
		
		
		jdbcTemplate.update (sql,ticket.getId(), ticket.getSeat(),ticket.getMovie(),ticket.getScreen());
		
		
	}

}
