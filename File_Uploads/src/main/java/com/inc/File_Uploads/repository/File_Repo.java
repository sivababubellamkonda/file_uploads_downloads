package com.inc.File_Uploads.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inc.File_Uploads.dto.File_Entity;

@Repository
public interface File_Repo extends JpaRepository<File_Entity, Long>{

  Optional<File_Entity>	findByFileName(String fileName); 
}
