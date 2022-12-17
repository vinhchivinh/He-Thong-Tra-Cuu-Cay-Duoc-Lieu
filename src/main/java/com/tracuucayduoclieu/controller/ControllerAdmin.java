package com.tracuucayduoclieu.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.tracuucayduoclieu.Entity.Baiviet;
import com.tracuucayduoclieu.Entity.Benh;
import com.tracuucayduoclieu.Entity.Bophansudung;
import com.tracuucayduoclieu.Entity.Cauhoi;
import com.tracuucayduoclieu.Entity.Cayduoclieu;
import com.tracuucayduoclieu.Entity.Chude;
import com.tracuucayduoclieu.Entity.Congdung;
import com.tracuucayduoclieu.Entity.Hinh;
import com.tracuucayduoclieu.Entity.Hoduoclieu;
import com.tracuucayduoclieu.Entity.Loaitaikhoan;
import com.tracuucayduoclieu.Entity.Nguoidung;
import com.tracuucayduoclieu.Entity.Noiphanbo;
import com.tracuucayduoclieu.Entity.Quykinh;
import com.tracuucayduoclieu.Entity.Tengoikhac;
import com.tracuucayduoclieu.Entity.Thanhphanhoahoc;
import com.tracuucayduoclieu.Entity.Tinhvi;
import com.tracuucayduoclieu.Entity.Traloi;
import com.tracuucayduoclieu.Repository.RepositoryLoaiTaiKhoan;
import com.tracuucayduoclieu.Repository.RepositoryTraloi;
import com.tracuucayduoclieu.Service.ServiceBaiViet;
import com.tracuucayduoclieu.Service.ServiceBenh;
import com.tracuucayduoclieu.Service.ServiceBophansudung;
import com.tracuucayduoclieu.Service.ServiceCauhoi;
import com.tracuucayduoclieu.Service.ServiceCayduoclieu;
import com.tracuucayduoclieu.Service.ServiceChude;
import com.tracuucayduoclieu.Service.ServiceHinh;
import com.tracuucayduoclieu.Service.ServiceHoDuocLieu;
import com.tracuucayduoclieu.Service.ServiceNguoidung;
import com.tracuucayduoclieu.Service.ServiceNoiphanbo;
import com.tracuucayduoclieu.Service.ServiceQuykinh;
import com.tracuucayduoclieu.Service.ServiceTacDung;
import com.tracuucayduoclieu.Service.ServiceTenGoiKhac;
import com.tracuucayduoclieu.Service.ServiceThanhphanhoahoc;
import com.tracuucayduoclieu.Service.ServiceTinhvi;
import com.tracuucayduoclieu.Service.ServiceTraloi;

@Controller
public class ControllerAdmin {

	@Autowired
	private ServiceCayduoclieu cdl;

	@Autowired
	private RepositoryLoaiTaiKhoan rl;

	@Autowired
	private ServiceHoDuocLieu hdl;

	@Autowired
	private ServiceBophansudung bpsd;

	@Autowired
	private ServiceBenh b;

	@Autowired
	private ServiceHinh h;

	@Autowired
	private ServiceTacDung td;

	@Autowired
	private ServiceThanhphanhoahoc tphh;

	@Autowired
	private ServiceQuykinh qk;

	@Autowired
	private ServiceTinhvi tv;

	@Autowired
	private ServiceNoiphanbo npb;
	
	@Autowired
	private ServiceTenGoiKhac tgk;
	
	@Autowired
	private ServiceCauhoi ch;
	
	@Autowired ServiceChude cd;
	
	@Autowired
	private ServiceTraloi tl;
	
	@Autowired
	private ServiceBaiViet bv;
	
	@Autowired
	private ServiceNguoidung nd;
	
	@GetMapping(value = {"/Admin/them-loai-nguoi-dung"})
	public String Themloainguoidung() {
		Loaitaikhoan nd = new Loaitaikhoan();
		nd.setTenloai("Quản Trị Viên");
		if (rl.save(nd) != null) {
			return "index";
		}
		return "error";
	}

	/*
	 * Controller của Bộ Phận Sử Dụng
	 */
	@PostMapping("/Admin/Them-Bo-Phan-Su-Dung")
	public RedirectView themBoPhanSuDung( @RequestParam("tenbophan") String tenbophan, RedirectAttributes re) {
		if(bpsd.themBoPhanSuDung(tenbophan)) {
			re.addFlashAttribute("result","success");
			return new RedirectView("/Admin/Danh-Sach-Bo-Phan-Su-Dung");
		}
		re.addFlashAttribute("result","error");
		return new RedirectView("/Admin/Danh-Sach-Bo-Phan-Su-Dung");
	}
	
	@PostMapping("/Admin/Xoa-Bo-Phan-Su-Dung-Theo-Danh-Sach-Da-Chon")
	public @ResponseBody String xoaBoPhanTheoDanhSachDaChon(@RequestBody String bophan[]) {
		bpsd.deleteSet(bophan);
		return "Xóa Thành Công";
	}
	
	@PostMapping("/Admin/Cap-Nhat-Bo-Phan-Su-Dung")
	public RedirectView capNhatBoPhanSuDung(@RequestParam("id") String id, @RequestParam("ten")String ten, RedirectAttributes re) {
		if(bpsd.edit(Integer.parseInt(id), ten)) {
			re.addFlashAttribute("result_edit","success");
			return new RedirectView("/Admin/Danh-Sach-Bo-Phan-Su-Dung");
		}
		re.addFlashAttribute("result_edit","error");
		return new RedirectView("/Admin/Danh-Sach-Bo-Phan-Su-Dung");
	}
	
	@PostMapping("/Admin/Xoa-Bo-Phan-Su-Dung")
	public @ResponseBody String xoaBoPhan(@RequestBody String bophan) {
		bpsd.deleteID(bophan);
		return "Xóa Thành Công";
	}
	
	@GetMapping("/Admin/Danh-Sach-Bo-Phan-Su-Dung")
	public String Danhsachbophansudung(Model model) {
		List<Bophansudung> bophansudung = bpsd.findAll();
		model.addAttribute("bophansudung", bophansudung);
		return "Admin/bophansudung";
	}

