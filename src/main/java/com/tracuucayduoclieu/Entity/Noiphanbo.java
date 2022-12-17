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
@Table(name="NOIPHANBO")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "idnoiphanbo")
public class Noiphanbo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idnoiphanbo;
	
	@Column(name="TENNOIPHANBO")
	private String phanbo;
	
	@ManyToMany(mappedBy = "noiphanbo")
	@JsonIgnore
	private List<Cayduoclieu> cayduoclieu;
	
	public List<Cayduoclieu> getCayduoclieu() {
		return cayduoclieu;
	}
	public void setCayduoclieu(List<Cayduoclieu> cayduoclieu) {
		this.cayduoclieu = cayduoclieu;
	}
	public int getIdnoiphanbo() {
		return idnoiphanbo;
	}
	public void setIdnoiphanbo(int idnoiphanbo) {
		this.idnoiphanbo = idnoiphanbo;
	}
	public String getPhanbo() {
		return phanbo;
	}
	public void setPhanbo(String phanbo) {
		this.phanbo = phanbo;
	}
	@Override
	public String toString() {
		return "Noiphanbo [idnoiphanbo=" + idnoiphanbo + ", phanbo=" + phanbo + "]";
	}
	
}
