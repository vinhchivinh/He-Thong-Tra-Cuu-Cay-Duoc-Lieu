package com.tracuucayduoclieu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Benh;
import com.tracuucayduoclieu.Entity.Congdung;
import com.tracuucayduoclieu.Entity.Hoduoclieu;
import com.tracuucayduoclieu.Repository.RepositoryTacDung;

@Service
public class ServiceTacDung {
	@Autowired
	RepositoryTacDung td;
	
	public List<Congdung> findAll(){
		return td.findAll();
	}
	
	public Congdung save(Congdung tacdung) {
		return td.save(tacdung);
	}
	
	public Congdung edit(String macongdung, String tencongdung) {
		Congdung congdung =new Congdung();
		congdung.setMacongdung(Integer.parseInt(macongdung));
		congdung.setTencongdung(tencongdung);
		return td.save(congdung);
	}
	
	public Congdung save(String tentacdung) {
		Congdung  cd =new Congdung();
		cd.setTencongdung(tentacdung);
		return td.save(cd);
	}
	
	public Page<Congdung> findAll(int offset, int fetch){
		PageRequest pa = PageRequest.of(offset,fetch,Sort.by(Sort.Direction.DESC, "macongdung")); 
		return td.findAll(pa);
	}
	
	public int countAll(){
		long count =td.count();
		float countALL =(float)count/10;
		
		if(countALL %2 !=0){
			countALL++;
		}
		return (int)countALL;
		
	}
	
	public void deleteSet(String dstacdung[]) {
		int i;
		for( i=0; i<dstacdung.length; i++) {
			Congdung congdung = new Congdung();
			congdung.setMacongdung(Integer.parseInt(dstacdung[i]));
			this.td.delete(congdung);
		}
	}
	
	public void delete(String matacdung) {
		Congdung congdung =new Congdung();
		congdung.setMacongdung(Integer.parseInt(matacdung));
		td.delete(congdung);
	}
	public List<Congdung> timKiemTheoKiTu(String key){
		
		try {
		int keyInt = Integer.parseInt(key);
		return td.timKiemTheoMaCongDung(keyInt);
		}
		catch (Exception e){
			return td.timKiemTheoTenCongDung(key);
		}
		
	}
	
	public boolean themCongdung(String congdung) {
		Optional<Congdung> Congdung = td.findByTencongdung(congdung);
		if(Congdung.isEmpty()) {
			save(congdung);
			return true;
		}	
		return false;
	}
	
	public boolean edit(int id, String congdung) {
		Optional<Congdung> Congdung =td.findById(id);
		if( Congdung.isPresent()) {
			Congdung.get().setTencongdung(congdung);
			td.save(Congdung.get());
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
