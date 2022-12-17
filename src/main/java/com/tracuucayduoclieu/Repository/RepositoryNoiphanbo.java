package com.tracuucayduoclieu.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracuucayduoclieu.Entity.*;

public interface RepositoryNoiphanbo extends JpaRepository<Noiphanbo,Integer> {
	@Query("SELECT N FROM Noiphanbo N WHERE N.phanbo like %?1%")
	public List<Noiphanbo> timKiemTheoTenNoiPhanBo(String key);
	
	@Query("SELECT N FROM Noiphanbo N WHERE N.idnoiphanbo =?1")
	public List<Noiphanbo> timKiemTheoIdPhanBo(int key);
	
	public Optional<Noiphanbo> findByPhanbo(String phanbo);
}
