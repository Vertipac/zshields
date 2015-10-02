package com.vertipac.models.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the STANDARD database table.
 * 
 */
@Entity
@Table(name = "STANDARD")
@NamedQuery(name="Standard.findAll", query="SELECT s FROM Standard s")
public class Standard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;

	@Column(name = "COMMENT", nullable = false)
	private String comment;

	@Column(name = "DIVISION", nullable = false)
	private String division;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "TYPE", nullable = false)
	private Integer type;

	//bi-directional many-to-one association to Progress
	/*@OneToMany(mappedBy="standard")
	private List<Progress> progresses;

	//bi-directional many-to-one association to StandardExamMap
	@OneToMany(mappedBy="standard")
	private List<StandardExamMap> standardExamMaps;*/

	public Standard() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
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

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
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