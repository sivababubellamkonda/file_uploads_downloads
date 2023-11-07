package com.inc.File_Uploads.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class File_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fileName;
	private String fileType;
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date date;
	//@Lob
	@Column(length=9000)
	private byte[] data;
     //getters and setters
		
		  public Long getId() { return id; }
		  
		  public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public void setId(Long id) { this.id = id; }
		  
		  public String getFileName() { return fileName; }
		  
		  public void setFileName(String fileName) { this.fileName = fileName; }
		  
		  public String getFileType() { return fileType; }
		  
		  public void setFileType(String fileType) { this.fileType = fileType; }
		  
		  public byte[] getData() { return data; }
		  
		  public void setData(byte[] data) { this.data = data; }
		 
	/*
	 * public File_Entity(String fileName, String fileType, byte[] data) { super();
	 * this.fileName = fileName; this.fileType = fileType; this.data = data; }
	 */
}
