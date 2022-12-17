package com.tracuucayduoclieu.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tracuucayduoclieu.Entity.Baiviet;

public interface RepositoryBaiviet extends JpaRepository<Baiviet,Integer> {
	
	public Page<Baiviet> findByTenbaiviet(String tenbaiviet, Pageable page);	
	
	public Page<Baiviet> findByMabaiviet(int Mabaiviet, Pageable page);
	
	public List<Baiviet> findByTrangthai (boolean trangthai );
	
	public Page<Baiviet> findByTrangthai (boolean trangthai, Pageable page);
}