	/*
	 * 
	 */
	@GetMapping("/Admin/Danh-Sach-Benh")
	public String danhSachBenh(Model model) {
		List<Benh> benh = b.findAll();
		model.addAttribute("benh", benh);
		return "Admin/Benh";
	}

	@PostMapping("/Admin/Them-Benh")
	public RedirectView themBenh(@RequestParam("benh") String benh, RedirectAttributes re) {
		if(b.themBenh(benh)) {
			re.addFlashAttribute("result_add","success");
			return new RedirectView("/Admin/Danh-Sach-Benh");
		}
		re.addFlashAttribute("result_add","error");
		return new RedirectView("/Admin/Danh-Sach-Benh");

	}

	@PostMapping("/Admin/Sua-Benh")
	public RedirectView chinhSuaBenh(@RequestParam("id") String id, @RequestParam("ten")String ten, RedirectAttributes re) {

		if(b.edit(Integer.parseInt(id), ten)) {
			re.addFlashAttribute("result_edit","success");
			return new RedirectView("/Admin/Danh-Sach-Benh");
		}
		re.addFlashAttribute("result_edit","error");
		return new RedirectView("/Admin/Danh-Sach-Benh");
	}
	
	@PostMapping("/Admin/Xoa-Benh-Theo-Danh-Sach-Da-Chon")
	public @ResponseBody String  xoaBenhTheoDanhSach(@RequestBody String danhsachbenh[]) {
		b.deleteSet(danhsachbenh);
		return "Xóa Thành Công";
	}

	@PostMapping("/Admin/Xoa-Benh")
	public @ResponseBody String xoaBenh(@RequestBody String benh) {
		b.delete(benh);
		return "Xóa Thành Công";
	}

	/*
	 * Tác Dụng Controller
	 */
	@PostMapping("/Admin/Xoa-Tac-Dung-Theo-Danh-Sach-Da-Chon")
	public @ResponseBody String xoaTacDungTheoDanhSach(@RequestBody String danhsachtacdung[]) {
		td.deleteSet(danhsachtacdung);
		return "Xóa Thành Công";
	}

	@PostMapping("/Admin/Xoa-Tac-Dung")
	public @ResponseBody String xoaTacDung(@RequestBody String tacdung) {
		td.delete(tacdung);
		return "Xóa Thành Công";
	}
	
	@GetMapping("/Admin/Danh-Sach-Tac-Dung")
	public String danhSachTacDung(Model model) {
		List<Congdung> tacdung = td.findAll();
		model.addAttribute("tacdung", tacdung);
		return "Admin/congdung";
	}

	@PostMapping("/Admin/Them-Tac-Dung")
	public RedirectView themTacDung(@RequestParam("congdung") String tentacdung,RedirectAttributes re) {
		if(td.themCongdung(tentacdung)) {
			re.addFlashAttribute("result_add", "success");
			return new RedirectView("/Admin/Danh-Sach-Tac-Dung");
		}
		re.addFlashAttribute("result_add", "error");
		return new RedirectView("/Admin/Danh-Sach-Tac-Dung");
	}

	@PostMapping("/Admin/Sua-Tac-Dung")
	public RedirectView chinhSuaTacDung(@RequestParam("id") String id,@RequestParam("ten") String ten,RedirectAttributes re) {
		if(td.edit(Integer.parseInt(id), ten)) {
			re.addFlashAttribute("result_edit", "success");
			return new RedirectView("/Admin/Danh-Sach-Tac-Dung");
		}
		re.addFlashAttribute("result_edit", "error");
		return new RedirectView("/Admin/Danh-Sach-Tac-Dung");
	}

	@GetMapping("/Admin/Danh-Sach-Tac-Dung/Tim-Kiem")
	public String timKiemTacDungTheoMaVaTen(@RequestParam("key") String key, Model model) {
		List<Congdung> tacdung = td.timKiemTheoKiTu(key);
		model.addAttribute("tacdung", tacdung);
		model.addAttribute("page_present", 1);
		int count = td.countAll();
		model.addAttribute("count", count);
		return "Admin/congdung";
	}
	/*
	* 
	*/

	/*
	 * Thành Phần Hóa Học Controller
	 */
	@PostMapping("/Admin/Xoa-Thanh-Phan-Hoa-Hoc-Theo-Danh-Sach-Da-Chon")
	public @ResponseBody String xoaTacThanhPhanHoaHocTheoDanhSach(@RequestBody String danhsachthanhphanhoahoc[]) {
		tphh.deleteSet(danhsachthanhphanhoahoc);
		return "Xóa Thành Công";
	}

	@PostMapping("/Admin/Xoa-Thanh-Phan-Hoa-Hoc")
	public @ResponseBody String xoaThanhPhanHoaHoc(@RequestBody String thanhphanhoahoc) {
		tphh.delete(thanhphanhoahoc);
		return "Xóa Thành Công";
	}
	
	@GetMapping("/Admin/Danh-Sach-Thanh-Phan-Hoa-Hoc")
	public String danhSachThanhPhanHoaDoc(Model model) {
		List<Thanhphanhoahoc> thanhphanhoahoc = tphh.findAll();
		model.addAttribute("thanhphanhoahoc", thanhphanhoahoc);
		return "Admin/thanhphanhoahoc";
	}

	@PostMapping("/Admin/Them-Thanh-Phan-Hoa-Hoc")
	public RedirectView themThanhPhanHoaHoc(@RequestParam("tenthanhphan") String tenthanhphan,RedirectAttributes re) {
		if( tphh.themThanhPhanHoaHoc(tenthanhphan)) {
			re.addFlashAttribute("result_add", "success");
			return new RedirectView("/Admin/Danh-Sach-Thanh-Phan-Hoa-Hoc");
		}
		re.addFlashAttribute("result_add", "error");
		return new RedirectView("/Admin/Danh-Sach-Thanh-Phan-Hoa-Hoc");
	}

