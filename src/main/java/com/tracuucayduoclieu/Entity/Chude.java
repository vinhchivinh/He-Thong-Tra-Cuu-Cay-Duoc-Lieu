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
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="CHUDE")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "machude")
public class Chude {

	@Id
	@Column(name="IDCHUDE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int machude;
	
	@Column(name ="TENCHUDE")
	private  String tenchude;
	
	@OneToMany(mappedBy = "idchude")
	
	private List<Baiviet> baiviet;
	
	public List<Baiviet> getBaiviet() {
		return baiviet;
	}
	public void setBaiviet(List<Baiviet> baiviet) {
		this.baiviet = baiviet;
	}
	@Override
	public String toString() {
		return "Chude [machude=" + machude + ", tenchude=" + tenchude + "]";
	}
	public int getMachude() {
		return machude;
	}
	public void setMachude(int machude) {
		this.machude = machude;
	}
	public String getTenchude() {
		return tenchude;
	}
	public void setTenchude(String tenchude) {
		this.tenchude = tenchude;
	}
	
	public boolean kiemTraTonTaiChuDe (Chude chude) {
		if(this.machude == chude.machude) {
			return true;
		}
		return false;
	}
	
	
}
