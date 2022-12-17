package com.tracuucayduoclieu.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tracuucayduoclieu.Entity.Hoduoclieu;
import com.tracuucayduoclieu.Entity.Loaitaikhoan;
import com.tracuucayduoclieu.Entity.Quykinh;

@Repository
public interface RepositoryHoDuocLieu extends JpaRepository <Hoduoclieu, Integer>{
	@Query("SELECT H FROM Hoduoclieu H WHERE H.tenhoduoclieu like %?1%")
	public List<Hoduoclieu> timKiemTheoTenHoDuocLieu(String key);
	
	@Query("SELECT H FROM Hoduoclieu H WHERE H.mahoduoclieu =?1")
	public List<Hoduoclieu> timKiemTheoMaHoDuocLieu(int key);
	
	public Optional<Hoduoclieu> findByTenhoduoclieu(String tenhoduoclieu);
	
}
