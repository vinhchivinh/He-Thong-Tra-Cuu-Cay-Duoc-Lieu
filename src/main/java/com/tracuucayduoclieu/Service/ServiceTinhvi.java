package com.tracuucayduoclieu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Tinhvi;

import com.tracuucayduoclieu.Repository.RepositoryTinhvi;

@Service
public class ServiceTinhvi {
	@Autowired
	RepositoryTinhvi tv;
	
	public List<Tinhvi> findAll(){
		return tv.findAll();
	}
	
	public Tinhvi save(Tinhvi tinhvi) {
		return tv.save(tinhvi);
	}
	
	public Tinhvi edit(String maTinhvi, String tenTinhvi) {
		Tinhvi Tinhvi =new Tinhvi();
		Tinhvi.setMatinhvi(Integer.parseInt(maTinhvi));
		Tinhvi.setTentinhvi(tenTinhvi);
		return tv.save(Tinhvi);
	}
	
	public Tinhvi save(String tentinhvi) {
		Tinhvi  cd =new Tinhvi();
		cd.setTentinhvi(tentinhvi);
		return tv.save(cd);
	}
	
	public Page<Tinhvi> findAll(int offset, int fetch){
		PageRequest pa = PageRequest.of(offset,fetch,Sort.by(Sort.Direction.DESC, "matinhvi")); 
		return tv.findAll(pa);
	}
	
	public int countAll(){
		long count =tv.count();
		float countALL =(float)count/10;
		
		if(countALL %2 !=0){
			countALL++;
		}
		return (int)countALL;
		
	}
	
	public void deleteSet(String dstinhvi[]) {
		int i;
		for( i=0; i<dstinhvi.length; i++) {
			Tinhvi Tinhvi = new Tinhvi();
			Tinhvi.setMatinhvi(Integer.parseInt(dstinhvi[i]));
			this.tv.delete(Tinhvi);
		}
	}
	
	public void delete(String matinhvi) {
		Tinhvi Tinhvi =new Tinhvi();
		Tinhvi.setMatinhvi(Integer.parseInt(matinhvi));
		tv.delete(Tinhvi);
	}
	public List<Tinhvi> timKiemTheoKiTu(String key){
		try {
		int keyInt = Integer.parseInt(key);
		return tv.timKiemTheoMaTinhVi(keyInt);
		}
		catch (Exception e){
			return tv.timKiemTheoTenTinhVi(key);
		}
		
	}
	
	public boolean themTinhvi(String tinhvi) {
		Optional<Tinhvi> Tinhvi = tv.findByTentinhvi(tinhvi);
		if(Tinhvi.isEmpty()) {
			save(tinhvi);
			return true;
		}	
		return false;
	}

	public boolean edit(int id, String tinhvi) {
		Optional<Tinhvi> Tinhvi =tv.findById(id);
		if(Tinhvi.isPresent()) {
			Tinhvi.get().setTentinhvi(tinhvi);
			tv.save(Tinhvi.get());
			return true;
		}
		else {
			return false;
		}
	}
}
