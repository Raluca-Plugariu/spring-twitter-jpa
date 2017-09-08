package com.cgm.twitter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cgm.domain.User;
import com.cgm.repository.AbstractDAO;
import com.cgm.repository.UserDAO;

@RestController
public class MessageController {
	@Autowired
	AbstractDAO<User> userDAO;
	
	public final static Logger logger = LoggerFactory
			.getLogger(MessageController.class);

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody User getUser(@PathVariable Long id )throws Exception {
		logger.info("Called get Artist (" + id + ") service!");
		return userDAO.findById(1L);
		
	}

	
}
