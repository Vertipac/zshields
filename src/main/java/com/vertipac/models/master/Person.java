package com.vertipac.models.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "NAME_FIRST", nullable = false)
	private String first_name;
	
	@Column(name = "NAME_LAST", nullable = true)
	private String last_name;
	
	@Column(name = "NAME_MIDDLE", nullable = true)
	private String middle_name;
	
	@Column(name = "EMAIL_1", nullable = false,unique = true)
	private String email_1;
	
	@Column(name = "EMAIL_2", nullable = true,unique = true)
	private String email_2;
	
	@Column(name = "ADDRESS_1_LINE_1", nullable = false)
	private String add_line_1;
	
	@Column(name = "ADDRESS_1_LINE_2", nullable = false)
	private String add_1_line_2;
	
	@Column(name = "ADDRESS_1_PIN", nullable = false)
	private String add_1_pin;
	
	@Column(name = "ADDRESS_2_LINE_1", nullable = true)
	private String add_2_line_1;
	
	@Column(name = "ADDRESS_2_LINE_2", nullable = true)
	private String add_2_line_2;
	
	@Column(name = "ADDRESS_2_PIN", nullable = true)
	private String add_2_pin;
	
	@Column(name = "PHONE_1", nullable = false,unique=true)
	private String phone_1;
	
	@Column(name = "PHONE_2", nullable = true)
	private String phone_2;
	
	@Column(name = "TYPE", nullable = true)
	private Integer type;
	
	@Column(name = "COMMENTS", nullable = true)
	private String comments;
	
	public Person(){
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	
}
