package com.tracuucayduoclieu.Repository;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tracuucayduoclieu.Entity.Cauhoi;

public interface RepositoryCauhoi extends JpaRepository<Cauhoi,Integer> {
	@Query("SELECT C FROM Cauhoi C WHERE C.ngaydang BETWEEN :date_begin AND :date_end ")
	public List<Cauhoi> danhSachCauHoiGiuaCacNgay(@Param("date_begin") Timestamp date_begin , @Param("date_end")Timestamp date_end );
	
//	//Tìm Theo Trạng Thái Câu Hỏi
//	@Query("SELECT C FROM Cauhoi C Where C.trangthai = ?1 ")
//	public Page<Cauhoi> timKiemBoiTrangThai(boolean Trangthai, Pageable pageable);
//	
//	//Tìm Theo Tên Câu Hỏi
//	@Query("SELECT C FROM Cauhoi C Where C.tencauhoi like %?1% ")
//	public Page<Cauhoi> timKiemBoiTenCauHoi(String tencauhoi, Pageable pageable);
//	
//	//Tìm Theo Mã Câu Hỏi
//	@Query("SELECT C FROM Cauhoi C Where C.macauhoi = ?1 and C.trangthai = ?1  and C.tencauhoi like %?1% ")
//	public Page<Cauhoi> timKiemBoiMaCauHoi(int macauhoi, Pageable pageable);
//	
//	//Tìm Theo Ngày
//	@Query("SELECT C FROM Cauhoi C Where C.ngaydang > ngay ")
//	public Page<Cauhoi> timKiemBoiNgay(String ngay, Pageable pageable);
	

	public Page<Cauhoi> findByMacauhoiOrTencauhoi(int macauhoi, String tencauhoi, Pageable page);
	
	public Page<Cauhoi> findByMacauhoiAndTrangthai (int macauhoi, boolean trangthai,Pageable page );
	
	public Page<Cauhoi> findByTencauhoiAndTrangthai (String tencauhoi, boolean trangthai, Pageable page);

	public Page<Cauhoi> findByTrangthai(boolean trang_thai ,Pageable page);
	
	@Query("SELECT C FROM Cauhoi C Where C.tencauhoi like %?1% and C.trangthai=?2")
	public Page<Cauhoi> findByTenCauHoi( String tencauhoi,boolean trangthai ,Pageable page);
	
	public List<Cauhoi> findByTrangthai (boolean trangthai);
	
	
	
	

}
