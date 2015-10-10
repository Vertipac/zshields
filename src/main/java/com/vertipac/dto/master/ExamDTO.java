package com.vertipac.dto.master;

import java.io.Serializable;

public class ExamDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	
	private String name;
	
	private String comment;
	
	public ExamDTO(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "ExamDTO[id=" + id + ", name=" + name + ", comment=" + comment + "]";
	}

}
