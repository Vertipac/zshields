package com.vertipac.dto.master;

import java.io.Serializable;

public class EventDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	
	private String place;
	
	private String time;
	
	private String comment;
	
	public EventDTO(){
		
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "ExamDTO[id=" + id + ",name=" + name + ",palce=" + place + ",time=" + time + ",comment=" + comment + "]";
	}

}
