package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.StudentDAO;
import com.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	StudentDAO dao;
	@Override
	public void setDAO(StudentDAO dao) {
		this.dao=dao;
	}

	@Override
	public List<StudentDTO> findAll() {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try { //try 블럭 안에서 list 값 할당
			list = dao.findAll(session);
		}
		finally{
			session.close();
		}
		return list;
	}

}
