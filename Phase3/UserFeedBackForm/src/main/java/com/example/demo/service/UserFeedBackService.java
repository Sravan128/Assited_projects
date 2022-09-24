package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.bean.UserFeedBack;
import com.example.demo.dao.UserFeedBackDao;

@Service
public class UserFeedBackService {

	
	private UserFeedBackDao userfeedbackdao;

	public UserFeedBackService(UserFeedBackDao userfeedbackdao) {
		super();
		this.userfeedbackdao = userfeedbackdao;
	}
	
	
	public UserFeedBack saveFeedback(UserFeedBack feedback) {
		return userfeedbackdao.save(feedback);
	}
}
