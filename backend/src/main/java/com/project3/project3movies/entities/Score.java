package com.project3.project3movies.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id;
	private Double value;
	
	public Score() {
	}

	public Score(ScorePK id, Double value) {
		this.id = id;
		this.value = value;
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}
