package com.cgm.repository;

import org.springframework.stereotype.Repository;

import com.cgm.domain.Message;

@Repository
public class MessageDAO extends AbstractDAO<Message> {
	protected MessageDAO() {
		super(Message.class);
	}

}
