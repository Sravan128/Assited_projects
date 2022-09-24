package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserFeedBack {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String reason;
	private String feedback;
}
