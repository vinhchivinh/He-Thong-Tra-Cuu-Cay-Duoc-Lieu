package com.tracuucayduoclieu.Service;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Benh;
import com.tracuucayduoclieu.Entity.Cauhoi;
import com.tracuucayduoclieu.Entity.Nguoidung;
import com.tracuucayduoclieu.Repository.RepositoryCauhoi;

@Service
public class ServiceCauhoi {

	@Autowired
	private RepositoryCauhoi ch;
	
	@Autowired
	private ServiceNguoidung svnd;
	

	public Cauhoi save(String tieude, String noidungcauhoi) {
		ch.findAll();
		Cauhoi cauhoi =new Cauhoi();
		cauhoi.setTencauhoi(tieude);
		cauhoi.setNoidungcauhoi(noidungcauhoi);
		Nguoidung nguoidung =new Nguoidung();
		nguoidung = svnd.layThongTinNguoiDungDaXacThuc();
		cauhoi.setSdt(nguoidung);
		cauhoi.setNgaydang(new Timestamp(System.currentTimeMillis()));
		
		return ch.save(cauhoi);
	}
	
	public Page<Cauhoi> filter (int Macauhoi, String tencauhoi, int trangthai, Pageable pageable){
		
		if(!tencauhoi.equals("") &&  trangthai !=2 && Macauhoi==0) {
			boolean trang_thai;
			if(trangthai == 0) {trang_thai = false;}
			else {trang_thai = true;}
			return ch.findByTencauhoiAndTrangthai(tencauhoi,trang_thai, pageable);
		}
		else if (Macauhoi !=0 && trangthai !=2 && tencauhoi.equals("") ) {
			boolean trang_thai;
			if(trangthai == 0) {trang_thai = false;}
			else {trang_thai = true;}
			return ch.findByMacauhoiAndTrangthai(Macauhoi, trang_thai, pageable);
		}
		else if (Macauhoi !=0 || !tencauhoi.equals("")) {
			return ch.findByMacauhoiOrTencauhoi(Macauhoi, tencauhoi, pageable);
		}	
		else {
			boolean trang_thai;
			if(trangthai == 0) {trang_thai = false;}
			else {trang_thai = true;}
			return ch.findByTrangthai(trang_thai,pageable);
		}
	}
	
	public Page<Cauhoi> findAll(int offset, int fetch, String key,int Trangthai){
		PageRequest pa = PageRequest.of(offset,fetch,Sort.by(Sort.Direction.DESC, "macauhoi")); 
		int macauhoi;
		String tencauhoi;
		try {
			macauhoi = Integer.parseInt(key); 
			tencauhoi="";
		} catch(Exception e) {
			tencauhoi = key;
			macauhoi=0;}	
		
		if (macauhoi !=0 || !tencauhoi.equals("") || Trangthai !=2) {
			return filter(macauhoi, tencauhoi, Trangthai, pa);
		}
		
		else {
			return ch.findAll(pa);
		}
		
	}

	public int countAll() {
		long count =ch.count();
		float countALL =(float)count/10;
		
		if(countALL %2 !=0 && countALL !=1){
			countALL++;
		}
		return (int)countALL;
	}
	
	public long demSoCauHoi() {
		return ch.count();
	}
	
	public List<Cauhoi> layDanhSachCauHoiTrong2Ngay (){
		Timestamp time2 =new Timestamp(System.currentTimeMillis());
		Calendar time_calendar =Calendar.getInstance();
		time_calendar.set(time_calendar.DATE,time_calendar.get(time_calendar.DATE)-2);
		Timestamp time1 =new Timestamp(time_calendar.getTimeInMillis());
		return ch.danhSachCauHoiGiuaCacNgay(time1,time2);
	}
	
	public int countPage(int num_record_in_page,int record_total) {
		
		float countALL =(float)record_total/num_record_in_page;
		
		if(countALL %2 !=0 && countALL !=1){
			countALL++;
		}
		return (int)countALL;
	}
	
	public Optional<Cauhoi> findById(int id) {
		return ch.findById(id);
	}
	
	public Page<Cauhoi> findAll(int offset, int fetch){
		Pageable page =PageRequest.of(offset, fetch,Sort.by(Sort.Direction.DESC, "macauhoi"));
		return ch.findAll(page);
	}
	
	public long findAll(int offset, int fetch, Page<Cauhoi> cauhoi){
		Pageable page =PageRequest.of(offset, fetch,Sort.by(Sort.Direction.DESC, "macauhoi"));
		cauhoi = ch.findAll(page);
		return ch.count();
	}
	
	public void delete (String Macauhoi) {
		Cauhoi ch =new Cauhoi();
		ch.setMacauhoi(Integer.parseInt(Macauhoi));
		this.ch.delete(ch);;
	}
	
	public void deteteSet(String[] macauhoi) {
		int i;
		for(i=0; i<macauhoi.length; i++) {
			Cauhoi ch =new Cauhoi();
			ch.setMacauhoi(Integer.parseInt(macauhoi[i]));
			this.ch.delete(ch);;
		}
	}
	
	public Optional<Cauhoi> findById(String id) {
		return ch.findById(Integer.parseInt(id));
	}
	
	public Cauhoi save(Cauhoi cauhoi) {
		return ch.save(cauhoi);
	}
	
	public List<Cauhoi> timBoiTenCayDuocLieu (String tencauhoi, int page) {
		Page<Cauhoi> cauhoi = ch.findByTenCauHoi(tencauhoi,true,PageRequest.of(page-1,9));
		return cauhoi.getContent();
	}
	
	public List<Cauhoi> danhSachChoPheDuyet (){
		List<Cauhoi> cauhoi = ch.findByTrangthai(false);
		return cauhoi;
	}
	public Page<Cauhoi> danhSachDaPheDuyet (int offset,int fetch) {
		return ch.findByTrangthai(true,PageRequest.of(offset, fetch,Sort.by(Sort.Direction.DESC, "macauhoi")));
	}
	
	
	public List<Cauhoi> danhSachDaPheDuyet (){
		List<Cauhoi> cauhoi = ch.findByTrangthai(true);
		return cauhoi;
	}
	
	public Cauhoi duyetCauHoi(int id) {
		Optional<Cauhoi> cauhoi = ch.findById(id);
		Cauhoi cauhoicapnhat = cauhoi.get();
		cauhoicapnhat.setTrangthai(true);
		return ch.save(cauhoicapnhat);	
	}
	
	
	
}
