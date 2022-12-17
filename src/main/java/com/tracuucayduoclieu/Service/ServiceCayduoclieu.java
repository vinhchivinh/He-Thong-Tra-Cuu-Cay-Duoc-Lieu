package com.tracuucayduoclieu.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.tracuucayduoclieu.Entity.*;
import com.tracuucayduoclieu.Repository.RepositoryBenh;
import com.tracuucayduoclieu.Repository.RepositoryCayDuocLieu;
import com.tracuucayduoclieu.Repository.RepositoryHinh;
import com.tracuucayduoclieu.Repository.RepositoryTenGoiKhac;

@Service
public class ServiceCayduoclieu {
	
	@Autowired
	private RepositoryCayDuocLieu cdl;
	
	@Autowired
	private RepositoryBenh b;
	
	@Autowired
	private RepositoryTenGoiKhac tgk;
	
	public List<Cayduoclieu> findAll(){
		return cdl.findAll();
	}
	
	public Page<Cayduoclieu> findAll(int offset, int fetch){
		PageRequest pa = PageRequest.of(offset,fetch,Sort.by(Sort.Direction.DESC, "maduoclieu")); 
		return cdl.findAll(pa);
	}
	
	public int countAll(){
		long count =cdl.count();
		float countALL =(float)count/10;
		
		if(countALL %2 !=0){
			countALL++;
		}
		return (int)countALL;
		
	}
//	public String themCayDuocLieu(@RequestParam("tencayduoclieu") String tencayduoclieu,
//			@RequestParam("tenkhoahoc") String tenkhoahoc, @RequestParam("img-1") MultipartFile multipartFile1,
//			@RequestParam("img-2") MultipartFile multipartFile2, @RequestParam("img-3") MultipartFile multipartFile3,
//			@RequestParam("bophansudung") String bophansudung[],
//			@RequestParam("chutri") String chutri[],
//			@RequestParam("thanhphanhoahoc") String thanhphanhoahoc[],
//			@RequestParam("tengoikhac") String tengoikhac,
//			@RequestParam("congdung") String congdung[],
//			@RequestParam("hoduoclieu") String hoduoclieu,
//			@RequestParam("tinhvi") String tinhvi[],
//			@RequestParam("quykinh") String quykinh[],
//			@RequestParam("noiphanbo") String danhsachnoiphanbo[], @RequestParam("motacay") String motacay,
//			@RequestParam("tacdungduocly") String tacdungduocly,
//			@RequestParam("lieudungcachdung") String lieudungcachdung, @RequestParam("luuy") String luuy) {
//		
//		
//
//		return null;
	
	public Cayduoclieu save(String tencayduoclieu,String tenkhoahoc,String motacay,String tengoikhac[],String bophansudung[] , String chutri[],
			String hoduoclieu, String tinhvi[],String quykinh[],String noiphanbo[],
			String congdung[],String thanhphanhoahoc[],String tacdungduocly,String lieudungcachdung, String luuy,MultipartFile mt1,MultipartFile mt2,MultipartFile mt3) {
	
		Cayduoclieu cayduoclieu =new Cayduoclieu();
		cayduoclieu.setTenduoclieu(tencayduoclieu);
		cayduoclieu.setTenkhoahoc(tenkhoahoc);
		
		List<Bophansudung> listbpsd = new ArrayList<>();
		for(int i =0; i<bophansudung.length; i++) {
			Bophansudung bpsd =new Bophansudung();
			bpsd.setMabophan(Integer.parseInt(bophansudung[i]));
			listbpsd.add(bpsd);
		}
		cayduoclieu.setBophansudung(listbpsd);
		
		List<Benh> listb = new ArrayList<>();
		for(int i =0; i<chutri.length; i++) {
			Benh b =new Benh();
			b.setMabenh(Integer.parseInt(chutri[i]));
			listb.add(b);
		}
		cayduoclieu.setBenh(listb);
		
		List<Thanhphanhoahoc> listtphh = new ArrayList<>();
		for(int i =0; i<thanhphanhoahoc.length; i++) {
			Thanhphanhoahoc t =new Thanhphanhoahoc();
			t.setMathanhphan(Integer.parseInt(thanhphanhoahoc[i]));
			listtphh.add(t);
		}
		cayduoclieu.setThanhphanhoahoc(listtphh);
		
		List<Tengoikhac> listtgk = new ArrayList<>();
		for(int i =0; i<tengoikhac.length; i++) {
			Tengoikhac t =new Tengoikhac();
			t.setMaten(Integer.parseInt(tengoikhac[i]));
			listtgk.add(t);
		}
		cayduoclieu.setTengoikhac(listtgk);
		
		List<Congdung> listtcd = new ArrayList<>();
		for(int i =0; i<congdung.length; i++) {
			Congdung t =new Congdung();
			t.setMacongdung(Integer.parseInt(congdung[i]));
			listtcd.add(t);
		}
		cayduoclieu.setCongdung(listtcd);
		
		Hoduoclieu hdl =new Hoduoclieu();
		hdl.setMahoduoclieu(Integer.parseInt(hoduoclieu));
		cayduoclieu.setMaho(hdl);
		
		List<Tinhvi> listtv = new ArrayList<>();
		for(int i =0; i<tinhvi.length; i++) {
			Tinhvi t =new Tinhvi();
			t.setMatinhvi(Integer.parseInt(tinhvi[i]));
			listtv.add(t);
		}
		cayduoclieu.setTinhvi(listtv);
		
		List<Quykinh> listqk = new ArrayList<>();
		for(int i =0; i<quykinh.length; i++) {
			Quykinh t =new Quykinh();
			t.setMaquykinh(Integer.parseInt(quykinh[i]));
			listqk.add(t);
		}
		cayduoclieu.setQuykinh(listqk);
		
		List<Noiphanbo> listnpb = new ArrayList<>();
		for(int i =0; i<noiphanbo.length; i++) {
			Noiphanbo t =new Noiphanbo();
			t.setIdnoiphanbo(Integer.parseInt(noiphanbo[i]));
			listnpb.add(t);
		}
		cayduoclieu.setNoiphanbo(listnpb);
		
		cayduoclieu.setMota(motacay);
		cayduoclieu.setTacdungduocly(tacdungduocly);
		cayduoclieu.setLieudungvacachdung(luuy);
		cayduoclieu.setLuuy(luuy);
		
		Cayduoclieu savedcayduoclieu=cdl.save(cayduoclieu);
		

		for(int i =0; i<tengoikhac.length; i++) {
			Optional<Tengoikhac> t = tgk.findById(Integer.parseInt(tengoikhac[i]));
			t.get().setMaduoclieu(savedcayduoclieu);
			tgk.save(t.get());
		}
		
		return savedcayduoclieu;
	}	
	
