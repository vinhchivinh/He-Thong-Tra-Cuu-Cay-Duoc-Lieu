package com.tracuucayduoclieu.controller;
import java.io.IOException;
import java.sql.Timestamp;
/*
 * Không chờ giỏi mới làm làm để giỏi
 * Không chờ biết mới làm làm để biết
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.tracuucayduoclieu.Entity.Baiviet;
import com.tracuucayduoclieu.Entity.Benh;
import com.tracuucayduoclieu.Entity.Cauhoi;
import com.tracuucayduoclieu.Entity.Cayduoclieu;
import com.tracuucayduoclieu.Entity.Chude;
import com.tracuucayduoclieu.Entity.Hinh;
import com.tracuucayduoclieu.Entity.Nguoidung;
import com.tracuucayduoclieu.Repository.RepositoryCayDuocLieu;
import com.tracuucayduoclieu.Service.ServiceBaiViet;
import com.tracuucayduoclieu.Service.ServiceBaocao;
import com.tracuucayduoclieu.Service.ServiceBenh;
import com.tracuucayduoclieu.Service.ServiceCauhoi;
import com.tracuucayduoclieu.Service.ServiceCayduoclieu;
import com.tracuucayduoclieu.Service.ServiceChude;
import com.tracuucayduoclieu.Service.ServiceHinh;
import com.tracuucayduoclieu.Service.ServiceNguoidung;
import com.tracuucayduoclieu.Service.ServiceTraloi;

@Controller

public class ControllerClient {
	
	@Autowired
	private ServiceCayduoclieu cdl;
	
	@Autowired 
	private ServiceNguoidung nd;
	
	@Autowired
	private ServiceCauhoi ch;
	
	@Autowired
	private ServiceTraloi tl;
	
	@Autowired
	private ServiceBenh b;
	
	@Autowired
	private ServiceBaiViet bv;
	
	@Autowired
	private ServiceChude cd;
	
	@Autowired
	private ServiceHinh h;
	
	@Autowired
	private ServiceBaocao bc;
//	@GetMapping("/")
//	public String Baiviet () {
//		return "Client/baiviet";
//	}
//	@GetMapping("/**")
//	public void setNguoidung (Model model) {
//		Nguoidung nguoidung = nd.layThongTinNguoiDungDaXacThuc();
//		model.addAttribute("nguoidung", nguoidung);
//	}
	
	@GetMapping("/TraCuuCayDuocLieu/Chi-Tiet-Cay-Duoc-Lieu")
	public String trangChuChiTiet (@RequestParam(name = "id",defaultValue = "1") int id, Model model) {
		Page<Cayduoclieu> danhsachngaunhien =cdl.taoDanhSachNgauNhien();
		Optional<Cayduoclieu> cayduoclieu= cdl.findById(id);
		if(cayduoclieu.isPresent()) {
			model.addAttribute("cayduoclieu",cayduoclieu.get());
			model.addAttribute("danhsachngaunhien", danhsachngaunhien.getContent());
		}
		else {
			return "index";
		}
		return "ClientStyle/chitietcayduoclieu";
		
	}
	
	@GetMapping("/Trang-Chu")
	public String trangChu(Model model,@RequestParam(name="page",defaultValue = "1") int page) {
		String user = nd.layHoTenNguoiDungDaXacThuc();
		Nguoidung nguoidung = nd.layThongTinNguoiDungDaXacThuc();
		Page<Cayduoclieu> cayduoclieu = cdl.findAll(0,16);
		int count = cayduoclieu.getTotalPages();
		int page_present = page;
		
		model.addAttribute("count", count);
		model.addAttribute("page_present", page_present);
		model.addAttribute("nguoidung", nguoidung);
		model.addAttribute("user",user);
		model.addAttribute("cayduoclieu",cayduoclieu.getContent());
		return "ClientStyle/index";
	}
	
//	@GetMapping("/Trang-Chu/Danh-Sach-Cay-Duoc-Lieu/{page}")
//	public String trangChuDanhSachCayDuocLieu(@PathVariable("page") int page, Model model, @RequestParam(name="timtheobenh",defaultValue ="no") String mabenh,@RequestParam(name="key",defaultValue = "no") String key) {
//		if(mabenh.equals("no") && key.equals("no")) {
//			Page<Cayduoclieu> cayduoclieu = cdl.findAll(page - 1, 15);
//			int page_present = page;
//			int count = cdl.countAll();
//			Nguoidung nguoidung = nd.layThongTinNguoiDungDaXacThuc();
//			
//			model.addAttribute("nguoidung", nguoidung);
//			model.addAttribute("count", count);
//			model.addAttribute("page_present", page_present);
//			model.addAttribute("cayduoclieu", cayduoclieu.getContent());
//		}
//		else if (!mabenh.equals("no")){
//			Page<Cayduoclieu> cayduoclieu = cdl.findByBenh(Integer.parseInt(mabenh), page-1, 15);
//			int page_present = page;
//			int count = cdl.countAll();
//			Nguoidung nguoidung = nd.layThongTinNguoiDungDaXacThuc();
//			
//			model.addAttribute("nguoidung", nguoidung);
//			model.addAttribute("count", count);
//			model.addAttribute("page_present", page_present);
//			model.addAttribute("cayduoclieu", cayduoclieu.getContent());
//			model.addAttribute("mabenh",mabenh);
//		}
//		else if(!key.equals("no")) {
//			Page<Cayduoclieu> cayduoclieu =cdl.findByTenduoclieuOrBenh(key, page-1, 15);
//			int page_present = page;
//			int count = cdl.countAll();
//			Nguoidung nguoidung = nd.layThongTinNguoiDungDaXacThuc();
//			
//			model.addAttribute("nguoidung", nguoidung);
//			model.addAttribute("count", count);
//			model.addAttribute("page_present", page_present);
//			model.addAttribute("cayduoclieu", cayduoclieu.getContent());
//			model.addAttribute("key",key);
//		}
//
//		return "Client/danhsachcayduoclieu";
//	}
	
	//Controller Hoi Dap
	
	
	//Controler Dang Nhap
	//Controller Dang Ki
	@PostMapping("/TraCuuCayDuocLieu/Dang-Ki-Nguoi-Dung")
	public @ResponseBody String dangKiNguoiDung(@RequestParam("sdt") String sdt, @RequestParam("hovaten") String hovaten,@RequestParam("email") String email,@RequestParam("gioitinh") int gioitinh
			,@RequestParam("taikhoan") String taikhoan,@RequestParam("matkhau") String matkhau,@RequestParam("ngaysinh") String ngaysinh) {
	
		if(nd.findByTaiKhoan(sdt).isPresent()) {
			return "Số Điện Thoại Đã Tồn Tại Vui Lòng Chọn Số Khác";
		}
		else if(nd.timTaiKhoan(taikhoan) !=null) {
			return "Vui Lòng Chọn Tên Đăng Nhập Khác";
		}
		else {
			nd.save(sdt, hovaten, email, gioitinh, taikhoan, matkhau, ngaysinh);
		}
		return "Tạo Tài Khoản Thành Công";
	}
	
	@GetMapping("/login")
	public String dangNhap() {
		return "login";
	}
	
	@GetMapping("/Admin/login")
	public String dangNhapAdmin() {
		return "login";
	}
	//Controller Câu Hỏi
	
	
	
	@PostMapping("/TraCuuCayDuocLieu/Post")
	public  RedirectView dangCauHoi(@RequestParam("tieude") String tieude,@RequestParam("noidungcauhoi") String noidungcauhoi, @RequestParam(name="anhdinhkem", defaultValue = "null") MultipartFile hinh ,RedirectAttributes re) {
		if(tieude !="" && noidungcauhoi !="") {
			Cauhoi saved_cauhoi = ch.save(tieude, noidungcauhoi);
			re.addFlashAttribute("result_post","success");
			if( hinh != null ) {
				/*File upload ảnh*/
				String file_name = hinh.getName();
				Hinh hinh1 =new Hinh();
				hinh1.setTenhinh(saved_cauhoi.getMacauhoi()+"."+"png");
				h.save(hinh1);
				
				saved_cauhoi.setHinh(hinh1);
				this.ch.save(saved_cauhoi);
				
				String uploadDir = "src/main/resources/static/ClientStyle/assets/image/HinhCauHoi";
				try {
					ServiceHinh.saveFile1(uploadDir,hinh1.getTenhinh(),hinh);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else {
			re.addFlashAttribute("result_post","error");
		}
		return new RedirectView("/TraCuuCayDuocLieu/Hoi-Dap");
	}
	
	@GetMapping("/TraCuuCayDuocLieu/Hoi-Dap")
	public  String danhSachHoiDap (@RequestParam(name = "page", defaultValue = "1") int page , Model model, @RequestParam(name = "key", defaultValue = "")String tencauhoi ) {
		List<Nguoidung> userlist = new ArrayList<>(); /**/
		Page<Cauhoi> cauhoi = ch.danhSachDaPheDuyet(page - 1, 10);/**/
		int page_present = page;/**/
		int count =cauhoi.getTotalPages();/**/
		long socauhoi = cauhoi.getTotalElements();/**/
		long socautraloi= tl.demSoCauTraLoi();/**/
		List<User> onlineuser = nd.getUsersFromSessionRegistry(); /**/
		for(User u: onlineuser) {/**/
			userlist.add(nd.timTaiKhoan(u.getUsername()));/**/
		}
		Nguoidung nguoidung = nd.layThongTinNguoiDungDaXacThuc();/**/
		
		model.addAttribute("nguoidung", nguoidung);
		if(tencauhoi.equals("") ) {
			model.addAttribute( "cauhoi" , cauhoi.getContent() );
		}
		else {
			List<Cauhoi> cauhoitimkiem = ch.timBoiTenCayDuocLieu(tencauhoi, page_present);
			model.addAttribute("cauhoi",cauhoitimkiem);
		}
		
		model.addAttribute( "userlist" , userlist );
		model.addAttribute( "socauhoi" , socauhoi );
		model.addAttribute( "socautraloi" , socautraloi );
		model.addAttribute( "page_present" , page_present );
		model.addAttribute( "count" , count );
		model.addAttribute("key",tencauhoi);
		
		return "ClientStyle/hoidap";
	}
	
	@GetMapping("/TraCuuCayDuocLieu/Hoi-Dap/forum")
	public String chiTietHoiDap(@RequestParam("id")int id, Model model) {
		Optional<Cauhoi> cauhoi = ch.findById(id);
		Nguoidung nguoidung = nd.layThongTinNguoiDungDaXacThuc();
		
		model.addAttribute("nguoidung", nguoidung);
		model.addAttribute("cauhoi",cauhoi.get());
		
		return "ClientStyle/chitietcauhoi";
	}
	
	@PostMapping("/TraCuuCayDuocLieu/Tra-Loi-Cau-Hoi")
	public RedirectView luuCauTraLoi(@RequestParam("idcauhoi") int id,@RequestParam(name="cautraloi",defaultValue = "") String cautraloi, RedirectAttributes re) {
		if(!cautraloi.equals("") ) {
			Nguoidung nguoidung = nd.layThongTinNguoiDungDaXacThuc();
			int ma =id;
			tl.save(nguoidung,ma, cautraloi);
			re.addFlashAttribute("result_tl","success");
		}
		else {
			re.addFlashAttribute("result_tl","error");
		}
		return new  RedirectView("/TraCuuCayDuocLieu/Hoi-Dap/forum?id="+id);
	}
	
	@PostMapping("/TraCuuCayDuocLieu/Bao-Cao")
	public RedirectView baoCaoCauTraLoi(RedirectAttributes re,@RequestParam("idcautraloi")int idcautraloi,@RequestParam(name = "noidungbaocao", defaultValue = "") String noidungbaocao, @RequestParam("idcauhoi") int idcauhoi ) {
		if(bc.save(idcautraloi, noidungbaocao) !=null) {
			re.addFlashAttribute("result_bc", "success");
		}
		else {
			re.addFlashAttribute("result_bc", "error");
		}
		return new RedirectView("/TraCuuCayDuocLieu/Hoi-Dap/forum?id="+idcauhoi);
	}
	
