package com.tracuucayduoclieu.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tracuucayduoclieu.Entity.Bophansudung;
import com.tracuucayduoclieu.Entity.Cayduoclieu;
import com.tracuucayduoclieu.Repository.RepositoryBoPhanSuDung;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@Service
public class ServiceBophansudung {
	
	@Autowired
	RepositoryBoPhanSuDung bpsd;
	
	public List<Bophansudung> findAll(){
		return bpsd.findAll();
	}
	
	public Page<Bophansudung> findAll(int offset, int fetch){
		PageRequest pa = PageRequest.of(offset,fetch,Sort.by(Sort.Direction.DESC, "mabophan")); 
		return bpsd.findAll(pa);
	}
	
	public int countAll(){
		long count =bpsd.count();
		float countALL =(float)count/10;
		
		if(countALL %2 !=0){
			countALL++;
		}
		return (int)countALL;
		
	}
	public void deleteID(String id) {
		Bophansudung bophansudung = new Bophansudung();
		bophansudung.setMabophan(Integer.parseInt(id));
		bpsd.delete(bophansudung);
		
	}
	
	public void deleteSet(String id[]) {
		int i;
		for( i=0; i<id.length; i++) {
			Bophansudung bophansudung = new Bophansudung();
			bophansudung.setMabophan(Integer.parseInt(id[i]));
			bpsd.delete(bophansudung);
		}
	}

	public void save(String tenbophan) {
		
		Bophansudung bophansudung =new Bophansudung();
		bophansudung.setTenbophan(tenbophan);
		bpsd.save(bophansudung);
		
	}
	public List<Bophansudung> Sort() {
		 return bpsd.findAll(Sort.by(Sort.Direction.DESC, "mabophan"));
	}
	
	public long count(List<Bophansudung> bophansudung) {
		return bpsd.count();
	}
	
	public boolean edit(int id, String tenbophan) {
		Optional<Bophansudung> bophansudung =bpsd.findById(id);
		if(bophansudung.isPresent()) {
			bophansudung.get().setTenbophan(tenbophan);
			bpsd.save(bophansudung.get());
			return true;
		}
		else {
			return false;
		}
	}
	
	public Optional<Bophansudung> findById(int id) {
		return bpsd.findById(id);
	}
	
	public boolean themBoPhanSuDung(String tenbophan) {
		Optional<Bophansudung> bophansudung = bpsd.findByTenbophan(tenbophan);
		if(bophansudung.isEmpty()) {
			save(tenbophan);
			return true;
		}	
		return false;
	}
	
}
