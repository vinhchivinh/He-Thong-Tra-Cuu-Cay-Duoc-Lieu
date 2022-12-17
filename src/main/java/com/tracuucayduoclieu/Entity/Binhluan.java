package com.tracuucayduoclieu.Entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BINHLUAN")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "idbinhluan")
public class Binhluan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idbinhluan;
	
	@ManyToOne
	@JoinColumn(name="SDT")
	
	private Nguoidung sdt;
	
	@ManyToOne
	@JoinColumn(name="IDCAYDUOCLIEU")
	
	private Cayduoclieu maduoclieu;
	
	@ManyToOne
	@JoinColumn(name="IDBAIVIET")
	
	private Baiviet mabaiviet;
	
	@Column(name="NOIDUNGBINHLUAN")
	private String noidungbinhluan;
	
	@Column(name="THOIGIANDANGBINHLUAN")
	private Timestamp thoigiandangbinhluan;
	
	
	@Override
	public String toString() {
		return "Binhluan [idbinhluan=" + idbinhluan + ", sdt=" + sdt + ", maduoclieu=" + maduoclieu + ", mabaiviet="
				+ mabaiviet + ", noidungbinhluan=" + noidungbinhluan + ", thoigiandangbinhluan=" + thoigiandangbinhluan
				+ "]";
	}
	public int getIdbinhluan() {
		return idbinhluan;
	}
	public void setIdbinhluan(int idbinhluan) {
		this.idbinhluan = idbinhluan;
	}
	public Nguoidung getSdt() {
		return sdt;
	}
	public void setSdt(Nguoidung sdt) {
		this.sdt = sdt;
	}
	public Cayduoclieu getMaduoclieu() {
		return maduoclieu;
	}
	public void setMaduoclieu(Cayduoclieu maduoclieu) {
		this.maduoclieu = maduoclieu;
	}
	public Baiviet getMabaiviet() {
		return mabaiviet;
	}
	public void setMabaiviet(Baiviet mabaiviet) {
		this.mabaiviet = mabaiviet;
	}
	public String getNoidungbinhluan() {
		return noidungbinhluan;
	}
	public void setNoidungbinhluan(String noidungbinhluan) {
		this.noidungbinhluan = noidungbinhluan;
	}
	public Timestamp getThoigiandangbinhluan() {
		return thoigiandangbinhluan;
	}
	public void setThoigiandangbinhluan(Timestamp thoigiandangbinhluan) {
		this.thoigiandangbinhluan = thoigiandangbinhluan;
	}
	

}