	public Cayduoclieu save(int Maduoclieu, String tencayduoclieu,String tenkhoahoc,String motacay,String tengoikhac[],String bophansudung[] , String chutri[],
			String hoduoclieu, String tinhvi[],String quykinh[],String noiphanbo[],
			String congdung[],String thanhphanhoahoc[],String tacdungduocly,String lieudungcachdung, String luuy,MultipartFile mt1,MultipartFile mt2,MultipartFile mt3) {
	
		Optional<Cayduoclieu> cayduoclieuupdate =cdl.findById(Maduoclieu);
		Cayduoclieu cayduoclieu = cayduoclieuupdate.get();
		cayduoclieu.setMaduoclieu(Maduoclieu);
		cayduoclieu.setTenduoclieu(tencayduoclieu);
		cayduoclieu.setTenkhoahoc(tenkhoahoc);
		
		List<Bophansudung> listbpsd = new ArrayList<>();
		for(int i =0; i<bophansudung.length; i++) {
			Bophansudung bpsd =new Bophansudung();
			bpsd.setMabophan(Integer.parseInt(bophansudung[i]));
			listbpsd.add(bpsd);
		}
		cayduoclieu.setBophansudung(listbpsd);
//		
		List<Benh> listb = new ArrayList<>();
		for(int i =0; i<chutri.length; i++) {
			Benh b =new Benh();
			b.setMabenh(Integer.parseInt(chutri[i]));
			listb.add(b);
		}
		cayduoclieu.setBenh(listb);
//		
		List<Thanhphanhoahoc> listtphh = new ArrayList<>();
		for(int i =0; i<thanhphanhoahoc.length; i++) {
			Thanhphanhoahoc t =new Thanhphanhoahoc();
			t.setMathanhphan(Integer.parseInt(thanhphanhoahoc[i]));
			listtphh.add(t);
		}
		cayduoclieu.setThanhphanhoahoc(listtphh);
		
//		List<Tengoikhac> listtgk = new ArrayList<>();
//		for(int i =0; i<tengoikhac.length; i++) {
//			Tengoikhac t =new Tengoikhac();
//			t.setMaten(Integer.parseInt(tengoikhac[i]));
//			listtgk.add(t);
//		}
//		cayduoclieu.setTengoikhac(listtgk);
//		
		List<Congdung> listtcd = new ArrayList<>();
		for(int i =0; i<congdung.length; i++) {
			Congdung t =new Congdung();
			t.setMacongdung(Integer.parseInt(congdung[i]));
			listtcd.add(t);
		}
		cayduoclieu.setCongdung(listtcd);
		
		Hoduoclieu hdl =new Hoduoclieu();
		hdl.setMahoduoclieu(Integer.parseInt(hoduoclieu));
		cayduoclieu.setMaho(hdl);
		
		List<Tinhvi> listtv = new ArrayList<>();
		for(int i =0; i<tinhvi.length; i++) {
			Tinhvi t =new Tinhvi();
			t.setMatinhvi(Integer.parseInt(tinhvi[i]));
			listtv.add(t);
		}
		cayduoclieu.setTinhvi(listtv);
		
		List<Quykinh> listqk = new ArrayList<>();
		for(int i =0; i<quykinh.length; i++) {
			Quykinh t =new Quykinh();
			t.setMaquykinh(Integer.parseInt(quykinh[i]));
			listqk.add(t);
		}
		cayduoclieu.setQuykinh(listqk);
		
		List<Noiphanbo> listnpb = new ArrayList<>();
		for(int i =0; i<noiphanbo.length; i++) {
			Noiphanbo t =new Noiphanbo();
			t.setIdnoiphanbo(Integer.parseInt(noiphanbo[i]));
			listnpb.add(t);
		}
		cayduoclieu.setNoiphanbo(listnpb);
		
		cayduoclieu.setMota(motacay);
		cayduoclieu.setTacdungduocly(tacdungduocly);
		cayduoclieu.setLieudungvacachdung(luuy);
		cayduoclieu.setLuuy(luuy);
//		
		Cayduoclieu savedcayduoclieu=cdl.save(cayduoclieu);	
//		
//		
		List<Tengoikhac> danhsachtengoikhac = cayduoclieu.getTengoikhac();
		for(Tengoikhac e :danhsachtengoikhac ) {
			e.setMaduoclieu(null);
			tgk.save(e);
		}
		
		for(int i =0; i<tengoikhac.length; i++) {
			Optional<Tengoikhac> t = tgk.findById(Integer.parseInt(tengoikhac[i]));
			t.get().setMaduoclieu(savedcayduoclieu);
			tgk.save(t.get());
		}
//		
		return savedcayduoclieu;
	}	
	