	@PostMapping("/Admin/Sua-Thanh-Phan-Hoa-Hoc")
	public RedirectView chinhSuaThanh(@RequestParam("id") String id, @RequestParam("ten")String ten, RedirectAttributes re) {
		if(tphh.edit(Integer.parseInt(id), ten)) {
			re.addFlashAttribute("result_edit","success");
			return new RedirectView("/Admin/Danh-Sach-Thanh-Phan-Hoa-Hoc");
		}
		re.addFlashAttribute("result_edit","error");
		return new RedirectView("/Admin/Danh-Sach-Thanh-Phan-Hoa-Hoc");
	}

	@GetMapping("/Admin/Danh-Sach-Thanh-Phan-Hoa-Hoc/Tim-Kiem")
	public String timKiemThanhPhanTheoMaVaTen(@RequestParam("key") String key, Model model) {
		List<Thanhphanhoahoc> thanhphanhoahoc = tphh.timKiemTheoKiTu(key);
		model.addAttribute("thanhphanhoahoc", thanhphanhoahoc);
		model.addAttribute("page_present", 1);
		int count = td.countAll();
		model.addAttribute("count", count);
		return "Admin/thanhphanhoahoc";
	}
	/*
	* 
	*/

	/*
	* 
	*/

	/*
	 * Tinh Vi Controller
	 */
	@GetMapping("/Admin/Danh-Sach-Tinh-Vi")
	public String danhSachTinhVi(Model model) {
		List<Tinhvi> tinhvi = tv.findAll();
		model.addAttribute("tinhvi", tinhvi);
		return "Admin/tinhvi";
	}

	@PostMapping("/Admin/Them-Tinh-Vi")
	public RedirectView themTinhVi(@RequestParam("tinhvi") String tentinhvi, RedirectAttributes re) {
		if( tv.themTinhvi(tentinhvi)) {
			re.addFlashAttribute("result_add", "success");
			return new RedirectView("/Admin/Danh-Sach-Tinh-Vi");
		}
		re.addFlashAttribute("result_add", "error");
		return new RedirectView("/Admin/Danh-Sach-Tinh-Vi");
	}

	@PostMapping("/Admin/Sua-Tinh-Vi")
	public RedirectView chinhTinhVi(@RequestParam("id") String id, @RequestParam("ten")String ten, RedirectAttributes re) {
		if(tv.edit(Integer.parseInt(id), ten)) {
			re.addFlashAttribute("result_edit","success");
			return new RedirectView("/Admin/Danh-Sach-Tinh-Vi");
		}
		re.addFlashAttribute("result_edit","error");
		return new RedirectView("/Admin/Danh-Sach-Tinh-Vi");
	}

	@GetMapping("/Admin/Danh-Sach-Tinh-Vi/Tim-Kiem")
	public String timKiemTinhViTheoMaVaTen(@RequestParam("key") String key, Model model) {
		List<Tinhvi> tinhvi = tv.timKiemTheoKiTu(key);
		model.addAttribute("tinhvi", tinhvi);
		model.addAttribute("page_present", 1);
		int count = tv.countAll();
		model.addAttribute("count", count);
		return "Admin/tinhvi";
	}
	
	@PostMapping("/Admin/Xoa-Tinh-Vi-Theo-Danh-Sach-Da-Chon")
	public @ResponseBody String xoaTinhViTheoDanhSach(@RequestBody String danhsachtinhvi[]) {
		tv.deleteSet(danhsachtinhvi);
		return "Xóa Thành Công";
	}

	@PostMapping("/Admin/Xoa-Tinh-Vi")
	public @ResponseBody String xoaTinhVi(@RequestBody String tinhvi) {
		tv.delete(tinhvi);
		return "Xóa Thành Công";
	}
	/*
	* 
	*/

	/*
	 * Noi Phan Bo Controller
	 */
	@GetMapping("/Admin/Danh-Sach-Noi-Phan-Bo")
	public String danhSachNoiPhanBo(Model model) {
		List<Noiphanbo> noiphanbo = npb.findAll();
		model.addAttribute("noiphanbo", noiphanbo);
		return "Admin/noiphanbo";
	}

	@PostMapping("/Admin/Them-Noi-Phan-Bo")
	public RedirectView themNoiPhanBo(@RequestParam("noiphanbo") String tennoiphanbo, RedirectAttributes re) {
		if(npb.themNoiphanbo(tennoiphanbo)) {
			re.addFlashAttribute("result_add","success");
			return new RedirectView("/Admin/Danh-Sach-Noi-Phan-Bo");
		}
		re.addFlashAttribute("result_add","error");
		return new RedirectView("/Admin/Danh-Sach-Noi-Phan-Bo");
	}

	@PostMapping("/Admin/Sua-Noi-Phan-Bo")
	public RedirectView chinhNoiPhanBo(@RequestParam("id") String id, @RequestParam("ten") String noiphanbo, RedirectAttributes re ) {
		if(npb.edit(Integer.parseInt(id), noiphanbo)) {
			re.addFlashAttribute("result_edit","success");
			return new RedirectView("/Admin/Danh-Sach-Noi-Phan-Bo");
		}
		re.addFlashAttribute("result_edit","error");
		return new RedirectView("/Admin/Danh-Sach-Noi-Phan-Bo");
	}

	@PostMapping("/Admin/Xoa-Noi-Phan-Bo-Theo-Danh-Sach-Da-Chon")
	public @ResponseBody String xoaNoiPhanBoTheoDanhSach(@RequestBody String danhsachnoiphanbo[]) {
		npb.deleteSet(danhsachnoiphanbo);
		return "Xóa Thành Công";
	}

	@GetMapping("/Admin/Xoa-Noi-Phan-Bo")
	public @ResponseBody String xoaNoiPhanBo(@RequestBody String noiphanbo) {
		npb.delete(noiphanbo);
		return "Xóa Thành Công";
	}
	
