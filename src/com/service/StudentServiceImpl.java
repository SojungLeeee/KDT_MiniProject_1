package com.service;

import java.util.HashMap;
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

	@Override
	public List<StudentDTO> findByLikeStuName(String stuName) {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			list = dao.findByLikeStuName(session, stuName);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> findByEntDate(HashMap<String, String> map) {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			list = dao.findByEntDate(session, map);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> findByStuNo(List<String> noList) {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			list = dao.findByStuNo(session, noList);
		} finally {
			session.close();
		}
		return list;
	}



}
