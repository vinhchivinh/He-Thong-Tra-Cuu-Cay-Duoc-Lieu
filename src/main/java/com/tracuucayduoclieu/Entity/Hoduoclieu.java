package com.tracuucayduoclieu.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="HODUOCLIEU")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "mahoduoclieu")
public class Hoduoclieu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDHO")
	private int mahoduoclieu;
	
	@Column(name="TENHO")
	private String tenhoduoclieu;
	
	@OneToMany(mappedBy = "maho")
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
		return "Hoduoclieu [mahoduoclieu=" + mahoduoclieu + ", tenhoduoclieu=" + tenhoduoclieu + "]";
	}
	public int getMahoduoclieu() {
		return mahoduoclieu;
	}
	public void setMahoduoclieu(int mahoduoclieu) {
		this.mahoduoclieu = mahoduoclieu;
	}
	public String getTenhoduoclieu() {
		return tenhoduoclieu;
	}
	public void setTenhoduoclieu(String tenhoduoclieu) {
		this.tenhoduoclieu = tenhoduoclieu;
	}
	
}
