package com.vertipac.dto.master;

import java.io.Serializable;

public class PersonDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int id;
	private String first_name;
	private String last_name;
	private String middle_name;
	private String email_1;
	private String email_2;
	private String add_line_1;
	private String add_1_line_2;
	private String add_1_pin;
	private String add_2_line_1;
	private String add_2_line_2;
	private String add_2_pin;
	private String phone_1;
	private String phone_2;
	private Integer type;
	private String comments;
	
	public PersonDTO(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getEmail_1() {
		return email_1;
	}

	public void setEmail_1(String email_1) {
		this.email_1 = email_1;
	}

	public String getEmail_2() {
		return email_2;
	}

	public void setEmail_2(String email_2) {
		this.email_2 = email_2;
	}

	public String getAdd_line_1() {
		return add_line_1;
	}

	public void setAdd_line_1(String add_line_1) {
		this.add_line_1 = add_line_1;
	}

	public String getAdd_1_line_2() {
		return add_1_line_2;
	}

	public void setAdd_1_line_2(String add_1_line_2) {
		this.add_1_line_2 = add_1_line_2;
	}

	public String getAdd_1_pin() {
		return add_1_pin;
	}

	public void setAdd_1_pin(String add_1_pin) {
		this.add_1_pin = add_1_pin;
	}

	public String getAdd_2_line_1() {
		return add_2_line_1;
	}

	public void setAdd_2_line_1(String add_2_line_1) {
		this.add_2_line_1 = add_2_line_1;
	}

	public String getAdd_2_line_2() {
		return add_2_line_2;
	}

	public void setAdd_2_line_2(String add_2_line_2) {
		this.add_2_line_2 = add_2_line_2;
	}

	public String getAdd_2_pin() {
		return add_2_pin;
	}

	public void setAdd_2_pin(String add_2_pin) {
		this.add_2_pin = add_2_pin;
	}

	public String getPhone_1() {
		return phone_1;
	}

	public void setPhone_1(String phone_1) {
		this.phone_1 = phone_1;
	}

	public String getPhone_2() {
		return phone_2;
	}

	public void setPhone_2(String phone_2) {
		this.phone_2 = phone_2;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", middle_name=" + middle_name
		+ ", email_1=" + email_1 + ", email_2=" + email_2 + ", add_line_1=" + add_line_1 + ", add_1_line_2=" + add_1_line_2 
		+ ", add_1_pin=" + add_1_pin + ", add_2_line_1=" + add_2_line_1 + ", add_2_line_2=" + add_2_line_2 + ",add_2_pin=" + add_2_pin 
		+ ", phone_1=" + phone_1 + ", phone_2=" + phone_2 + ", type=" + type + ", comments=" + comments + "]";
						
}
}
