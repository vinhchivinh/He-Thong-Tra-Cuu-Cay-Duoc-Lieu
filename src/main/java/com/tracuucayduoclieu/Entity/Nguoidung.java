package com.tracuucayduoclieu.Entity;

import java.security.Timestamp;
import java.sql.Date;
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
@Table(name="NGUOIDUNG")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "sdt")
public class Nguoidung {
	
	@Id
	private String sdt;
	
	@ManyToOne
	@JoinColumn(name="IDLOAI")
	private Loaitaikhoan maloai;
	
	@Column(name="HOVATEN")
	private String hovaten;
	
	@Column(name="GIOITINH")
	private boolean gioitinh;
	
	@Column(name="NGAYSINH")
	private Date ngaysinh;
	
	@Column(name="TAIKHOAN")
	private String taikhoan;
	
	@Column(name="MATKHAU")
	private String matkhau;
	
	@Column(name="EMAIL")
	private String email;
	
	@OneToMany(mappedBy = "macauhoi")
	@JsonBackReference
	private List<Cauhoi> cauhoi;
	
	@OneToMany(mappedBy = "macautraloi")
	@JsonBackReference
	private List<Traloi> traloi;
	
	@OneToMany(mappedBy = "mabaiviet")
	private List<Baiviet> baiviet;
	
	@OneToMany(mappedBy = "idbinhluan")
	@JsonBackReference
	private List<Binhluan> binhluan;
	
	public List<Cauhoi> getCauhoi() {
		return cauhoi;
	}
	public void setCauhoi(List<Cauhoi> cauhoi) {
		this.cauhoi = cauhoi;
	}
	public List<Traloi> getTraloi() {
		return traloi;
	}
	public void setTraloi(List<Traloi> traloi) {
		this.traloi = traloi;
	}
	public List<Baiviet> getBaiviet() {
		return baiviet;
	}
	public void setBaiviet(List<Baiviet> baiviet) {
		this.baiviet = baiviet;
	}
	public List<Binhluan> getBinhluan() {
		return binhluan;
	}
	public void setBinhluan(List<Binhluan> binhluan) {
		this.binhluan = binhluan;
	}
	@Override
	public String toString() {
		return "Nguoidung [sdt=" + sdt + ", maloai=" + maloai + ", hovaten=" + hovaten + ", gioitinh=" + gioitinh
				+ ", ngaysinh=" + ngaysinh + ", taikhoan=" + taikhoan + ", matkhau=" + matkhau + ", email=" + email
				+ "]";
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public Loaitaikhoan getMaloai() {
		return maloai;
	}
	public void setMaloai(Loaitaikhoan maloai) {
		this.maloai = maloai;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public boolean isGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
