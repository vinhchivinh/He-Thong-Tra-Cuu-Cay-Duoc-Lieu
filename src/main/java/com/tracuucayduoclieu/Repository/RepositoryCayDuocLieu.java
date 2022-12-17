package com.tracuucayduoclieu.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tracuucayduoclieu.Entity.Benh;
import com.tracuucayduoclieu.Entity.Cayduoclieu;
import com.tracuucayduoclieu.Entity.Hoduoclieu;

public interface RepositoryCayDuocLieu extends JpaRepository<Cayduoclieu,Integer>{
	
	@Query("SELECT C FROM Cayduoclieu C WHERE C.tenduoclieu like %?1%")
	public List<Cayduoclieu> timKiemTheoTenDuocLieu1(String key);
	
	@Query("SELECT C FROM Cayduoclieu C WHERE C.tenduoclieu like %?1%")
	public Page<Cayduoclieu> timKiemTheoTenDuocLieu(String key, Pageable page);
	
	public Page<Cayduoclieu> findByBenh(Benh benh,Pageable page);
	
	public Page<Cayduoclieu> findByTenduoclieuOrBenh(String tenduoclieu,Benh benh, Pageable page);

	public Page<Cayduoclieu> findByTenduoclieu(String tenduoclieu, Pageable page);
	
	public Optional<Cayduoclieu> findByTenduoclieu(String tenduoclieu);
	
	@Query("SELECT C FROM Cayduoclieu C  WHERE C.tenduoclieu like ?1% ")
	public Page<Cayduoclieu> findByChar (String kitu, Pageable page);	
	/* @Query("SELECT C FROM C Cayduoclieu WHERE C.") */
	
	@Query (" SELECT C FROM Cayduoclieu C JOIN C.benh B WHERE B.tenbenh like %?1% ")
	public Page<Cayduoclieu> findByTenBenh(String tenbenh, Pageable page);
	
}
