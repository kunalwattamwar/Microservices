package com.example.commentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.commentservice.model.Comments;

@Repository
public interface CommentsRepo extends JpaRepository<Comments, Integer> {

}
