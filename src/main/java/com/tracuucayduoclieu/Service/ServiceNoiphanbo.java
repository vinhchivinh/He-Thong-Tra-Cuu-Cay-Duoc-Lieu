package com.tracuucayduoclieu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Noiphanbo;
import com.tracuucayduoclieu.Entity.Tinhvi;
import com.tracuucayduoclieu.Repository.RepositoryNoiphanbo;
import com.tracuucayduoclieu.Repository.RepositoryTinhvi;

@Service
public class ServiceNoiphanbo {
	@Autowired
	RepositoryNoiphanbo npb;
	
	public List<Noiphanbo> findAll(){
		return npb.findAll();
	}
	
	
	public Noiphanbo save(Noiphanbo noiphanbo) {
		return npb.save(noiphanbo);
	}
	
	public Noiphanbo edit(String maNoiphanbo, String tenNoiphanbo) {
		Noiphanbo Noiphanbo =new Noiphanbo();
		Noiphanbo.setIdnoiphanbo(Integer.parseInt(maNoiphanbo));
		Noiphanbo.setPhanbo(tenNoiphanbo);
		return npb.save(Noiphanbo);
	}
	
	public Noiphanbo save(String tennoiphanbo) {
		Noiphanbo  cd =new Noiphanbo();
		cd.setPhanbo(tennoiphanbo);
		return npb.save(cd);
	}
	
	public Page<Noiphanbo> findAll(int offset, int fetch){
		PageRequest pa = PageRequest.of(offset,fetch,Sort.by(Sort.Direction.DESC, "Idnoiphanbo")); 
		return npb.findAll(pa);
	}
	
	public int countAll(){
		long count =npb.count();
		float countALL =(float)count/10;
		
		if(countALL %2 !=0){
			countALL++;
		}
		return (int)countALL;
		
	}
	
	public void deleteSet(String dsnoiphanbo[]) {
		int i;
		for( i=0; i<dsnoiphanbo.length; i++) {
			Noiphanbo Noiphanbo = new Noiphanbo();
			Noiphanbo.setIdnoiphanbo(Integer.parseInt(dsnoiphanbo[i]));
			this.npb.delete(Noiphanbo);
		}
	}
	
	public void delete(String manoiphanbo) {
		Noiphanbo Noiphanbo =new Noiphanbo();
		Noiphanbo.setIdnoiphanbo(Integer.parseInt(manoiphanbo));
		npb.delete(Noiphanbo);
	}
	public List<Noiphanbo> timKiemTheoKiTu(String key){
		
		try {
		int keyInt = Integer.parseInt(key);
		return npb.timKiemTheoIdPhanBo(keyInt);
		}
		catch (Exception e){
			return npb.timKiemTheoTenNoiPhanBo(key);
		}
		
	}
	public boolean themNoiphanbo(String noiphanbo) {
		Optional<Noiphanbo> Noiphanbo = npb.findByPhanbo(noiphanbo);
		if(Noiphanbo.isEmpty()) {
			save(noiphanbo);
			return true;
		}	
		return false;
	}
	
	public boolean edit(int id, String noiphanbo) {
		Optional<Noiphanbo> Noiphanbo =npb.findById(id);
		if( Noiphanbo.isPresent()) {
			Noiphanbo.get().setPhanbo(noiphanbo);
			npb.save(Noiphanbo.get());
			return true;
		}
		else {
			return false;
		}
	}
	
}
