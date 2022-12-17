package com.tracuucayduoclieu.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="TINHVI")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "matinhvi")
public class Tinhvi {
	
	@Id
	@Column(name="IDTINHVI")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matinhvi;
	
	@Column(name="TENTINHVI")
	private String tentinhvi;
	
	@ManyToMany(mappedBy = "tinhvi")
	@JsonIgnore
	private List<Cayduoclieu> cayduoclieu;
	
	public List<Cayduoclieu> getCayduoclieu() {
		return cayduoclieu;
	}
	public void setCayduoclieu(List<Cayduoclieu> cayduoclieu) {
		this.cayduoclieu = cayduoclieu;
	}
	@Override
	public String toString() {
		return "Tinhvi [matinhvi=" + matinhvi + ", tentinhvi=" + tentinhvi +"cayduoclieu="+cayduoclieu+"]";
	}
	public int getMatinhvi() {
		return matinhvi;
	}
	public void setMatinhvi(int matinhvi) {
		this.matinhvi = matinhvi;
	}
	public String getTentinhvi() {
		return tentinhvi;
	}
	public void setTentinhvi(String tentinhvi) {
		this.tentinhvi = tentinhvi;
	}
	
}
