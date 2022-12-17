package com.tracuucayduoclieu.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tracuucayduoclieu.Entity.Cayduoclieu;
import com.tracuucayduoclieu.Entity.Hinh;
import com.tracuucayduoclieu.Repository.RepositoryHinh;

@Service
public class ServiceHinh {
	
	@Autowired
	RepositoryHinh h;
	
	public static String saveImageToDir(Cayduoclieu cayduoclieu,int index,MultipartFile mt, String dir) {
		try {
			saveFile(dir,cayduoclieu.getMaduoclieu()+"_"+index+".png", mt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cayduoclieu.getMaduoclieu()+"_"+index+".png";
	}
	
	public Hinh save(Hinh hinh) {
		return h.save(hinh);
	}
	
	public Optional<Hinh> findID(String id) {
		int iden =Integer.parseInt(id);
		return	h.findById(iden);
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
	
	public static void saveFile1(String uploadDir, String fileName,
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
	
}
