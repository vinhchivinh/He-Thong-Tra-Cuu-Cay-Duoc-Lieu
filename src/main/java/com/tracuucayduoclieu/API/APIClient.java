package com.tracuucayduoclieu.API;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tracuucayduoclieu.Entity.Cayduoclieu;
import com.tracuucayduoclieu.Service.ServiceCayduoclieu;

@RestController
public class APIClient {
	
	@Autowired
	ServiceCayduoclieu cdl ;
	
	@GetMapping("/Tra-Cuu-Cay-Duoc-Lieu-Theo-Ten/{ten}")
	public List<Cayduoclieu> traCuuDuocLieuTheoTen(@PathVariable("ten") String tencay) {
		if(cdl.timKiemTheoTenDuocLieu(tencay).size()==0) {
			List<Cayduoclieu> cayduoclieu =new ArrayList<>();
			Cayduoclieu n =new Cayduoclieu();
			n.setMaduoclieu(0);
			cayduoclieu.add(n);
			return cayduoclieu;
		}
		return cdl.timKiemTheoTenDuocLieu(tencay);
		
	}
}
