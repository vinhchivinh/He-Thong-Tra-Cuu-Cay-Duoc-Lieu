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
@Table(name="TENGOIKHAC")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "maten")
public class Tengoikhac {
	
	@Id
	@Column(name="IDTEN")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maten;
	
	@Column(name="TENGOI")
	private String tengoi;
	
	@ManyToOne
	@JoinColumn(name="IDCAYDUOCLIEU")
	@JsonIgnore
	private Cayduoclieu maduoclieu;
	
	@Override
	public String toString() {
		return "Tengoikhac [maten=" + maten + ", tengoi=" + tengoi + ", maduoclieu=" + maduoclieu + "]";
	}
	public int getMaten() {
		return maten;
	}
	public void setMaten(int maten) {
		this.maten = maten;
	}
	public String getTengoi() {
		return tengoi;
	}
	public void setTengoi(String tengoi) {
		this.tengoi = tengoi;
	}
	public Cayduoclieu getMaduoclieu() {
		return maduoclieu;
	}
	public void setMaduoclieu(Cayduoclieu maduoclieu) {
		this.maduoclieu = maduoclieu;
	}
	
}