	public void deleteSet(String dsCayduoclieu[]) {
		int i;
		for( i=0; i<dsCayduoclieu.length; i++) {
			Cayduoclieu Cayduoclieu  = new Cayduoclieu();
			Cayduoclieu.setMaduoclieu(Integer.parseInt(dsCayduoclieu[i]));
			cdl.delete(Cayduoclieu);
		}
	}

	public void delete(String maCayduoclieu) {
		Cayduoclieu Cayduoclieu =new Cayduoclieu();
		Cayduoclieu.setMaduoclieu(Integer.parseInt(maCayduoclieu));
		cdl.delete(Cayduoclieu);
	}
	
	public Optional<Cayduoclieu> findById(int id) {
		return cdl.findById(id);
	}
	
	public List<Cayduoclieu> timKiemTheoTenDuocLieu(String tencay) {
		return cdl.timKiemTheoTenDuocLieu1(tencay);
	}
	
	public Page<Cayduoclieu> findByBenh (int idbenh,int offset, int fetch) {
		Benh benh =new Benh();
		benh.setMabenh(idbenh);
		Pageable page =PageRequest.of(offset, fetch);
		return cdl.findByBenh(benh,page);
	}
	
//	public Page<Cayduoclieu> findByTenBenh () {
//		
//		TypedQuery<Cayduoclieu> query = entityManager.createQuery();
//		
//		return null;
//	}
//	
//	public Page<Cayduoclieu> findByTenduoclieuOrBenh(String key,int offset, int fetch){
//		Page<Cayduoclieu> cayduoclieu;
//		Optional<Benh> benh =b.findByTenbenh(key);
//		Pageable page = PageRequest.of(offset,fetch);
//		if(benh.isPresent()) {
//			cayduoclieu = cdl.findByTenduoclieuOrBenh(key, benh.get(), page);
//		}
//		else {
//			 cayduoclieu = cdl.findByTenduoclieu(key,page);
//		}
//		return cayduoclieu;
//	}
	public boolean timBoiTenDuocLieu(String tenduoclieu) {
		if( cdl.findByTenduoclieu(tenduoclieu).isPresent() ) {
			return true;
		}
		return false;
	}
	
	public Page<Cayduoclieu> taoDanhSachNgauNhien(){
		Long total = cdl.count();
		Random generator = new Random();
		int offset =(int) generator.nextLong(total-4);
		Pageable page = PageRequest.of(offset,4);
		return cdl.findAll(page);
	}
	
	public Page<Cayduoclieu> timKiemBangCayDuocLieu(String kitu, int offset){
		Pageable page = PageRequest.of(offset,16);
		return cdl.findByChar(kitu,page);
	}
	
	public Page<Cayduoclieu> findByTenduoclieuOrTenbenhOrChucai(String key, int page) 
	{
//		Pageable p =PageRequest.of(page,16);
//		return cdl.timKiemTheoTenDuocLieu(key,p);
		Pageable p =PageRequest.of(page,16);
//		return cdl.findByTenBenh(key,p);
		if(key.length() == 1) {
			return cdl.findByChar(key, p);
		}
		else if ( b.findByTenbenh(key).isPresent() ) {
			return cdl.findByTenBenh(key,p);
		}
		else {
			return cdl.timKiemTheoTenDuocLieu(key,p);
		}
	}
}
