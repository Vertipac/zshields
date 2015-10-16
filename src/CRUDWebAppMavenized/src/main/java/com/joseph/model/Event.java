package com.joseph.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String comment;
	
	@Column
	private String place;
	
	@Column
	private String time;
	
public Event(){}

public Event(int id, String name, String comment, String place, String time) {
	super();
	this.id = id;
	this.name = name;
	this.comment = comment;
	this.place = place;
	this.time = time;
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
	
}