	@GetMapping("/Admin/Danh-Sach-Noi-Phan-Bo/Tim-Kiem")
	public String timKiemNoiPhanBoTheoMaVaTen(@RequestParam("key") String key, Model model) {
		List<Noiphanbo> noiphanbo = npb.timKiemTheoKiTu(key);
		model.addAttribute("noiphanbo", noiphanbo);
		model.addAttribute("page_present", 1);
		int count = npb.countAll();
		model.addAttribute("count", count);
		return "Admin/noiphanbo";
	}
	/*
	* 
	*/
	/*
	 * Họ dược liệu Controller
	 */
	@PostMapping("/Admin/Xoa-Ho-Duoc-Lieu-Theo-Danh-Sach-Da-Chon")
	public @ResponseBody String xoaHoDuocLieuTheoDanhSach(@RequestBody String danhsachhoduoclieu[]) {
		hdl.deleteSet(danhsachhoduoclieu);
		return "Xóa Thành Công";
	}

	@PostMapping("/Admin/Xoa-Ho-Duoc-Lieu")
	public @ResponseBody String xoaHoDuocLieu(@RequestBody String hoduoclieu) {
		hdl.delete(hoduoclieu);
		return "Xóa Thành Công";
	}
	
	@GetMapping("/Admin/Danh-Sach-Ho-Duoc-Lieu")
	public String danhSachHoDuocLieu(Model model) {
		List<Hoduoclieu> hoduoclieu = hdl.findAll();
		model.addAttribute("hoduoclieu", hoduoclieu);
		return "Admin/hoduoclieu";
	}

	@PostMapping("/Admin/Them-Ho-Duoc-Lieu")
	public RedirectView themHoDuocLieu(@RequestParam("tenhoduoclieu") String tenhoduoclieu, RedirectAttributes re) {
		if(hdl.themTenHoDuocLieu(tenhoduoclieu)) {
			re.addFlashAttribute("result_add","success");
			return new RedirectView("/Admin/Danh-Sach-Ho-Duoc-Lieu");
		}
		re.addFlashAttribute("result_add","error");
		return new RedirectView("/Admin/Danh-Sach-Ho-Duoc-Lieu");
	}

	@PostMapping("/Admin/Sua-Ho-Duoc-Lieu")
	public RedirectView chinhSuaHoDuocLieu(@RequestParam("id") String id ,@RequestParam("ten") String tenhoduoclieu, RedirectAttributes re) {
	    if(hdl.edit(Integer.parseInt(id), tenhoduoclieu)) {
	    	re.addFlashAttribute("result_edit","success");
	    	return new RedirectView("/Admin/Danh-Sach-Ho-Duoc-Lieu");
	    }
	    re.addFlashAttribute("result_edit","error");
		return new RedirectView("/Admin/Danh-Sach-Ho-Duoc-Lieu");
	}

	@GetMapping("/Admin/Danh-Sach-Ho-Duoc-Lieu/Tim-Kiem")
	public String timKiemHoDuocLieuTheoMaVaTen(@RequestParam("key") String key, Model model) {
		List<Hoduoclieu> hoduoclieu = hdl.timKiemTheoKiTu(key);
		model.addAttribute("hoduoclieu", hoduoclieu);
		model.addAttribute("page_present", 1);
		int count = hdl.countAll();
		model.addAttribute("count", count);
		return "Admin/hoduoclieu";
	}

	/*
	 * Tên Gọi Khác Controller
	 */

	@GetMapping("/Admin/Danh-Sach-Ten-Goi-Khac")
	public String danhSachTenGoiKhac(Model model) {
		List<Tengoikhac> tengoikhac = tgk.findAll();
		model.addAttribute("tengoikhac", tengoikhac);
		return "Admin/tengoikhac";
	}

	@PostMapping("/Admin/Them-Ten-Goi-Khac")
	public RedirectView themTenGoiKhac(@RequestParam("tengoikhac") String tentengoikhac, RedirectAttributes re) {
		if(tgk.themTenGoiKhac(tentengoikhac)) {
			re.addFlashAttribute("result_add","success");
			return new RedirectView("/Admin/Danh-Sach-Ten-Goi-Khac");
		}
		re.addFlashAttribute("result_add","error");
		return new RedirectView("/Admin/Danh-Sach-Ten-Goi-Khac");
	}

	@PostMapping("/Admin/Sua-Ten-Goi-Khac")
	public RedirectView chinhSuaTenGoiKhac(@RequestParam("id") String id, @RequestParam("ten")String ten, RedirectAttributes re) {
		if(tgk.edit(Integer.parseInt(id), ten)) {
			re.addFlashAttribute("result_edit","success");
			return new RedirectView("/Admin/Danh-Sach-Ten-Goi-Khac");
		}
		re.addFlashAttribute("result_edit","error");
		return new RedirectView("/Admin/Danh-Sach-Thanh-Phan-Hoa-Hoc");
	}

	@GetMapping("/Admin/Danh-Sach-Ten-Goi-Khac/Tim-Kiem")
	public String timKiemTenGoiKhacTheoMaVaTen(@RequestParam("key") String key, Model model) {
		List<Tengoikhac> tengoikhac = tgk.timKiemTheoKiTu(key);
		model.addAttribute("tengoikhac", tengoikhac);
		model.addAttribute("page_present", 1);
		int count = tgk.countAll();
		model.addAttribute("count", count);
		return "Admin/tengoikhac";
	}
	
	@PostMapping("/Admin/Xoa-Ten-Goi-Khac-Theo-Danh-Sach-Da-Chon")
	public @ResponseBody String xoaTenGoiKhacTheoDanhSach(@RequestBody String danhsachtengoikhac[]) {
		tgk.deleteSet(danhsachtengoikhac);
		return "Xóa Thành Công";
	}
	
	@PostMapping("/Admin/Xoa-Ten-Goi-Khac")
	public @ResponseBody String xoaTengoikhac(@RequestBody String duoclieu) {
		tgk.delete(duoclieu);
		return "Xóa Thành Công";
	}

//	Controller Quy Kinh
	@GetMapping("/Admin/Danh-Sach-Quy-Kinh")
	public String danhSachQuyKinh(Model model) {
		List<Quykinh> quykinh = qk.findAll();
		model.addAttribute("quykinh", quykinh);
		return "Admin/quykinh";
	}

