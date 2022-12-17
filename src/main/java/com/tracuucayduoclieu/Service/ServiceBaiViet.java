package com.tracuucayduoclieu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Baiviet;
import com.tracuucayduoclieu.Entity.Cauhoi;
import com.tracuucayduoclieu.Entity.Cayduoclieu;
import com.tracuucayduoclieu.Repository.RepositoryBaiviet;

@Service
public class ServiceBaiViet {
	@Autowired
	private RepositoryBaiviet bv;
	
	public Baiviet save (Baiviet baiviet) {
		return bv.save(baiviet);
	}
	
	public Page<Baiviet> findAll(int offset, int fetch) {
		Pageable page =PageRequest.of(offset, fetch,Sort.by(Sort.Direction.DESC, "mabaiviet"));
		return bv.findAll(page);
	}
	
	public Optional<Baiviet> findById(String id) {
		return bv.findById(Integer.parseInt(id));
	}
	
	public void delete (Baiviet baiviet) {
		bv.delete(baiviet);
	}

	public void deleteSet(String dsBaiviet[]) {
		int i;
		for( i=0; i<dsBaiviet.length; i++) {
			Baiviet baiviet  = new Baiviet();
			baiviet.setMabaiviet(Integer.parseInt(dsBaiviet[i]));
			bv.delete(baiviet);
		}
	}
	
	public Page<Baiviet> findByTenbaiviet(String tenbaiviet,int offset, int fetch){
		Pageable page = PageRequest.of(offset, fetch);
		return bv.findByTenbaiviet(tenbaiviet, page);	
	}
	
	public Page<Baiviet> findByMabaiviet(int mabaiviet,int offset, int fetch) {
		Pageable page = PageRequest.of(offset, fetch);
		return bv.findByMabaiviet(mabaiviet, page);
	}
	
	public Page<Baiviet> search (String key, int offset, int fetch){
		int mabaiviet;
		Pageable page = PageRequest.of(offset,fetch);
		String tenbaiviet;
		try {
			mabaiviet = Integer.parseInt(key);
			return findByMabaiviet(mabaiviet, offset, fetch);
		}
		catch (Exception e) {
			// TODO: handle exception
			tenbaiviet = key;
			return findByTenbaiviet(tenbaiviet, offset, fetch);
		}
	}
	
	public List<Baiviet> baiVietChoPheDuyet () {
		return bv.findByTrangthai(false);
	}
	
	public Baiviet duyetBaiviet(String id) {
		Optional<Baiviet> cauhoi =findById(id);
		Baiviet cauhoiduyet =new Baiviet();
		cauhoiduyet= cauhoi.get();
		cauhoiduyet.setTrangthai(true);
		return bv.save(cauhoiduyet);
	}
	
	public Page<Baiviet> danhsachbaivietdaduyet (int page) {
		return bv.findByTrangthai(true,PageRequest.of(page,10,Sort.by(Sort.Direction.DESC, "mabaiviet")));
	}
}
