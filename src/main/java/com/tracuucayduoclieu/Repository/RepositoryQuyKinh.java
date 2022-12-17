package com.tracuucayduoclieu.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracuucayduoclieu.Entity.Congdung;
import com.tracuucayduoclieu.Entity.Quykinh;

public interface RepositoryQuyKinh extends JpaRepository<Quykinh,Integer>{

	@Query("SELECT Q FROM Quykinh Q WHERE Q.tenquykinh like %?1%")
	public List<Quykinh> timKiemTheoTenQuykinh(String key);
	
	@Query("SELECT Q FROM Quykinh Q WHERE Q.maquykinh =?1")
	public List<Quykinh> timKiemTheoMaQuykinh(int key);
	
	public Optional<Quykinh> findByTenquykinh(String tenquykinh);
}
