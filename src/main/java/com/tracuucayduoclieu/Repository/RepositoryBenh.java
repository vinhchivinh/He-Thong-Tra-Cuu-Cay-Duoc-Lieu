package com.tracuucayduoclieu.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.tracuucayduoclieu.Entity.Benh;

public interface RepositoryBenh extends JpaRepository<Benh,Integer>{
	
	public Optional<Benh> findByTenbenh (String tenbenh);
	
//	@Query("SELECT B FROM BENH B WHERE B.tenbenh = %?1 ")
//	public Page<Benh> findByTenbenh(String tenbenh, Pageable page);
	
}
