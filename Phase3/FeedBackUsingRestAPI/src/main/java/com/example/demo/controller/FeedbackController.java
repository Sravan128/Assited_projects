package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.FeedbackService;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

	
	@Autowired
	private FeedbackService feedbackService;
	
	@GetMapping
	public String feedback() {
		return "feedback";
	}
}
