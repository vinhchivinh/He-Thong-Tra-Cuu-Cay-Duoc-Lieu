package com.tracuucayduoclieu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Cayduoclieu;
import com.tracuucayduoclieu.Entity.Tengoikhac;
import com.tracuucayduoclieu.Entity.Thanhphanhoahoc;
import com.tracuucayduoclieu.Repository.RepositoryTenGoiKhac;

@Service
public class ServiceTenGoiKhac {
	@Autowired
	RepositoryTenGoiKhac tgk;
	
	public List<Tengoikhac> findAll(){
		return tgk.findAll();
	}
	
	public Tengoikhac save(Tengoikhac tengoikhac) {
		return tgk.save(tengoikhac);
	}
	
	public Tengoikhac edit(String matengoikhac, String tentengoikhac) {
		Tengoikhac tengoikhac =new Tengoikhac();
		 tengoikhac.setMaten(Integer.parseInt(matengoikhac));
		 tengoikhac.setTengoi(tentengoikhac);
		return tgk.save(tengoikhac);
	}
	
	public Tengoikhac  save(String tentengoikhac) {
		Tengoikhac  tengoikhac =new Tengoikhac();
		tengoikhac.setTengoi(tentengoikhac);
		return tgk.save(tengoikhac);
	}
	
	public Tengoikhac save(Tengoikhac tengoikhac, Cayduoclieu cayduoclieu) {
		tengoikhac.setMaduoclieu(cayduoclieu);
		return tgk.save(tengoikhac);
	}
	
	public Page<Tengoikhac> findAll(int offset, int fetch){
		PageRequest pa = PageRequest.of(offset,fetch,Sort.by(Sort.Direction.DESC, "maten")); 
		return tgk.findAll(pa);
	}
	
	public int countAll(){
		long count =tgk.count();
		float countALL =(float)count/10;
		
		if(countALL %2 !=0){
			countALL++;
		}
		return (int)countALL;
		
	}
	
	public void deleteSet(String dstengoikhac[]) {
		int i;
		for( i=0; i<dstengoikhac.length; i++) {
			Tengoikhac tengoikhac  = new Tengoikhac();
			tengoikhac.setMaten(Integer.parseInt(dstengoikhac[i]));
			tgk.delete(tengoikhac);
		}
	}
	
	public void delete(String matengoikhac) {
		Tengoikhac tengoikhac =new Tengoikhac();
		tengoikhac.setMaten(Integer.parseInt(matengoikhac));
		tgk.delete(tengoikhac);
	}
	public List<Tengoikhac> timKiemTheoKiTu(String key){
		
		try {
		int keyInt = Integer.parseInt(key);
		return tgk.timKiemTheoMaTenGoiKhac(keyInt);
		}
		catch (Exception e){
			return tgk.timKiemTheoTenTenGoiKhac(key);
		}
		
	}
	
	public boolean themTenGoiKhac(String tengoikhac) {
		Optional<Tengoikhac> Tengoikhac = tgk.findByTengoi(tengoikhac);
		if(Tengoikhac.isEmpty()) {
			save(tengoikhac);
			return true;
		}	
		return false;
	}
	
	public boolean edit(int id, String tengoikhac) {
		Optional<Tengoikhac> Tengoikhac =tgk.findById(id);
		if( Tengoikhac.isPresent()) {
			Tengoikhac.get().setTengoi(tengoikhac);
			tgk.save(Tengoikhac.get());
			return true;
		}
		else {
			return false;
		}
	}
	
}
