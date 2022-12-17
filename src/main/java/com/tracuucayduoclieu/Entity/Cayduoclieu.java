package com.tracuucayduoclieu.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="cayduoclieu")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "maduoclieu")
public class Cayduoclieu {
	
	@Id
	@Column(name="IDCAYDUOCLIEU")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maduoclieu;
	
	@Column(name="TENDUOCLIEU")
	private String tenduoclieu;
	
	@Column(name="TENKHOAHOC")
	private String tenkhoahoc;
	
	@Column(name="MOTA")
	private String mota;
	
	@Column(name="TACDUNGDUOCLY")
	private String tacdungduocly;
	
	@Column(name="LUUY")
	private String luuy;
	
	public List<Hinh> getHinh() {
		return hinh;
	}
	public void setHinh(List<Hinh> hinh) {
		this.hinh = hinh;
	}
	public List<Benh> getBenh() {
		return benh;
	}
	public void setBenh(List<Benh> benh) {
		this.benh = benh;
	}
	public List<Thanhphanhoahoc> getThanhphanhoahoc() {
		return thanhphanhoahoc;
	}
	public void setThanhphanhoahoc(List<Thanhphanhoahoc> thanhphanhoahoc) {
		this.thanhphanhoahoc = thanhphanhoahoc;
	}
	public List<Noiphanbo> getNoiphanbo() {
		return noiphanbo;
	}
	public void setNoiphanbo(List<Noiphanbo> noiphanbo) {
		this.noiphanbo = noiphanbo;
	}
	public List<Congdung> getCongdung() {
		return congdung;
	}
	public void setCongdung(List<Congdung> congdung) {
		this.congdung = congdung;
	}
	public List<Quykinh> getQuykinh() {
		return quykinh;
	}
	public void setQuykinh(List<Quykinh> quykinh) {
		this.quykinh = quykinh;
	}
	@Override
	public String toString() {
		return "Cayduoclieu [maduoclieu=" + maduoclieu + ", tenduoclieu=" + tenduoclieu + ", tenkhoahoc=" + tenkhoahoc
				+ ", mota=" + mota + ", tacdungduocly=" + tacdungduocly + ", luuy=" + luuy + ", hinh=" + hinh
				+ ", lieudungvacachdung=" + lieudungvacachdung + ", maho=" + maho + ", binhluan=" + binhluan
				+ ", tengoikhac=" + tengoikhac + ", bophansudung=" + bophansudung + ", benh=" + benh
				+ ", thanhphanhoahoc=" + thanhphanhoahoc + ", noiphanbo=" + noiphanbo + ", congdung=" + congdung
				+ ", quykinh=" + quykinh + ", tinhvi=" + tinhvi + "]";
	}
	public List<Tinhvi> getTinhvi() {
		return tinhvi;
	}
	public void setTinhvi(List<Tinhvi> tinhvi) {
		this.tinhvi = tinhvi;
	}
	@Column(name="LIEUDUNGVACACHDUNG")
	private String lieudungvacachdung;
	
	public String getLieudungvacachdung() {
		return lieudungvacachdung;
	}
	public void setLieudungvacachdung(String lieudungvacachdung) {
		this.lieudungvacachdung = lieudungvacachdung;
	}
	@ManyToOne
	@JoinColumn(name="IDHO")
	
	private Hoduoclieu maho;
	
	
	public List<Binhluan> getBinhluan() {
		return binhluan;
	}
	public void setBinhluan(List<Binhluan> binhluan) {
		this.binhluan = binhluan;
	}
	public List<Tengoikhac> getTengoikhac() {
		return tengoikhac;
	}
	public void setTengoikhac(List<Tengoikhac> tengoikhac) {
		this.tengoikhac = tengoikhac;
	}
	public List<Bophansudung> getBophansudung() {
		return bophansudung;
	}
	public void setBophansudung(List<Bophansudung> bophansudung) {
		this.bophansudung = bophansudung;
	}
	
	@OneToMany(mappedBy = "maduoclieu")
	
	private List<Binhluan> binhluan;
	
	@OneToMany(mappedBy = "maduoclieu")
	private List<Tengoikhac> tengoikhac;
	
	@OneToMany(mappedBy = "maduoclieu")
	
	private List<Hinh> hinh;
	
	@ManyToMany
	@JoinTable (
			name="DUOCLIEU_BOPHANSUDUNG",
			joinColumns = @JoinColumn(name="IDCAYDUOCLIEU"),
			inverseJoinColumns = @JoinColumn(name="IDBOPHAN")
			)
	
	private List<Bophansudung> bophansudung;
	
	@ManyToMany
	@JoinTable (
			name="DUOCLIEU_BENH",
			joinColumns = @JoinColumn(name="IDCAYDUOCLIEU"),
			inverseJoinColumns = @JoinColumn(name="IDBENH")
			)
	private List<Benh> benh;
	
	@ManyToMany
	@JoinTable (
			name="DUOCLIEU_THANHPHAN",
			joinColumns = @JoinColumn(name="IDCAYDUOCLIEU"),
			inverseJoinColumns = @JoinColumn(name="IDTHANHPHAN")
			)
	
