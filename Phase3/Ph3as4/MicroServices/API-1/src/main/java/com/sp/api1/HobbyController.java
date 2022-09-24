package com.sp.api1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hobby")
public class HobbyController {
    
	@Autowired
	HobbyService service;
	
	@PostMapping("/")
	public ResponseEntity<Object> addHobby(@RequestBody HobbyEntity hb){
		HobbyEntity data=service.addHobby(hb);
		if(data!=null)
			return new ResponseEntity<Object>(data,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while inserting",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/{personId}")
	public ResponseEntity<Object> findHobby(@PathVariable int personId){
		String d=service.findByPersonId(personId);
		if(d!=null)
			return new ResponseEntity<Object>(d,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Hobby Not Found",HttpStatus.NOT_FOUND);
	}
}
