package com.tracuucayduoclieu.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracuucayduoclieu.Entity.Nguoidung;

public interface RepositoryNguoidung extends JpaRepository<Nguoidung, String> {

	@Query("SELECT N FROM Nguoidung N WHERE N.taikhoan=?1")
	public Nguoidung timKiemTheoTaiKhoanNguoiDung (String taikhoan);
	
	
}
