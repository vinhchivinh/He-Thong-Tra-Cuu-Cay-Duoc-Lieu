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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="TRALOI")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "macautraloi")
public class Traloi {
	
	@Id
	@Column(name="IDCAUTRALOI")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int macautraloi;
	
	@OneToMany(mappedBy = "traloi")
	private List<Baocao> baocao;
	
	public List<Baocao> getBaocao() {
		return baocao;
	}
	public void setBaocao(List<Baocao> baocao) {
		this.baocao = baocao;
	}
	@OneToOne
	@JoinColumn(name="IDCAUHOI")
	private Cauhoi macauhoi;
	
	@ManyToOne
	@JoinColumn (name="SDT")
	private Nguoidung sdt;
	
	
	
	@Column(name="NOIDUNGCAUTRALOI")
	private String noidungcaitraloi;
	
	@Column(name="THOIGIANTRALOI")
	private Timestamp thoigiantraloi;
	
	
	@OneToMany(mappedBy = "traloi")
	private List<Traloi> traloi;
	
	@Override
	public String toString() {
		return "Traloi [macautraloi=" + macautraloi + ", macauhoi=" + macauhoi + ", sdt=" + sdt + ", noidungcaitraloi="
				+ noidungcaitraloi + ", thoigiantraloi=" + thoigiantraloi + "]";
	}
	public int getMacautraloi() {
		return macautraloi;
	}
	public void setMacautraloi(int macautraloi) {
		this.macautraloi = macautraloi;
	}
	public Cauhoi getMacauhoi() {
		return macauhoi;
	}
	public void setMacauhoi(Cauhoi macauhoi) {
		this.macauhoi = macauhoi;
	}
	public Nguoidung getSdt() {
		return sdt;
	}
	public void setSdt(Nguoidung sdt) {
		this.sdt = sdt;
	}
	public String getNoidungcautraloi() {
		return noidungcaitraloi;
	}
	public void setNoidungcautraloi(String noidungcaitraloi) {
		this.noidungcaitraloi = noidungcaitraloi;
	}
	public Timestamp getThoigiantraloi() {
		return thoigiantraloi;
	}
	public void setThoigiantraloi(Timestamp thoigiantraloi) {
		this.thoigiantraloi = thoigiantraloi;
	}
	public String layThoiGianDangCauTraLoiSoVoiHienTai () {
		
		Calendar calendar1 =Calendar.getInstance();
		calendar1.setTime(this.thoigiantraloi);
		
		Calendar calendar2 =Calendar.getInstance();
		Timestamp thoigianhientai=new Timestamp(System.currentTimeMillis());
		calendar2.setTime(thoigianhientai);
		
		if(calendar2.get(Calendar.YEAR)-calendar1.get(Calendar.YEAR) !=0) {
			int year = calendar2.get(Calendar.YEAR)-calendar1.get(Calendar.YEAR);
			return year+"Năm Trước";
		}
		else if(calendar2.get(Calendar.MONTH)-calendar1.get(Calendar.MONTH) !=0) {
			int moth = calendar2.get(Calendar.MONTH)-calendar1.get(Calendar.MONTH);
			return moth+"Tháng Trước";
		}
		else if(calendar2.get(Calendar.DATE)-calendar1.get(Calendar.DATE) !=0) {
			int date =calendar2.get(Calendar.DATE)-calendar1.get(Calendar.DATE);
			return date+"Ngày Trước";
		}
		else if(calendar2.get(Calendar.HOUR)-calendar1.get(Calendar.HOUR) !=0) {
			int hours = calendar2.get(Calendar.HOUR)-calendar1.get(Calendar.HOUR);
			return hours+"Giờ Trước";
		}
		else if(calendar2.get(Calendar.MINUTE)-calendar1.get(Calendar.MINUTE) !=0){
			int minute = calendar2.get(Calendar.MINUTE)-calendar1.get(Calendar.MINUTE);
			return minute+"Phút Trước";
		}
		else if(calendar2.get(Calendar.SECOND)-calendar1.get(Calendar.SECOND) !=0) {
			int second =calendar2.get(Calendar.SECOND)-calendar1.get(Calendar.SECOND);
			return second+"Giây Trước";
		}
		else {
			return "0"+"Giây Trước";
		}
		
	}
	public String timeStampToDate () {
		Calendar calendar1 =Calendar.getInstance();
		calendar1.setTime(this.thoigiantraloi);
		int date = calendar1.get(Calendar.DATE);
		int month = calendar1.get(Calendar.MONTH);
		int year = calendar1.get(Calendar.YEAR);
		int h = calendar1.get(Calendar.HOUR_OF_DAY);
		int m = calendar1.get(Calendar.MINUTE);
		
		return ""+date+"/"+month+"/"+year+" "+h+":"+m ;
	}

}
