package com.service;

import java.util.List;

import com.dao.StudentDAO;
import com.dto.StudentDTO;

public interface StudentService {

	public void setDAO(StudentDAO dao);
	
	//[select] 는 여러개를 가져오므로 List로 가져오기
	//메서드명을 Mapper에서 준 id 값으로 주기
	public abstract List<StudentDTO> findAll();
}
