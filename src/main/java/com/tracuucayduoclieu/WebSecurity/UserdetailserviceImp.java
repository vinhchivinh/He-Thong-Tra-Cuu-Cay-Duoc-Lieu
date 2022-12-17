package com.tracuucayduoclieu.WebSecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Nguoidung;
import com.tracuucayduoclieu.Repository.RepositoryNguoidung;

@Service
public class UserdetailserviceImp implements UserDetailsService {

	@Autowired
	private RepositoryNguoidung nd;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Nguoidung nguoidung=nd.timKiemTheoTaiKhoanNguoiDung(username);
		if(nguoidung ==null) {
			throw new UsernameNotFoundException("not found");
		}
		List<GrantedAuthority> grantlist =new ArrayList<GrantedAuthority>();
		GrantedAuthority authority =new SimpleGrantedAuthority(nguoidung.getMaloai().getTenloai());
		grantlist.add(authority);
		
		UserDetails userdetail =new User(nguoidung.getTaikhoan(),nguoidung.getMatkhau(), grantlist);
		System.out.print(userdetail.getUsername());
		return userdetail;
	}

	
}
