package com.tracuucayduoclieu.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tracuucayduoclieu.Entity.Benh;
import com.tracuucayduoclieu.Entity.Bophansudung;
import com.tracuucayduoclieu.Entity.Cayduoclieu;
import com.tracuucayduoclieu.Entity.Hinh;
import com.tracuucayduoclieu.Repository.RepositoryBenh;

@Service
public class ServiceBenh {
	
	@Autowired
	private RepositoryBenh benh;
	
	public List<Benh> findAll(){
		return benh.findAll();
	}
	
	public Page<Benh> findAll(int offset, int fetch){
		PageRequest pa = PageRequest.of(offset,fetch); 
		return benh.findAll(pa);
	}
	
//	public Hinh findImageById(Benh b) {
//		return b.getMahinh();
//	}
	
	public Optional<Benh> findID(String id) {
		int iden =Integer.parseInt(id);
		return	benh.findById(iden);
	}
	
	public Benh save(Benh b) {
		return benh.save(b);
	}
	
	public Benh save( String benh ) {
		Benh Benh = new Benh();
	    Benh.setTenbenh(benh);
	    return this.benh.save(Benh);
	}

	public int countAll(){
		long count =benh.count();
		float countALL =(float)count/10;
		
		if(countALL %2 !=0){
			countALL++;
		}
		return (int)countALL;
		
	}
	public static void saveFile(String uploadDir, String fileName,
            MultipartFile multipartFile) throws IOException {
        Path uploadPath = Paths.get(uploadDir);
         
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
         
        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {        
            throw new IOException("Could not save image file: " + fileName, ioe);
        }      
    }
	
	public void deleteSet(String dsbenh[]) {
		int i;
		for( i=0; i<dsbenh.length; i++) {
			Benh benh = new Benh();
			benh.setMabenh(Integer.parseInt(dsbenh[i]));
			this.benh.delete(benh);
		}
	}
	public void delete(String mabenh) {
		
		Benh benh =new Benh();
		benh.setMabenh(Integer.parseInt(mabenh));
		this.benh.delete(benh);
	}
	
//	public Page<Cayduoclieu> findByBenh (int id) {
//		Optional<Benh> benh = this.benh.findById(id);
//		Page<Cayduoclieu> cayduoclieu =(Page<Cayduoclieu>) benh.get().getCayduoclieu();
//		return cayduoclieu;
//	}
	
	public boolean themBenh(String benh) {
		Optional<Benh> Benh = this.benh.findByTenbenh(benh);
		if(Benh.isEmpty()) {
			save(benh);
			return true;
		}	
		return false;
	}

	public boolean edit(int id, String benh) {
		Optional<Benh> Benh =this.benh.findById(id);
		if(Benh.isPresent()) {
			Benh.get().setTenbenh(benh);
			this.benh.save(Benh.get());
			return true;
		}
		else {
			return false;
		}
	}
}
