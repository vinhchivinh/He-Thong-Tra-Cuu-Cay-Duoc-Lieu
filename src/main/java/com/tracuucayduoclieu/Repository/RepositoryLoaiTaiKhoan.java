package com.tracuucayduoclieu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tracuucayduoclieu.Entity.Loaitaikhoan;

@Repository
public interface RepositoryLoaiTaiKhoan extends JpaRepository<Loaitaikhoan, Integer> {

}
