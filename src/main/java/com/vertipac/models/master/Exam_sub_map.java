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
@Table(name = "EXAM_SUBJECT_MAP")
@NamedQuery(name="Exam_sub_map.findAll", query="SELECT e FROM Exam_sub_map e")
public class Exam_sub_map {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "EXAM_ID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "SUBJECT_ID", nullable = false)
	private Integer sub_id;
	
	@Column(name = "WEIGHTAGE", nullable = false)
	private Integer weightage;
	
	@Column(name = "TYPE", nullable = false)
	private Integer type;
	
	public Exam_sub_map(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSub_id() {
		return sub_id;
	}

	public void setSub_id(Integer sub_id) {
		this.sub_id = sub_id;
	}

	public Integer getWeightage() {
		return weightage;
	}

	public void setWeightage(Integer weightage) {
		this.weightage = weightage;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	

}
