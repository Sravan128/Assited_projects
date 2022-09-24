package com.sp.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {

	@Autowired
    PersonRepository repo;

	private RestTemplate template=new RestTemplate();
	public PersonEntity addPerson(PersonEntity person) {
		// TODO Auto-generated method stub
		
		return repo.save(person);
	}

	public Response getPersonWithHobby(int personId) {
		// TODO Auto-generated method stub
		final String url="http://localhost:8082/hobby/{personId}";
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("personId",personId);
		String hobby=template.getForObject(url,String.class,map);
		PersonEntity entity=repo.findById(personId).get();
		Response resp=new Response();
		resp.setEntity(entity);
		resp.setHobby(hobby);
		return resp;
	}
	
	
}