	private List<Thanhphanhoahoc> thanhphanhoahoc;
	
	@ManyToMany
	@JoinTable (
			name="DUOCLIEU_PHANBO",
			joinColumns = @JoinColumn(name="IDCAYDUOCLIEU"),
			inverseJoinColumns = @JoinColumn(name="IDNOIPHANBO")
			)
	
	private List<Noiphanbo> noiphanbo;
	
	@ManyToMany
	@JoinTable (
			name="DUOCLIEU_CONGDUNG",
			joinColumns = @JoinColumn(name="IDCAYDUOCLIEU"),
			inverseJoinColumns = @JoinColumn(name="IDCONGDUNG")
			)
	
	private List<Congdung> congdung;
	
	@ManyToMany
	@JoinTable (
			name="DUOCLIEU_QUYKINH",
			joinColumns = @JoinColumn(name="IDCAYDUOCLIEU"),
			inverseJoinColumns = @JoinColumn(name="IDQUYKINH")
			)
	
	private List<Quykinh> quykinh;
	
	@ManyToMany
	@JoinTable (
			name="DUOCLIEU_TINHVI",
			joinColumns = @JoinColumn(name="IDCAYDUOCLIEU"),
			inverseJoinColumns = @JoinColumn(name="IDTINHVI")
			)
	
	private List<Tinhvi> tinhvi;

	public int getMaduoclieu() {
		return maduoclieu;
	}
	public void setMaduoclieu(int maduoclieu) {
		this.maduoclieu = maduoclieu;
	}
	public String getTenduoclieu() {
		return tenduoclieu;
	}
	public void setTenduoclieu(String tenduoclieu) {
		this.tenduoclieu = tenduoclieu;
	}
	public String getTenkhoahoc() {
		return tenkhoahoc;
	}
	public void setTenkhoahoc(String tenkhoahoc) {
		this.tenkhoahoc = tenkhoahoc;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getTacdungduocly() {
		return tacdungduocly;
	}
	public void setTacdungduocly(String tacdungduocly) {
		this.tacdungduocly = tacdungduocly;
	}
	public String getLuuy() {
		return luuy;
	}
	public void setLuuy(String luuy) {
		this.luuy = luuy;
	}
	public Hoduoclieu getMaho() {
		return maho;
	}
	public void setMaho(Hoduoclieu maho) {
		this.maho = maho;
	}
	
	public Hinh firstElement(){
		return hinh.get(0);
	}
	
	public boolean kiemTraTonTaiBoPhanSuDung(Bophansudung bophansudung ) {
		for(Bophansudung bpsd :this.bophansudung) {
			if(bpsd.getMabophan()==bophansudung.getMabophan()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean kiemTraTonTaiBenh(Benh benh ) {
		for(Benh b :this.benh) {
			if(b.getMabenh()==benh.getMabenh()) {
				return true;
			}
		}
		return false;	
	}		
	
	public boolean kiemTraTonTaiThanhPhanHoaHoc(Thanhphanhoahoc thanhphanhoahoc ) {
		for(Thanhphanhoahoc tphh :this.thanhphanhoahoc) {
			if(tphh.getMathanhphan()==thanhphanhoahoc.getMathanhphan()) {
				return true;
			}
		}
		return false;	
	}	
	
	public boolean kiemTraTonTaiTenGoiKhac(Tengoikhac tengoikhac ) {
		for(Tengoikhac tgk :this.tengoikhac) {
			if(tgk.getMaten()==tengoikhac.getMaten()) {
				return true;
			}
		}
		return false;	
	}	
	
	public boolean kiemTraTonTaiCongDung(Congdung congdung ) {
		for(Congdung cd :this.congdung) {
			if(cd.getMacongdung()==congdung.getMacongdung()) {
				return true;
			}
		}
		return false;	
	}	
	
	public boolean kiemTraTonTaiHoDuocLieu(Hoduoclieu hoduoclieu ) {
		if(this.maho.getMahoduoclieu()==hoduoclieu.getMahoduoclieu()) {
			return true;
		}
		return false;
	}	
	
	public boolean kiemTraTonTaiTinhVi(Tinhvi tinhvi ) {
		for(Tinhvi tv :this.getTinhvi()) {
			if(tv.getMatinhvi()==tinhvi.getMatinhvi()) {
				return true;
			}
		}
		return false;	
	}	
	
	public boolean kiemTraTonTaiQuyKinh(Quykinh quykinh ) {
		for(Quykinh qk :this.quykinh) {
			if(qk.getMaquykinh()==quykinh.getMaquykinh()) {
				return true;
			}
		}
		return false;	
	}	
	
	public boolean kiemTraTonTaiNoiPhanBo(Noiphanbo noiphanbo ) {
		for(Noiphanbo npb :this.noiphanbo) {
			if(npb.getIdnoiphanbo()==noiphanbo.getIdnoiphanbo()) {
				return true;
			}
		}
		return false;	
	}
	
	public Cayduoclieu getCayduoclieu() {
		return this;
	}
	
}
