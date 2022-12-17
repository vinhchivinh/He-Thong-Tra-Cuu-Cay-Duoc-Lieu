package com.tracuucayduoclieu.Entity;



import java.sql.Timestamp;
import java.util.Calendar;
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

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="CAUHOI")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "macauhoi")
public class Cauhoi {
	
	@Id
	@Column(name="IDCAUHOI")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int macauhoi;
	
	@ManyToOne
	@JoinColumn(name="SDT")
	private Nguoidung sdt;
	
	@Column(name="TENCAUHOI")
	private String tencauhoi;
	
	@Column(name="NOIDUNGCAUHOI")
	private String noidungcauhoi;
	
	@Column(name="NGAYDANG")
	@CreationTimestamp
	private Timestamp ngaydang;
	
	@Column(name="trangthai",nullable = true, columnDefinition = "bit default 0")
	private boolean trangthai;
	
	@OneToMany(mappedBy = "macauhoi")
	private List<Traloi> traloi;
	
	@OneToOne
	@JoinColumn(name="idhinh")
	private Hinh hinh;
	
	public Hinh getHinh() {
		return hinh;
	}
	public void setHinh(Hinh hinh) {
		this.hinh = hinh;
	}
	public boolean getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}
	public List<Traloi> getTraloi() {
		return traloi;
	}
	public void setTraloi(List<Traloi> traloi) {
		this.traloi = traloi;
	}
	@Override
	public String toString() { 
		return "Cauhoi [macauhoi=" + macauhoi + ", sdt=" + sdt + ", tencauhoi=" + tencauhoi + ", noidungcauhoi="
				+ noidungcauhoi + ", ngaydang=" + ngaydang + "]";
	}
	public int getMacauhoi() {
		return macauhoi;
	}
	public void setMacauhoi(int macauhoi) {
		this.macauhoi = macauhoi;
	}
	public Nguoidung getSdt() {
		return sdt;
	}
	public void setSdt(Nguoidung sdt) {
		this.sdt = sdt;
	}
	public String getTencauhoi() {
		return tencauhoi;
	}
	public void setTencauhoi(String tencauhoi) {
		this.tencauhoi = tencauhoi;
	}
	public String getNoidungcauhoi() {
		return noidungcauhoi;
	}
	public void setNoidungcauhoi(String noidungcauhoi) {
		this.noidungcauhoi = noidungcauhoi;
	}
	public Timestamp getNgaydang() {
		return ngaydang;
	}
	public void setNgaydang(Timestamp ngaydang) {
		this.ngaydang = ngaydang;
	}
	
	public String layThoiGianDangCauHoiSoVoiHienTai () {
		
		Calendar calendar1 =Calendar.getInstance();
		calendar1.setTime(this.ngaydang);
		
		Calendar calendar2 =Calendar.getInstance();
		Timestamp thoigianhientai=new Timestamp(System.currentTimeMillis());
		calendar2.setTime(thoigianhientai);
		
		if(calendar2.get(Calendar.YEAR)-calendar1.get(Calendar.YEAR) >0) {
			int year = calendar2.get(Calendar.YEAR)-calendar1.get(Calendar.YEAR);
			return year+" Năm Trước";
		}
		else if(calendar2.get(Calendar.MONTH)-calendar1.get(Calendar.MONTH) >0) {
			int moth = calendar2.get(Calendar.MONTH)-calendar1.get(Calendar.MONTH);
			return moth+" Tháng Trước";
		}
		else if(calendar2.get(Calendar.DATE)-calendar1.get(Calendar.DATE) >0) {
			int date =calendar2.get(Calendar.DATE)-calendar1.get(Calendar.DATE);
			return date+" Ngày Trước";
		}
		else if(calendar2.get(Calendar.HOUR_OF_DAY)-calendar1.get(Calendar.HOUR_OF_DAY) >0) {
			int hours = calendar2.get(Calendar.HOUR_OF_DAY)-calendar1.get(Calendar.HOUR_OF_DAY);
			return hours+" Giờ Trước";
		}
		else if(calendar2.get(Calendar.MINUTE)-calendar1.get(Calendar.MINUTE) > 0){
			int minute = calendar2.get(Calendar.MINUTE)-calendar1.get(Calendar.MINUTE);
			return minute+" Phút Trước";
		}
		else if(calendar2.get(Calendar.SECOND)-calendar1.get(Calendar.SECOND) > 0) {
			int second =calendar2.get(Calendar.SECOND)-calendar1.get(Calendar.SECOND);
			return second+" Giây Trước";
		}
		else {
			return "0"+"Giây Trước";
		}
		
	}
	
	public String timeStampToDate () {
		Calendar calendar1 =Calendar.getInstance();
		calendar1.setTime(this.ngaydang);
		int date = calendar1.get(Calendar.DATE);
		int month = calendar1.get(Calendar.MONTH);
		int year = calendar1.get(Calendar.YEAR);
		int h = calendar1.get(Calendar.HOUR_OF_DAY);
		int m = calendar1.get(Calendar.MINUTE);
		
		return ""+date+"/"+month+"/"+year+" "+h+":"+m ;
	}

}
