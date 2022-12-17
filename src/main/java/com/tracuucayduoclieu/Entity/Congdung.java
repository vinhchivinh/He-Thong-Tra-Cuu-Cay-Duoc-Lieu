package com.tracuucayduoclieu.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="CONGDUNG")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "macongdung")
public class Congdung {
	
	@Id
	@Column(name="IDCONGDUNG")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int macongdung;
	
	@Column(name="TENCONGDUNG")
	private String tencongdung;
	
	
	@ManyToMany(mappedBy = "congdung")
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
		return "Congdung [macongdung=" + macongdung + ", tencongdung=" + tencongdung + "]";
	}
	
	public int getMacongdung() {
		return macongdung;
	}
	public void setMacongdung(int macongdung) {
		this.macongdung = macongdung;
	}
	public String getTencongdung() {
		return tencongdung;
	}
	public void setTencongdung(String tencongdung) {
		this.tencongdung = tencongdung;
	}
	
	
}
