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
@Table(name="THANHPHANHOAHOC")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "mathanhphan")
public class Thanhphanhoahoc {
	
	@Id
	@Column(name="IDTHANHPHAN")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mathanhphan;
	
	@Column(name="TENTHANHPHAN")
	private String tenthanhphan;
	
	public List<Cayduoclieu> getCayduoclieu() {
		return cayduoclieu;
	}
	public void setCayduoclieu(List<Cayduoclieu> cayduoclieu) {
		this.cayduoclieu = cayduoclieu;
	}
	
	@ManyToMany(mappedBy = "thanhphanhoahoc")
	@JsonIgnore
	private List<Cayduoclieu> cayduoclieu;
	
	@Override
	public String toString() {
		return "Thanhphanhoahoc [mathanhphan=" + mathanhphan + ", tenthanhphan=" + tenthanhphan + "]";
	}
	public int getMathanhphan() {
		return mathanhphan;
	}
	public void setMathanhphan(int mathanhphan) {
		this.mathanhphan = mathanhphan;
	}
	public String getTenthanhphan() {
		return tenthanhphan;
	}
	public void setTenthanhphan(String tenthanhphan) {
		this.tenthanhphan = tenthanhphan;
	}
	
	
}
