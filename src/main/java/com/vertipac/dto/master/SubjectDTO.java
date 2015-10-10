package com.vertipac.dto.master;

import java.io.Serializable;

public class SubjectDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String comment;
	private int type;
	
	public SubjectDTO(){
		
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString(){
		return "SubjectDTO [id=" + id + ",name=" + name + ",comment=" + comment + ",type=" + type + "]";
	}

}
