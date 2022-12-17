package com.tracuucayduoclieu.Entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BAIVIET")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "mabaiviet")
public class Baiviet {
	
	@Id
    @Column(name="IDBAIVIET")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mabaiviet;
	
	@ManyToOne
	@JoinColumn(name="IDCHUDE")
	private Chude idchude;
	
	@ManyToOne
	@JoinColumn(name="SDT")
	private Nguoidung sdt;
	
	@Column(name="TENBAIVIET")
	private String tenbaiviet;
	
	@Column(name="NOIDUNG")
	private String noidung;
	
	@Column(name = "THOIGIANDANGBAIVIET")
	private Timestamp thoigiandangbaiviet;
	
	@OneToMany(mappedBy = "mabaiviet")
	private List<Binhluan> binhluan;
	
	@OneToOne
	@JoinColumn(name = "IDHINH", columnDefinition = "bit default 0")
	private Hinh anhdaidien;
	
	@Column(name ="TRAGNGTHAI")
	private boolean trangthai;
	
	public boolean isTrangthai() {
		return trangthai;
	}
	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}
	public Chude getIdchude() {
		return idchude;
	}
	public void setIdchude(Chude idchude) {
		this.idchude = idchude;
	}
	public Hinh getAnhdaidien() {
		return anhdaidien;
	}
	public void setAnhdaidien(Hinh danhdaidien) {
		this.anhdaidien = danhdaidien;
	}
	public List<Binhluan> getBinhluan() {
		return binhluan;
	}
	public void setBinhluan(List<Binhluan> binhluan) {
		this.binhluan = binhluan;
	}
	public int getMabaiviet() {
		return mabaiviet;
	}
	public void setMabaiviet(int mabaiviet) {
		this.mabaiviet = mabaiviet;
	}
	public Chude getMachude() {
		return idchude;
	}
	public void setMachude(Chude idchude) {
		this.idchude = idchude;
	}
	public Nguoidung getSdt() {
		return sdt;
	}
	public void setSdt(Nguoidung sdt) {
		this.sdt = sdt;
	}
	public String getTenbaiviet() {
		return tenbaiviet;
	}
	public void setTenbaiviet(String tenbaiviet) {
		this.tenbaiviet = tenbaiviet;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	
	public Timestamp getThoigiandangbaiviet() {
		return thoigiandangbaiviet;
	}
	public void setThoigiandangbaiviet(Timestamp thoigiandangbaiviet) {
		this.thoigiandangbaiviet = thoigiandangbaiviet;
	}
	@Override
	public String toString() {
		return "Baiviet [mabaiviet=" + mabaiviet + ", idchude=" + idchude + ", sdt=" + sdt + ", tenbaiviet="
				+ tenbaiviet + ", noidung=" + noidung + "]";
	}
	
	public String getSummary() {
		StringBuilder se = new StringBuilder(this.getNoidung());
		String sum = (String) se.subSequence(0,100);
		return sum;
	}

}
