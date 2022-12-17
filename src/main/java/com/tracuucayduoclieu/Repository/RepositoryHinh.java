package com.tracuucayduoclieu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracuucayduoclieu.Entity.Hinh;

@Repository
public interface RepositoryHinh extends JpaRepository<Hinh,Integer> {

}