	@PostMapping("/Admin/Them-Quy-Kinh")
	public RedirectView themQuyKinh(@RequestParam("quykinh") String quykinh, RedirectAttributes re) {
		if(qk.themQuykinh(quykinh)) {
			re.addFlashAttribute("result_add","success");
			return new RedirectView("/Admin/Danh-Sach-Quy-Kinh");
		}
		re.addFlashAttribute("result_add","error");
		return new RedirectView("/Admin/Danh-Sach-Quy-Kinh");
	}

	@PostMapping("/Admin/Sua-Quy-Kinh")
	public RedirectView chinhQuyKinh(@RequestParam("id") String id, @RequestParam("ten")String ten, RedirectAttributes re) {
		if(qk.edit(Integer.parseInt(id), ten)) {
			re.addFlashAttribute("result_edit","success");
			return new RedirectView("/Admin/Danh-Sach-Quy-Kinh");
		}
		re.addFlashAttribute("result_edit","error");
		return new RedirectView("/Admin/Danh-Sach-Quy-Kinh");
	}

	@GetMapping("/Admin/Danh-Sach-Quy-Kinh/Tim-Kiem")
	public String timKiemQuyKinhTheoMaVaTen(@RequestParam("key") String key, Model model) {
		List<Quykinh> quykinh = qk.timKiemTheoKiTu(key);
		model.addAttribute("quykinh", quykinh);
		model.addAttribute("page_present", 1);
		int count = qk.countAll();
		model.addAttribute("count", count);
		return "Admin/quykinh";
	}
	
	@PostMapping("/Admin/Xoa-Quy-Kinh-Theo-Danh-Sach-Da-Chon")
	public @ResponseBody String xoaQuyKinhTheoDanhSach(@RequestBody String danhsachthanhphanhoahoc[]) {
		qk.deleteSet(danhsachthanhphanhoahoc);
		return "Xóa Thành Công";
	}

	@PostMapping("/Admin/Xoa-Quy-Kinh")
	public @ResponseBody String xoaQuyKinh(@RequestBody String quykinh) {
		qk.delete(quykinh);
		return "Xóa Thành Công";
	}

	/*
	 * Controller Cây Dược Liệu
	 */
	@PostMapping("/Admin/Xoa-Duoc-Lieu-Theo-Danh-Sach-Da-Chon")
	public @ResponseBody String xoaDuocLieuTheoDanhSach(@RequestBody String danhsachduoclieu[]) {
		cdl.deleteSet(danhsachduoclieu);
		return "Xóa Thành Công";
	}

	@PostMapping("/Admin/Xoa-Duoc-Lieu")
	public @ResponseBody String xoaDuocLieu(@RequestBody String duoclieu) {
		cdl.delete(duoclieu);
		return "Xóa Thành Công";
	}
	
	@PostMapping("/Admin/Danh-Sach-Cay-Duoc-Lieu/Cay-Duoc-Lieu/Them")
	public RedirectView themCayDuocLieu(@RequestParam("tencayduoclieu") String tencayduoclieu,
			@RequestParam("tenkhoahoc") String tenkhoahoc, @RequestParam("img-1") MultipartFile multipartFile1,
			@RequestParam("img-2") MultipartFile multipartFile2, @RequestParam("img-3") MultipartFile multipartFile3,
			@RequestParam("bophansudung") String bophansudung[], @RequestParam("chutri") String chutri[],
			@RequestParam("thanhphanhoahoc") String thanhphanhoahoc[], @RequestParam("tengoikhac") String tengoikhac[],
			@RequestParam("congdung") String congdung[], @RequestParam("hoduoclieu") String hoduoclieu,
			@RequestParam("tinhvi") String tinhvi[], @RequestParam("quykinh") String quykinh[],
			@RequestParam("noiphanbo") String noiphanbo[], @RequestParam("mota") String motacay,
			@RequestParam("tacdungduocly") String tacdungduocly,
			@RequestParam("lieudungcachdung") String lieudungcachdung, @RequestParam("luuy") String luuy,
			@RequestParam("mota") String mota,RedirectAttributes redirectattributes) {

		if(cdl.timBoiTenDuocLieu(tencayduoclieu)) {
			redirectattributes.addFlashAttribute("result","error");
			return new RedirectView("/Admin/Danh-Sach-Cay-Duoc-Lieu/Cay-Duoc-Lieu");
		}
		else {
			Cayduoclieu savedcayduoclieu = cdl.save(tencayduoclieu, tenkhoahoc, mota, tengoikhac, bophansudung, chutri,
					hoduoclieu, tinhvi, quykinh, noiphanbo, congdung, thanhphanhoahoc, tacdungduocly, lieudungcachdung,
					luuy, multipartFile1, multipartFile2, multipartFile3);

			String uploadDir = "src/main/resources/static/Admin/assets/img/AnhCayDuocLieu";
			String uploadDir1 = "src/main/resources/static/ClientStyle/assets/img/AnhCayDuocLieu";

			String namefile1 = ServiceHinh.saveImageToDir(savedcayduoclieu, 1, multipartFile1, uploadDir);
			String namefile2 = ServiceHinh.saveImageToDir(savedcayduoclieu, 2, multipartFile2, uploadDir);
			String namefile3 = ServiceHinh.saveImageToDir(savedcayduoclieu, 3, multipartFile3, uploadDir);
			
			String namefile4 = ServiceHinh.saveImageToDir(savedcayduoclieu, 1, multipartFile1, uploadDir1);
			String namefile5 = ServiceHinh.saveImageToDir(savedcayduoclieu, 2, multipartFile2, uploadDir1);
			String namefile6 = ServiceHinh.saveImageToDir(savedcayduoclieu, 3, multipartFile3, uploadDir1);

			Hinh h1 = new Hinh();
			Hinh h2 = new Hinh();
			Hinh h3 = new Hinh();

			h1.setTenhinh(namefile1);
			h1.setMaduoclieu(savedcayduoclieu);
			h.save(h1);

			h2.setTenhinh(namefile2);
			h2.setMaduoclieu(savedcayduoclieu);
			h.save(h2);

			h3.setTenhinh(namefile3);
			h3.setMaduoclieu(savedcayduoclieu);
			h.save(h3);
			redirectattributes.addFlashAttribute("result","succses");
			return new RedirectView("/Admin/Danh-Sach-Cay-Duoc-Lieu/Cay-Duoc-Lieu");
		}
	}

