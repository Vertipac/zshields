package com.vertipac.dto.master;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the STANDARD database table.
 * 
 */
public class StandardDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String comment;

	private String division;

	private String name;

	private int type;

	//bi-directional many-to-one association to Progress
	/*@OneToMany(mappedBy="standard")
	private List<Progress> progresses;

	//bi-directional many-to-one association to StandardExamMap
	@OneToMany(mappedBy="standard")
	private List<StandardExamMap> standardExamMaps;*/

	public StandardDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "StandardDTO [id=" + id + ", comment=" + comment + ", division=" + division + ", name=" + name
				+ ", type=" + type + "]";
	}

	/*public List<Progress> getProgresses() {
		return this.progresses;
	}

	public void setProgresses(List<Progress> progresses) {
		this.progresses = progresses;
	}

	public Progress addProgress(Progress progress) {
		getProgresses().add(progress);
		progress.setStandard(this);

		return progress;
	}

	public Progress removeProgress(Progress progress) {
		getProgresses().remove(progress);
		progress.setStandard(null);

		return progress;
	}

	public List<StandardExamMap> getStandardExamMaps() {
		return this.standardExamMaps;
	}

	public void setStandardExamMaps(List<StandardExamMap> standardExamMaps) {
		this.standardExamMaps = standardExamMaps;
	}

	public StandardExamMap addStandardExamMap(StandardExamMap standardExamMap) {
		getStandardExamMaps().add(standardExamMap);
		standardExamMap.setStandard(this);

		return standardExamMap;
	}

	public StandardExamMap removeStandardExamMap(StandardExamMap standardExamMap) {
		getStandardExamMaps().remove(standardExamMap);
		standardExamMap.setStandard(null);

		return standardExamMap;
	}*/

	
}