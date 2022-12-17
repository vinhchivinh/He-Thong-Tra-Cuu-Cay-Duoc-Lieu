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
@Table(name="LOAITAIKHOAN")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "maloai")
public class Loaitaikhoan {
	
	@Id
	@Column(name="IDLOAI")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maloai;
	
	@Column(name="TENLOAI")
	private String tenloai;
	
	
	public List<Nguoidung> getNguoidung() {
		return nguoidung;
	}
	public void setNguoidung(List<Nguoidung> nguoidung) {
		this.nguoidung = nguoidung;
	}
	public int getMaloai() {
		return maloai;
	}
	public void setMaloai(int maloai) {
		this.maloai = maloai;
	}
	public String getTenloai() {
		return tenloai;
	}
	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}
	@Override
	public String toString() {
		return "Loaitaikhoan [maloai=" + maloai + ", tenloai=" + tenloai + "]";
	}
	
	@OneToMany(mappedBy = "maloai")
	
	private List<Nguoidung> nguoidung;
	
}