	@GetMapping("/Admin/Danh-Sach-Cay-Duoc-Lieu/Cay-Duoc-Lieu")
	public String themCayDuocLieu(Model model) {

		List<Bophansudung> bophansudung = bpsd.findAll();
		model.addAttribute("bophansudung", bophansudung);

		List<Benh> benh = b.findAll();
		model.addAttribute("benh", benh);

		List<Thanhphanhoahoc> thanhphanhoahoc = tphh.findAll();
		model.addAttribute("thanhphanhoahoc", thanhphanhoahoc);

		List<Tengoikhac> tengoikhac = tgk.findAll();
		model.addAttribute("tengoikhac", tengoikhac);

		List<Congdung> congdung = td.findAll();
		model.addAttribute("congdung", congdung);

		List<Hoduoclieu> hoduoclieu = hdl.findAll();
		model.addAttribute("hoduoclieu", hoduoclieu);

		List<Tinhvi> tinhvi = tv.findAll();
		model.addAttribute("tinhvi", tinhvi);

		List<Quykinh> quykinh = qk.findAll();
		model.addAttribute("quykinh", quykinh);

		List<Noiphanbo> noiphanbo = npb.findAll();
		model.addAttribute("noiphanbo", noiphanbo);
		
		String title ="Thêm Cây Dược Liệu";
		model.addAttribute("title", title);
		
//		model.addAttribute("result","no");
		
		return "Admin/themcayduoclieu";
	}

	@GetMapping(value = {"/Admin/Danh-Sach-Cay-Duoc-Lieu","/Admin/*"})
	public String danhSachCayDuocLieu(Model model) {
		List<Cayduoclieu> cayduoclieu = cdl.findAll();
		model.addAttribute("cayduoclieu", cayduoclieu);
		return "Admin/danhsachcayduoclieu";
	}

	@GetMapping("/Admin/Danh-Sach-Cay-Duoc-Lieu/Chi-Tiet-Cay-Duoc-Lieu")
	public String xemChiTietCayDuocLieu(Model model, @RequestParam(name = "edit", defaultValue = "off") String edit,@RequestParam("id") String id) {
		List<Bophansudung> bophansudung = bpsd.findAll();
		List<Benh> benh = b.findAll();
		List<Thanhphanhoahoc> thanhphanhoahoc = tphh.findAll();
		List<Tengoikhac> tengoikhac = tgk.findAll();
		List<Hoduoclieu> hoduoclieu = hdl.findAll();
		List<Congdung> congdung = td.findAll();
		List<Quykinh> quykinh = qk.findAll();
		List<Tinhvi> tinhvi = tv.findAll();
		List<Noiphanbo> noiphanbo = npb.findAll();

		Optional<Cayduoclieu> cayduoclieu = cdl.findById(Integer.parseInt(id));

		if (cayduoclieu.isPresent()) {

			model.addAttribute("cayduoclieu", cayduoclieu.get());
			model.addAttribute("benh", benh);
			model.addAttribute("bophansudung", bophansudung);
			model.addAttribute("thanhphanhoahoc", thanhphanhoahoc);
			model.addAttribute("tengoikhac", tengoikhac);
			model.addAttribute("hoduoclieu", hoduoclieu);
			model.addAttribute("congdung", congdung);
			model.addAttribute("quykinh", quykinh);
			model.addAttribute("tinhvi", tinhvi);
			model.addAttribute("noiphanbo", noiphanbo);
			model.addAttribute("edit",edit);

			return "Admin/suacayduoclieu";
		} else {
			return "index";
		}
	}
	
	
	@PostMapping("/Admin/Sua-Cay-Duoc-Lieu")
	public RedirectView suaCayDuocLieu (@RequestParam("maduoclieu") String ma ,@RequestParam("tencayduoclieu") String tencayduoclieu,
			@RequestParam("tenkhoahoc") String tenkhoahoc, @RequestParam("img-1") MultipartFile multipartFile1,
			@RequestParam("img-2") MultipartFile multipartFile2, @RequestParam("img-3") MultipartFile multipartFile3,
			@RequestParam("bophansudung") String bophansudung[], @RequestParam("chutri") String chutri[],
			@RequestParam("chutri") String thanhphanhoahoc[], @RequestParam("tengoikhac") String tengoikhac[],
			@RequestParam("congdung") String congdung[], @RequestParam("hoduoclieu") String hoduoclieu,
			@RequestParam("tinhvi") String tinhvi[], @RequestParam("quykinh") String quykinh[],
			@RequestParam("noiphanbo") String noiphanbo[], @RequestParam("mota") String motacay,
			@RequestParam("tacdungduocly") String tacdungduocly,
			@RequestParam("lieudungcachdung") String lieudungcachdung, @RequestParam("luuy") String luuy,
			@RequestParam("mota") String mota,RedirectAttributes redirectattributes ) {
		
		Cayduoclieu updatecayduoclieu = cdl.save(Integer.parseInt(ma),tencayduoclieu, tenkhoahoc, mota, tengoikhac, bophansudung, chutri,
				hoduoclieu, tinhvi, quykinh, noiphanbo, congdung, thanhphanhoahoc, tacdungduocly, lieudungcachdung,
				luuy, multipartFile1, multipartFile2, multipartFile3);
		String uploadDir = "src/main/resources/static/Admin/assets/img/AnhCayDuocLieu";
		String uploadDir1 = "src/main/resources/static/ClientStyle/assets/img/AnhCayDuocLieu";
		
		String namefile1 = ServiceHinh.saveImageToDir(updatecayduoclieu, 1, multipartFile1, uploadDir);
		String namefile2 = ServiceHinh.saveImageToDir(updatecayduoclieu, 2, multipartFile2, uploadDir);
		String namefile3 = ServiceHinh.saveImageToDir(updatecayduoclieu, 3, multipartFile3, uploadDir);
		
		String namefile4 = ServiceHinh.saveImageToDir(updatecayduoclieu, 1, multipartFile1, uploadDir1);
		String namefile5 = ServiceHinh.saveImageToDir(updatecayduoclieu, 2, multipartFile2, uploadDir1);
		String namefile6 = ServiceHinh.saveImageToDir(updatecayduoclieu, 3, multipartFile3, uploadDir1);
		
		redirectattributes.addFlashAttribute("result","success");
		
		return new RedirectView("/Admin/Danh-Sach-Cay-Duoc-Lieu/Chi-Tiet-Cay-Duoc-Lieu?id="+ma);
	}
	
