package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.UserFeedBack;


public interface UserFeedBackDao extends JpaRepository<UserFeedBack,Integer> {
      
}
