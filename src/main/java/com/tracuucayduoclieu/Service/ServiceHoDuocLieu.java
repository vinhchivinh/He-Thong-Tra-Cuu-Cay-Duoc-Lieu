package com.tracuucayduoclieu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Hoduoclieu;
import com.tracuucayduoclieu.Entity.Tengoikhac;
import com.tracuucayduoclieu.Repository.RepositoryHoDuocLieu;

@Service
public class ServiceHoDuocLieu {
	@Autowired
	RepositoryHoDuocLieu hdl;
	
	public List<Hoduoclieu> findAll(){
		return hdl.findAll();
	}
	
	public Hoduoclieu save(Hoduoclieu Hoduoclieu) {
		return hdl.save(Hoduoclieu);
	}
	
	public Hoduoclieu edit(String maHoduoclieu, String tenHoduoclieu) {
		Hoduoclieu Hoduoclieu =new Hoduoclieu();
		 Hoduoclieu.setMahoduoclieu(Integer.parseInt(maHoduoclieu));
		 Hoduoclieu.setTenhoduoclieu(tenHoduoclieu);
		return hdl.save(Hoduoclieu);
	}
	
	public Hoduoclieu  save(String tenHoduoclieu) {
		Hoduoclieu  Hoduoclieu =new Hoduoclieu();
		Hoduoclieu.setTenhoduoclieu(tenHoduoclieu);
		return hdl.save(Hoduoclieu);
	}
	

	public Page<Hoduoclieu> findAll(int offset, int fetch){
		PageRequest pa = PageRequest.of(offset,fetch,Sort.by(Sort.Direction.DESC, "mahoduoclieu")); 
		return hdl.findAll(pa);
	}
	
	public int countAll(){
		long count =hdl.count();
		float countALL =(float)count/10;
		
		if(countALL %2 !=0){
			countALL++;
		}
		return (int)countALL;
		
	}
	
	public void deleteSet(String dsHoduoclieu[]) {
		int i;
		for( i=0; i<dsHoduoclieu.length; i++) {
			Hoduoclieu Hoduoclieu  = new Hoduoclieu();
			Hoduoclieu.setMahoduoclieu(Integer.parseInt(dsHoduoclieu[i]));
			hdl.delete(Hoduoclieu);
		}
	}
	
	public void delete(String maHoduoclieu) {
		Hoduoclieu Hoduoclieu =new Hoduoclieu();
		Hoduoclieu.setMahoduoclieu(Integer.parseInt(maHoduoclieu));
		hdl.delete(Hoduoclieu);
	}
	public List<Hoduoclieu> timKiemTheoKiTu(String key){
		
		try {
		int keyInt = Integer.parseInt(key);
		return hdl.timKiemTheoMaHoDuocLieu(keyInt);
		}
		catch (Exception e){
			return hdl.timKiemTheoTenHoDuocLieu(key);
		}
		
	}
	
	public boolean themTenHoDuocLieu(String hoduoclieu) {
		Optional<Hoduoclieu> Hoduoclieu = hdl.findByTenhoduoclieu(hoduoclieu);
		if(Hoduoclieu.isEmpty()) {
			save(hoduoclieu);
			return true;
		}	
		return false;
	}
	
	public boolean edit(int id, String tenhoduoclieu) {
		Optional<Hoduoclieu> Hoduoclieu =hdl.findById(id);
		if( Hoduoclieu.isPresent()) {
			Hoduoclieu.get().setTenhoduoclieu( tenhoduoclieu);
			hdl.save(Hoduoclieu.get());
			return true;
		}
		else {
			return false;
		}
	}
}
