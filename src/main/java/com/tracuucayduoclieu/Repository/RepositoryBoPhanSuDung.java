package com.tracuucayduoclieu.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.tracuucayduoclieu.Entity.Bophansudung;
import com.tracuucayduoclieu.Entity.Cayduoclieu;

public interface RepositoryBoPhanSuDung extends JpaRepository<Bophansudung,Integer>{
	
	public Optional<Bophansudung> findByTenbophan(String tenbophan);
	
}
