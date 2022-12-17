package com.tracuucayduoclieu.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracuucayduoclieu.Entity.*;

public interface RepositoryTinhvi extends JpaRepository<Tinhvi,Integer> {
	@Query("SELECT T FROM Tinhvi T WHERE T.tentinhvi like %?1%")
	public List<Tinhvi> timKiemTheoTenTinhVi(String key);
	
	@Query("SELECT T FROM Tinhvi T WHERE T.matinhvi =?1")
	public List<Tinhvi> timKiemTheoMaTinhVi(int key);
	
	public Optional<Tinhvi> findByTentinhvi(String tentinhvi);
}