	@PostMapping("Admin/Xoa-Cay-Duoc-Lieu")
	public @ResponseBody String xoaCayduoclieu(@RequestBody String ma ) {
		cdl.delete(ma);
		return "success";
	}
	
	/*
	* Controller Hoi Dap
	*/
	
	
	@GetMapping("/Admin/Chi-Tiet-Cau-Hoi")
	public @ResponseBody Cauhoi chiTietCauHoi (@RequestParam("id") String id) {
		if(ch.findById(id).isPresent()) {
			return ch.findById(id).get();
		}
		return null;
	}
	
	@GetMapping("/Admin/Danh-Sach-Hoi-Dap/{page}")
	public String hoiDap(@PathVariable(name="page",required = false) int page,Model model,@RequestParam(name="key",defaultValue = "") String key,@RequestParam(name="trangthai",defaultValue ="2") int trangthai) {
		
		Page<Cauhoi> cauhoi = ch.danhSachDaPheDuyet(page-1,16);
		long count = cauhoi.getTotalPages();
		int page_present =page;
		
		model.addAttribute("key",key);
		model.addAttribute("trangthai",trangthai);
		model.addAttribute("count",count);
		model.addAttribute("page_present",page_present);
		model.addAttribute("cauhoi",cauhoi);
		return "Admin/hoidap";
	}
	
	@PostMapping("/Admin/Xoa-Cau-Hoi")
	public @ResponseBody String xoaCauHoi( @RequestBody String ma) {
		ch.delete(ma);
		return "Xóa Thành Công";
	}
	
	@PostMapping("/Admin/Duyet-Cau-Hoi")
	public @ResponseBody String duyetCauHoi(@RequestBody String ma) {
		ch.duyetCauHoi(Integer.parseInt(ma));
		return "Câu Hỏi Đã Duyệt";
	}
	
	@GetMapping("/Admin/Danh-Sach-Cau-Hoi-Cho-Duyet")
	public String danhSachCauHoiChoDuyet(Model model){
		model.addAttribute("cauhoi",ch.danhSachChoPheDuyet());
		return "Admin/danhsachcauhoichoduyet";
	}
	
	@PostMapping("/Admin/Xoa-Tat-Ca-Cau-Hoi-Da-Chon")
	public @ResponseBody String xoaTatCaCauHoiDaChon (@RequestBody String[] ma) {
		ch.deteteSet(ma);
		return "Xóa Thành Công";
	}
	
	@GetMapping("/Admin/Xem-Nhanh-Cau-Hoi")
	public String xemNhanhHoiDap(@RequestParam("id")String id, Model model) {
		Optional<Cauhoi> cauhoi = ch.findById(id);
		model.addAttribute("cauhoi",cauhoi.get());
		return "Admin/xemnhanhhoidap";
	}
	
	@PostMapping("/Admin/Tra-Loi-Cau-Hoi/{id}")
	public RedirectView traLoiCauHoi(@RequestParam("traloi") String cautraloi, @PathVariable("id") String id) {
		Cauhoi cauhoi = new Cauhoi();
		Traloi traloi = new Traloi();
		cauhoi.setMacauhoi(Integer.parseInt(id));
		cauhoi.setTrangthai(true);
		traloi.setMacauhoi(cauhoi);
		traloi.setNoidungcautraloi(cautraloi);
		tl.save(traloi);
		
		return new RedirectView("/Admin/Xem-Nhanh-Cau-Hoi?id="+id);
	}
	/*
	 * Controller Bài Viết
	 */
	/*
	 * @GetMapping("/Admin/Them-Bai-Viet") public String danhSachBaiViet (Model
	 * model) { Chude chude =new Chude(); Baiviet baiviet = new Baiviet();
	 * List<Chude> danhsachchude = cd.findAll();
	 * 
	 * model.addAttribute("chude", chude); model.addAttribute("baiviet",baiviet);
	 * model.addAttribute("danhsachchude", danhsachchude); return
	 * "Admin/thembaiviet"; }
	 */
	
//	@PostMapping("/Admin/Them-Bai-Viet/action")
//	public RedirectView themBaiViet (@ModelAttribute("baiviet") Baiviet baiviet, @RequestParam("idchude") String idchude, @RequestParam("hinhdaidien") MultipartFile multi) {
//		Chude chude =new Chude();
//		Nguoidung nguoidung =new Nguoidung();
//		nguoidung = nd.layThongTinNguoiDungDaXacThuc();
//		Timestamp time =new Timestamp(System.currentTimeMillis());
//		
//		String fileName = StringUtils.cleanPath(multi.getOriginalFilename());
//		Hinh hinh = new Hinh();
//	    hinh.setTenhinh(fileName);
//
//	    Hinh savedHinh = new Hinh();
//	    savedHinh = h.save(hinh);
//
//		savedHinh.setTenhinh(Integer.toString(savedHinh.getMahinh()) + ".png");
//		h.save(savedHinh);
//	
//		String uploadDir = "src/main/resources/static/Admin/assets/img";
//		String uploadDir1 = "src/main/resources/static/ClientStyle/assets/image/AnhBaiViet";
//		try {
//			ServiceBenh.saveFile(uploadDir, Integer.toString(savedHinh.getMahinh()) + ".png", multi);
//			ServiceBenh.saveFile(uploadDir1, Integer.toString(savedHinh.getMahinh()) + ".png", multi);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		chude.setMachude(Integer.parseInt(idchude));
//		baiviet.setSdt(nguoidung);
//		baiviet.setThoigiandangbaiviet(time);
//		baiviet.setMachude(chude);
//		baiviet.setAnhdaidien(savedHinh);
//		bv.save(baiviet);
//		
//		return new RedirectView("/Admin/Them-Bai-Viet");
//	}
//	
	@GetMapping("/Admin/Danh-Sach-Bai-Viet-Cho-Phe-Duyet")
	public String danhSachBaiVietChoPheDuyet (Model model) {
		List<Baiviet> baiviet = bv.baiVietChoPheDuyet();
		model.addAttribute("baiviet", baiviet);
		return "Admin/danhsachbaivietchopheduyet";
	}
	
	
	@PostMapping("Admin/Them-Chu-De")
	public RedirectView themChuDe(@ModelAttribute("chude") Chude chude) {
		cd.save(chude);
		return new RedirectView("/Admin/Them-Bai-Viet");
	}
	
