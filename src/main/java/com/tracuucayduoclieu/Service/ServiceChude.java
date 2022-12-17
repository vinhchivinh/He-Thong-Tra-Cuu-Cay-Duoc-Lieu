package com.tracuucayduoclieu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracuucayduoclieu.Entity.Chude;
import com.tracuucayduoclieu.Repository.RepositoryChude;

@Service
public class ServiceChude {

	@Autowired
	private RepositoryChude cd;
	
	public Chude save(Chude chude) {
		return cd.save(chude);
	}
	
	public List<Chude> findAll() {
		return cd.findAll();
	}
	
}
