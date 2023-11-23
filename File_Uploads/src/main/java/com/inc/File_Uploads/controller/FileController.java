package com.inc.File_Uploads.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inc.File_Uploads.dto.File_Entity;
import com.inc.File_Uploads.service.FileService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/files")
public class FileController {
	@Autowired
	private FileService serv;
	
	//To save new file into database
	@PostMapping("/upload")
	public ResponseEntity<File_Entity> uploadFile(@RequestParam("f") MultipartFile file) throws IOException {
		return serv.uploadServ(file);
	}
	
	@GetMapping("/download/{fileName}")
	public ResponseEntity<?> downloadFile(@PathVariable String fileName) throws FileNotFoundException{
		return serv.downloadFileSer(fileName);	
	}
	
	@GetMapping("/getFiles")
	public List<File_Entity> getFiles(){
    	return serv.getAllFileSer();
	}
}
