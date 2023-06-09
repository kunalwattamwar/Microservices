package com.example.commentservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comments {

	@Id
	private int cid;
	private int pid;
	private String comment;
	private String commenter;
	
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Comments(int cid, int pid, String comment, String commenter) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.comment = comment;
		this.commenter = commenter;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCommenter() {
		return commenter;
	}
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	
	
}
