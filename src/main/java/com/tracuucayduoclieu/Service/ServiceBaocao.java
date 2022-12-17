package com.tracuucayduoclieu.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Baocao;
import com.tracuucayduoclieu.Entity.Traloi;
import com.tracuucayduoclieu.Repository.RepositoryBaocao;

@Service
public class ServiceBaocao {
	
	@Autowired
	private RepositoryBaocao bc;
	
	public Baocao save(Baocao baocao) {
		return bc.save(baocao);
	}
	
	public Baocao save (int idcautraloi, String noidungbaocao) {
//		Set nội dung báo cáo
		if(!noidungbaocao.equals("")) {
			Baocao baocao =new Baocao();
			baocao.setNoidungbaocao(noidungbaocao);
//			Set Câu trả lời
			Traloi traloi = new Traloi();
			traloi.setMacautraloi(idcautraloi);
			baocao.setTraloi(traloi);
			return save(baocao);
		}
		return null;
	}
}
