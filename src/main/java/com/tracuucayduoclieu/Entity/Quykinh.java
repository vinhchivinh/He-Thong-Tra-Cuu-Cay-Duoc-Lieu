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
@Table(name="QUYKINH")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "maquykinh")
public class Quykinh {
	
	@Id
	@Column(name="IDQUYKINH")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maquykinh;
	
	@Column(name="TENQUYKINH")
	private String tenquykinh;
	
	@ManyToMany(mappedBy = "quykinh")
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
		return "Quykinh [maquykinh=" + maquykinh + ", tenquykinh=" + tenquykinh + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getMaquykinh() {
		return maquykinh;
	}
	public void setMaquykinh(int maquykinh) {
		this.maquykinh = maquykinh;
	}
	public String getTenquykinh() {
		return tenquykinh;
	}
	public void setTenquykinh(String tenquykinh) {
		this.tenquykinh = tenquykinh;
	}
	

}