	@GetMapping("/Admin/Danh-Sach-Bai-Viet/{page}")
	public String danhSachBaiViet(Model model, @PathVariable("page") int page,@RequestParam(name = "key",defaultValue ="") String key) {
		if(!key.equals("")) {
			Page<Baiviet> danhsachbaiviet = bv.search(key,page-1,10);
			int page_present = page;
			int count =danhsachbaiviet.getTotalPages();
			model.addAttribute("page_present",page_present);
			model.addAttribute("danhsachbaiviet", danhsachbaiviet);
			model.addAttribute("count",count);
		}
		else {
			Page<Baiviet> danhsachbaiviet = bv.findAll(page-1,10);
			int page_present = page;
			int count =danhsachbaiviet.getTotalPages();
			
			model.addAttribute("page_present",page_present);
			model.addAttribute("danhsachbaiviet", danhsachbaiviet);
			model.addAttribute("count",count);
		}
		return "/Admin/danhsachbaiviet";
	}
	
	@GetMapping("/Admin/Sua-Bai-Viet")
	public String suaBaiViet(@RequestParam("id") String id, Model model) {
		Optional<Baiviet> baiviet= bv.findById(id);
		if(baiviet.isPresent()) {
			List<Chude> danhsachchude = cd.findAll() ;
			model.addAttribute("baiviet", baiviet.get());
			model.addAttribute("danhsachchude",danhsachchude);
			return "Admin/suabaiviet";
		}
		return "index";
	}
	
	@PostMapping("/Admin/Sua-Bai-Viet/{id}")
	public RedirectView xacNhanSuaBaiViet(@RequestParam("tenbaiviet")String tenbaiviet, @RequestParam("noidung")String noidung
			,@PathVariable("id") int id, @RequestParam("idchude") String idchude,@RequestParam("hinhdaidien") MultipartFile multi) {
		Chude chude =new Chude();
		chude.setMachude(Integer.parseInt(idchude));
		Baiviet baiviet =bv.findById(Integer.toString(id)).get();
		
		baiviet.setMachude(chude);
		baiviet.setNoidung(noidung);
		baiviet.setTenbaiviet(tenbaiviet);
		bv.save(baiviet);
		
		String uploadDir = "src/main/resources/static/Admin/assets/img";
		String uploadDir1 = "src/main/resources/static/ClientStyle/assets/image/AnhBaiViet";
		try {
			ServiceBenh.saveFile(uploadDir, Integer.toString(baiviet.getAnhdaidien().getMahinh()) + ".png", multi);
			ServiceBenh.saveFile(uploadDir1, Integer.toString(baiviet.getAnhdaidien().getMahinh()) + ".png", multi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new RedirectView("/Admin/Danh-Sach-Bai-Viet/1");
	}
	
	@PostMapping("/Admin/Xoa-Bai-Viet")
	public @ResponseBody String xoaBaiViet(@RequestBody String mabaiviet) {
		Baiviet baiviet =new Baiviet();
		baiviet.setMabaiviet(Integer.parseInt(mabaiviet));
		bv.delete(baiviet);
		return "Xóa Thành Công";
	}
	
	@PostMapping("/Admin/Xoa-Danh-Sach-Bai-Viet")
	public @ResponseBody String xoaDanhSachBaiViet(@RequestBody String[] danhsachbaiviet) {
		bv.deleteSet(danhsachbaiviet);
		return "Xóa Thành Công";
	}
	
	@PostMapping("/Admin/Duyet-Bai-Viet")
	public @ResponseBody String duyetBaiViet( @RequestBody String id ) {
		bv.duyetBaiviet(id);
		return "Duyệt Bài Viết";
	}
	
	@GetMapping("/Admin/Chi-Tiet-Bai-Viet")
	public @ResponseBody Baiviet xemChiTietBaiViet(@RequestParam("id") String id ) {
		return bv.findById(id).get();
	}
//	Tra lời
	@GetMapping("/Admin/Danh-Sach-Cau-Tra-Loi")
	public String danhSachCauTraLoi(Model model) {
		List<Traloi> traloi = tl.danhSachCauTraLoi();
		model.addAttribute("traloi",traloi);
		return "/Admin/danhsachcautraloibibaocao";
	}
	
	
	
	@Autowired
	private RepositoryTraloi traloi;
	
	@PostMapping ("/Admin/Xoa-Cau-Tra-Loi")
	public @ResponseBody String xoaCauTraLoi(@RequestBody String id) {
		Optional<Traloi> tl = traloi.findById(Integer.parseInt(id));
		Traloi traloixoa =new Traloi();
		traloixoa =tl.get();
		traloi.delete(traloixoa);
		return "Xóa Câu Trả Lời Thành Công";
	}

	
}
	


