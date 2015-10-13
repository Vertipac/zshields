package com.vertipac.dto.master;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int type;
	
	public StudentDTO(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "StudentDTO[id=" + id + ",type=" + type + "]";
	}

}
