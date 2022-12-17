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
@Table(name = "BOPHANSUDUNG")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "mabophan")
public class Bophansudung {

	@Id
	@Column(name = "IDBOPHAN")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mabophan;

	@Column(name = "TENBOPHAN")
	private String tenbophan;

	@ManyToMany(mappedBy = "bophansudung")
	@JsonIgnore
	private List<Cayduoclieu> cayduoclieu;

	@Override
	public String toString() {
		return "Bophansudung [mabophan=" + mabophan + ", tenbophan=" + tenbophan + "]";
	}

	public int getMabophan() {
		return mabophan;
	}

	public void setMabophan(int mabophan) {
		this.mabophan = mabophan;
	}

	public String getTenbophan() {
		return tenbophan;
	}

	public void setTenbophan(String tenbophan) {
		this.tenbophan = tenbophan;
	}

	

	
}
