package com.tracuucayduoclieu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Bophansudung;
import com.tracuucayduoclieu.Entity.Congdung;
import com.tracuucayduoclieu.Entity.Thanhphanhoahoc;
import com.tracuucayduoclieu.Repository.RepositoryTacDung;
import com.tracuucayduoclieu.Repository.RepositoryThanhphanhoahoc;

@Service
public class ServiceThanhphanhoahoc {
	@Autowired
	RepositoryThanhphanhoahoc tphh;

	public List<Thanhphanhoahoc> findAll(){
		return tphh.findAll();
	}
	
	public Thanhphanhoahoc save(Thanhphanhoahoc thanhphanhoahoc) {
		return tphh.save(thanhphanhoahoc);
	}

	public Thanhphanhoahoc edit(String mathanhphanhoahoc, String tenthanhphanhoahoc) {
		Thanhphanhoahoc thanhphanhoahoc = new Thanhphanhoahoc();
		thanhphanhoahoc.setMathanhphan(Integer.parseInt(mathanhphanhoahoc));
		thanhphanhoahoc.setTenthanhphan(tenthanhphanhoahoc);
		return tphh.save(thanhphanhoahoc);
	}

	public Thanhphanhoahoc save(String tenthanhphanhoahoc) {
		Thanhphanhoahoc thanhphanhoahoc = new Thanhphanhoahoc();
		thanhphanhoahoc.setTenthanhphan(tenthanhphanhoahoc);
		return tphh.save(thanhphanhoahoc);
	}

	public Page<Thanhphanhoahoc> findAll(int offset, int fetch) {
		PageRequest pa = PageRequest.of(offset, fetch, Sort.by(Sort.Direction.DESC, "mathanhphan"));
		return tphh.findAll(pa);
	}

	public int countAll() {
		long count = tphh.count();
		float countALL = (float) count / 10;

		if (countALL % 2 != 0) {
			countALL++;
		}
		return (int) countALL;

	}

	public void deleteSet(String dsthanhphanhoahoc[]) {
		int i;
		for (i = 0; i < dsthanhphanhoahoc.length; i++) {
			Thanhphanhoahoc thanhphanhoahoc = new Thanhphanhoahoc();
			thanhphanhoahoc.setMathanhphan(Integer.parseInt(dsthanhphanhoahoc[i]));
			tphh.delete(thanhphanhoahoc);
		}
	}

	public void delete(String mathanhphanhoahoc) {
		Thanhphanhoahoc thanhphanhoahoc = new Thanhphanhoahoc();
		thanhphanhoahoc.setMathanhphan(Integer.parseInt(mathanhphanhoahoc));
		tphh.delete(thanhphanhoahoc);
	}

	public List<Thanhphanhoahoc> timKiemTheoKiTu(String key) {

		try {
			int keyInt = Integer.parseInt(key);
			return tphh.timKiemTheoMaThanhPhan(keyInt);
		} catch (Exception e) {
			return tphh.timKiemTheoTenThanhPhan(key);
		}
	}
	
	public boolean themThanhPhanHoaHoc(String tenthanhphan) {
		Optional<Thanhphanhoahoc> thanhphanhoahoc = tphh.findByTenthanhphan(tenthanhphan);
		if(thanhphanhoahoc.isEmpty()) {
			save(tenthanhphan);
			return true;
		}	
		return false;
	}
	
	public boolean edit(int id, String tenthanhphan) {
		Optional<Thanhphanhoahoc> thanhphanhoahoc =tphh.findById(id);
		if(thanhphanhoahoc.isPresent()) {
			thanhphanhoahoc.get().setTenthanhphan(tenthanhphan);
			tphh.save(thanhphanhoahoc.get());
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
