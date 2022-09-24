package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.UserFeedBack;
import com.example.demo.service.UserFeedBackService;

@RestController
@RequestMapping("/api/feedback")
public class UserFeedBackController {

	
	private UserFeedBackService feedbackservice;

	public UserFeedBackController(UserFeedBackService feedbackservice) {
		super();
		this.feedbackservice = feedbackservice;
	}
	
	@PostMapping
	public ResponseEntity<UserFeedBack> savefeedback(UserFeedBack feedback){
		return new ResponseEntity<UserFeedBack>(feedbackservice.saveFeedback(feedback),HttpStatus.CREATED);
	}
}
