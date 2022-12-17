package com.tracuucayduoclieu.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracuucayduoclieu.Entity.Congdung;
import com.tracuucayduoclieu.Entity.Thanhphanhoahoc;

public interface RepositoryThanhphanhoahoc extends JpaRepository<Thanhphanhoahoc,Integer>  {
	
	@Query("SELECT T FROM Thanhphanhoahoc T WHERE T.tenthanhphan like %?1%")
	public List<Thanhphanhoahoc> timKiemTheoTenThanhPhan(String key);
	
	@Query("SELECT T FROM Thanhphanhoahoc T WHERE T.mathanhphan =?1")
	public List<Thanhphanhoahoc> timKiemTheoMaThanhPhan(int key);
	
	public Optional<Thanhphanhoahoc> findByTenthanhphan(String tenthanhphan);
	
}
