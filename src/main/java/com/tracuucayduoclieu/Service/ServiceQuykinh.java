package com.tracuucayduoclieu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Congdung;
import com.tracuucayduoclieu.Entity.Noiphanbo;
import com.tracuucayduoclieu.Entity.Quykinh;
import com.tracuucayduoclieu.Entity.Quykinh;
import com.tracuucayduoclieu.Repository.RepositoryQuyKinh;
import com.tracuucayduoclieu.Repository.RepositoryTacDung;

@Service
public class ServiceQuykinh {
	
	@Autowired
	RepositoryQuyKinh qk;
	
	public List<Quykinh> findAll(){
		return qk.findAll();
	}
	
	public Quykinh save(Quykinh quykinh) {
		return qk.save(quykinh);
	}
	
	public Quykinh edit(String maquykinh, String tenquykinh) {
		Quykinh quykinh =new Quykinh();
		 quykinh.setMaquykinh(Integer.parseInt(maquykinh));
		 quykinh.setTenquykinh(tenquykinh);
		return qk.save(quykinh);
	}
	
	public Quykinh  save(String tenquykinh) {
		Quykinh  quykinh =new Quykinh();
		quykinh.setTenquykinh(tenquykinh);
		return qk.save(quykinh);
	}
	
	public Page<Quykinh> findAll(int offset, int fetch){
		PageRequest pa = PageRequest.of(offset,fetch,Sort.by(Sort.Direction.DESC, "maquykinh")); 
		return qk.findAll(pa);
	}
	
	public int countAll(){
		long count =qk.count();
		float countALL =(float)count/10;
		
		if(countALL %2 !=0){
			countALL++;
		}
		return (int)countALL;
		
	}
	
	public void deleteSet(String dsquykinh[]) {
		int i;
		for( i=0; i<dsquykinh.length; i++) {
			Quykinh quykinh  = new Quykinh();
			quykinh.setMaquykinh(Integer.parseInt(dsquykinh[i]));
			qk.delete(quykinh);
		}
	}
	
	public void delete(String maquykinh) {
		Quykinh quykinh =new Quykinh();
		quykinh.setMaquykinh(Integer.parseInt(maquykinh));
		qk.delete(quykinh);
	}
	public List<Quykinh> timKiemTheoKiTu(String key){
		
		try {
		int keyInt = Integer.parseInt(key);
		return qk.timKiemTheoMaQuykinh(keyInt);
		}
		catch (Exception e){
			return qk.timKiemTheoTenQuykinh(key);
		}
		
	}
	
	public boolean themQuykinh(String quykinh) {
		Optional<Quykinh> Quykinh = qk.findByTenquykinh(quykinh);
		if(Quykinh.isEmpty()) {
			save(quykinh);
			return true;
		}	
		return false;
	}
	
	public boolean edit(int id, String quykinh) {
		Optional<Quykinh> Quykinh =qk.findById(id);
		if(Quykinh.isPresent()) {
			Quykinh.get().setTenquykinh(quykinh);
			qk.save(Quykinh.get());
			return true;
		}
		else {
			return false;
		}
	}
	
}
