package com.tracuucayduoclieu.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracuucayduoclieu.Entity.Congdung;

public interface RepositoryTacDung extends JpaRepository<Congdung,Integer> {
	
	@Query("SELECT C FROM Congdung C WHERE C.tencongdung like %?1%")
	public List<Congdung> timKiemTheoTenCongDung(String key);
	
	@Query("SELECT C FROM Congdung C WHERE C.macongdung =?1")
	public List<Congdung> timKiemTheoMaCongDung(int key);
	
	public Optional<Congdung> findByTencongdung(String tencongdung);
}
