package com.tracuucayduoclieu.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BENH")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "mabenh")
public class Benh {
	
	@Id
	@Column(name="IDBENH")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mabenh;
	
	@Column(name="TENBENH")
	private String tenbenh;
	
//	@OneToOne
//	@JoinColumn(name="IDHINH")
//	private Hinh mahinh;
	
	@ManyToMany(mappedBy = "benh")
	@JsonIgnore
	private List<Cayduoclieu> cayduoclieu;

	
	public List<Cayduoclieu> getCayduoclieu() {
		return cayduoclieu;
	}
	public void setCayduoclieu(List<Cayduoclieu> cayduoclieu) {
		this.cayduoclieu = cayduoclieu;
	}
	public int getMabenh() {
		return mabenh;
	}
	public void setMabenh(int mabenh) {
		this.mabenh = mabenh;
	}
	public String getTenbenh() {
		return tenbenh;
	}
	public void setTenbenh(String tenbenh) {
		this.tenbenh = tenbenh;
	}
//	public Hinh getMahinh() {
//		return mahinh;
//	}
//	public void setMahinh(Hinh mahinh) {
//		this.mahinh = mahinh;
//	}
	
	
	
}
