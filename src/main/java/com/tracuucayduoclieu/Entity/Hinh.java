package com.tracuucayduoclieu.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="HINH")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "mahinh")
public class Hinh {
	
	@Id
	@Column(name="IDHINH")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mahinh;
	
	@ManyToOne
	@JoinColumn(name="IDCAYDUOCLIEU")
	@JsonIgnore
	private Cayduoclieu maduoclieu;
	
	@Column(name="TENHINH")
	private String tenhinh;
	
//	@OneToOne(mappedBy = "mabaiviet")
//	private Baiviet baiviet;
	
//	public Baiviet getBaiviet() {
//		return baiviet;
//	}
//	public void setBaiviet(Baiviet baiviet) {
//		this.baiviet = baiviet;
//	}
	@Override
	public String toString() {
		return "Hinh [mahinh=" + mahinh + ", maduoclieu=" + maduoclieu + ", tenhinh=" + tenhinh + "]";
	}
	public int getMahinh() {
		return mahinh;
	}
	public void setMahinh(int mahinh) {
		this.mahinh = mahinh;
	}
	public Cayduoclieu getMaduoclieu() {
		return maduoclieu;
	}
	public void setMaduoclieu(Cayduoclieu maduoclieu) {
		this.maduoclieu = maduoclieu;
	}
	public String getTenhinh() {
		return tenhinh;
	}
	public void setTenhinh(String tenhinh) {
		this.tenhinh = tenhinh;
	}
}
