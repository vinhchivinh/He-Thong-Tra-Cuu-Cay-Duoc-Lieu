package com.tracuucayduoclieu.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.tracuucayduoclieu.Entity.Loaitaikhoan;
import com.tracuucayduoclieu.Entity.Nguoidung;
import com.tracuucayduoclieu.Repository.RepositoryLoaiTaiKhoan;
import com.tracuucayduoclieu.Repository.RepositoryNguoidung;

@Service
public class ServiceNguoidung {

	@Autowired
	private RepositoryNguoidung nd;

	@Autowired
	private RepositoryLoaiTaiKhoan ltk;

	@Autowired
	private SessionRegistry sessionRegistry;

	// Mã Hóa Mật Khẩu Sử Dụng Bcrypt
	@Autowired
	private BCryptPasswordEncoder bcrypt;

	public Nguoidung save(String sdt, String hovaten, String email, int gioitinh, String taikhoan, String matkhau,
			String ngaysinh) {

		Nguoidung nguoidung = new Nguoidung();

		nguoidung.setSdt(sdt);

		nguoidung.setHovaten(hovaten);

		nguoidung.setEmail(email);

		if (gioitinh == 0) {
			nguoidung.setGioitinh(true);
		} else {
			nguoidung.setGioitinh(false);
		}

		nguoidung.setTaikhoan(taikhoan);

		matkhau = bcrypt.encode(matkhau);
		nguoidung.setMatkhau(matkhau);

		Date date = Date.valueOf(ngaysinh);
		nguoidung.setNgaysinh(date);

		nguoidung.setMaloai(null);

		Optional<Loaitaikhoan> loaitaikhoan = ltk.findById(2);
		nguoidung.setMaloai(loaitaikhoan.get());

		return nd.save(nguoidung);
	}

	public Optional<Nguoidung> findByTaiKhoan(String id) {
		return nd.findById(id);
	}

	public Nguoidung timTaiKhoan(String taikhoan) {
		return nd.timKiemTheoTaiKhoanNguoiDung(taikhoan);
	}

	public String layHoTenNguoiDungDaXacThuc() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		String name = authentication.getName();
		if (name.equals("anonymousUser")) {
			return "null";
		}

		Nguoidung nguoidung = new Nguoidung();
		nguoidung = timTaiKhoan(authentication.getName());

		return nguoidung.getHovaten();

	}

	public Nguoidung layThongTinNguoiDungDaXacThuc() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Nguoidung nguoidung = new Nguoidung();
		nguoidung = timTaiKhoan(authentication.getName());

		return nguoidung;
	}
	
//
//	public List<Nguoidung> getUsersFromSessionRegistry() {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		String userName = auth.getName();
//
//		List<Object> principals = sessionRegistry.getAllPrincipals();
//
//		List<Nguoidung> usersInfoList = new ArrayList<Nguoidung>();
//
//		for (Object principal : principals) {
//			if (principal instanceof Nguoidung) {
//				if (!((Nguoidung) principal).getTaikhoan().equals(userName)) {
//					for (SessionInformation sess : sessionRegistry.getAllSessions(principal, false)) {
//						if (!sess.isExpired()) {
//							usersInfoList.add((Nguoidung) sess.getPrincipal());
//						}
//					}
//
//				}
//			}
//			
//		}
//		System.out.print(usersInfoList);
//		return usersInfoList;
//	}
	public List<User> getUsersFromSessionRegistry() {
		List<Object> principals=sessionRegistry.getAllPrincipals();
		List<String> a = new ArrayList<>();
		List<User> userlist =new ArrayList<>();
	
		for(Object value: principals) {
			if(value instanceof User) {
				userlist.add((User) value);
			}
		}
		return userlist;
	}
	
	
}
