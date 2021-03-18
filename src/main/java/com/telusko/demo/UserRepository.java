package com.telusko.demo;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

public class UserRepository {

	@Autowired
	EntityManager em;
	
	public User findById(int id) {
		return em.find(User.class, id);
	}
	
	public User save(User user) {
		if(user.getUserID()==null) {
			em.persist(user);
		}
		else {
			em.merge(user);
		}
		return user;
	}
	
}