//	@PostMapping("/TraCuuCayDuocLieu/Tra-Loi")
//	public RedirectView traLoiCauHoi(@RequestParam("noidungcautraloi") String noidungcautraloi, RedirectAttributes re ) {
//		Nguoidung nguoidung = nd.layThongTinNguoiDungDaXacThuc();
//		
//		int ma = Integer.parseInt(id);
//		
//		tl.save(nguoidung,ma, cautraloi);
//		
//		return new  RedirectView("/TraCuuCayDuocLieu/Hoi-Dap/1");
//		
//		return null;
//	}
	
//	@GetMapping("/Test")
//	public @ResponseBody Nguoidung test () {
//		Nguoidung nguoidung =new Nguoidung();
//		nguoidung =nd.layThongTinNguoiDungDaXacThuc();
//		return nguoidung;
//	}
	
	/*
	 * Controller Benh
	 */
	@GetMapping("/TraCuuCayDuocLieu/Danh-Sach-Benh/{page}")
	public String danhSachBenh(Model model, @PathVariable("page") int page) {
		int page_present=page;
		Page<Benh> benh = b.findAll(page-1,15);
		int count = benh.getTotalPages();
		Nguoidung nguoidung = nd.layThongTinNguoiDungDaXacThuc();
		
		model.addAttribute("nguoidung", nguoidung);
		model.addAttribute("benh", benh.getContent());
		model.addAttribute("count",count);
		model.addAttribute("page_present",page_present);

		return "Client/danhsachbenh";
	}
	/*
	 * Controller Baiviet
	 */
	@GetMapping("/TraCuuCayDuocLieu/Them-Bai-Viet")
	public String danhSachBaiViet (Model model) {
		Chude chude =new Chude();
		Baiviet baiviet = new Baiviet();
		List<Chude> danhsachchude = cd.findAll();
		
		model.addAttribute("chude", chude);
		model.addAttribute("baiviet",baiviet);
		model.addAttribute("danhsachchude", danhsachchude);
		return "ClientStyle/dangbaiviet";
	}
	
	@PostMapping("/Admin/Them-Bai-Viet/action")
	public RedirectView themBaiViet (@ModelAttribute("baiviet") Baiviet baiviet, @RequestParam("idchude") String idchude, @RequestParam("hinhdaidien") MultipartFile multi,RedirectAttributes re) {
		Chude chude =new Chude();
		Nguoidung nguoidung =new Nguoidung();
		nguoidung = nd.layThongTinNguoiDungDaXacThuc();
		Timestamp time =new Timestamp(System.currentTimeMillis());
		
		String fileName = StringUtils.cleanPath(multi.getOriginalFilename());
		Hinh hinh = new Hinh();
	    hinh.setTenhinh(fileName);

	    Hinh savedHinh = new Hinh();
	    savedHinh = h.save(hinh);

		savedHinh.setTenhinh(Integer.toString(savedHinh.getMahinh()) + ".png");
		h.save(savedHinh);
	
		String uploadDir = "src/main/resources/static/Admin/assets/img/HinhBaiViet";
		String uploadDir1 = "src/main/resources/static/ClientStyle/assets/image/AnhBaiViet";
		try {
			ServiceBenh.saveFile(uploadDir, Integer.toString(savedHinh.getMahinh()) + ".png", multi);
			ServiceBenh.saveFile(uploadDir1, Integer.toString(savedHinh.getMahinh()) + ".png", multi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		chude.setMachude(Integer.parseInt(idchude));
		baiviet.setSdt(nguoidung);
		baiviet.setThoigiandangbaiviet(time);
		baiviet.setMachude(chude);
		baiviet.setAnhdaidien(savedHinh);
		if (bv.save(baiviet) !=null) {
			re.addFlashAttribute("reuslt_add_post","success");
		}
		else {
			re.addFlashAttribute("reuslt_add_post","error");
		}
		
		return new RedirectView("/TraCuuCayDuocLieu/Them-Bai-Viet");
	}
	
	@GetMapping("/TraCuuCayDuocLieu/Danh-Sach-Bai-Viet")
	public String danhSachBaiViet(@RequestParam(name ="page", defaultValue = "1") int page, Model model) {
		Page<Baiviet> danhsachbaiviet =bv.danhsachbaivietdaduyet(page-1);
		List<Chude> chude =cd.findAll();
		
		int page_present = page;
		int count =danhsachbaiviet.getTotalPages();
		
		model.addAttribute("danhsachbaiviet", danhsachbaiviet.getContent());
		model.addAttribute("count", count);
		model.addAttribute("page_present", page_present);
		model.addAttribute("chude", chude);
		
		return "ClientStyle/danhsachbaiviet";
	}
	
	
	@GetMapping ("/Tra-Cuu-Cay-Duoc-Lieu")
	public String traCuuCayDuocLieu (@RequestParam(name = "page", defaultValue = "1") int Page, @RequestParam(name ="key",defaultValue = "") String key, Model model) {
			
		if(key.equals("")) {
			Page<Cayduoclieu> cayduoclieu = cdl.findAll(Page-1,16);
			int count = cayduoclieu.getTotalPages();
			int page_present = Page;
			
			model.addAttribute("page", Page);
			model.addAttribute("key", key);
			model.addAttribute("count", count);
			model.addAttribute("page_present", page_present);
			model.addAttribute("cayduoclieu", cayduoclieu.getContent());
			return "ClientStyle/tracuucayduoclieu";
		}
		else {
			Page<Cayduoclieu> cayduoclieu =cdl.findByTenduoclieuOrTenbenhOrChucai(key,Page-1);
			int count = cayduoclieu.getTotalPages();
			int page_present = Page;
			
			model.addAttribute("page", Page);
			model.addAttribute("key", key);
			model.addAttribute("count", count);
			model.addAttribute("page_present", page_present);
			model.addAttribute("cayduoclieu", cayduoclieu.getContent());
			return "ClientStyle/tracuucayduoclieu";
		}
	}
	
//	Bài Viết
	@GetMapping("/TraCuuCayDuocLieu/Chi-Tiet-Bai-Viet")
	public String chiTietBaiViet( @RequestParam("id") String id, Model model ) {
		Optional<Baiviet> baiviet =bv.findById(id);
		model.addAttribute("baiviet",baiviet.get());
		return "ClientStyle/chitietbaiviet";
	}
	
}
