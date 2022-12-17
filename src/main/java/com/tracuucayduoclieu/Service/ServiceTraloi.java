package com.tracuucayduoclieu.Service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Cauhoi;
import com.tracuucayduoclieu.Entity.Nguoidung;
import com.tracuucayduoclieu.Entity.Traloi;
import com.tracuucayduoclieu.Repository.RepositoryTraloi;

@Service
public class ServiceTraloi {
	
	@Autowired
	private RepositoryTraloi tl;
	
	public int countAll() {
		long count =tl.count();
		float countALL =(float)count/10;
		if(countALL %2 !=0){
			countALL++;
		}
		return (int)countALL;
	}
	
	public long demSoCauTraLoi () {
		return tl.count();
	}
	
	public Traloi save(Nguoidung nd,int idcauhoi, String cautraloi) {
		Cauhoi cauhoi =new Cauhoi();
		cauhoi.setMacauhoi(idcauhoi);
		
		Traloi traloi =new Traloi();
		traloi.setNoidungcautraloi(cautraloi);
		traloi.setMacauhoi(cauhoi);
		
		traloi.setSdt(nd);
		
		Timestamp time =new Timestamp(System.currentTimeMillis());
		traloi.setThoigiantraloi(time);
		
		return tl.save(traloi);
	}
	
	public Traloi save(Traloi traloi) {
		return tl.save(traloi);
	}
	
	public Traloi saveTraLoiByAdmin (Traloi traloi) {
		tl.save(traloi);
		return traloi;
	}
	
	public List<Traloi> danhSachCauTraLoi(){
		return tl.findAll();
	}
}
