package com.tracuucayduoclieu.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracuucayduoclieu.Entity.*;

public interface RepositoryTenGoiKhac extends JpaRepository<Tengoikhac,Integer> {
	@Query("SELECT T FROM Tengoikhac T WHERE T.tengoi like %?1%")
	public List<Tengoikhac> timKiemTheoTenTenGoiKhac(String key);
	
	@Query("SELECT T FROM Tengoikhac T WHERE T.maten =?1")
	public List<Tengoikhac> timKiemTheoMaTenGoiKhac(int key);
	
	public Optional<Tengoikhac> findByTengoi(String tengoi);
	
}
