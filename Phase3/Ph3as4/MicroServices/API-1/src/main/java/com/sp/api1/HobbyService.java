package com.sp.api1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbyService {

	@Autowired
	HobbyRepository repo;

	public HobbyEntity addHobby(HobbyEntity hb) {
		// TODO Auto-generated method stub
		return repo.save(hb);
	}

	public String findByPersonId(int personId) {
		// TODO Auto-generated method stub
		return repo.findByPersonId(personId);
	}
}
