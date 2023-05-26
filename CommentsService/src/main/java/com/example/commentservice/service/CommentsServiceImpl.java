package com.example.commentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.commentservice.model.Comments;
import com.example.commentservice.repo.CommentsRepo;

@Service
public class CommentsServiceImpl implements CommentsService {
	
	@Autowired
	CommentsRepo commentsRepo;

	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return null;
	}
}
