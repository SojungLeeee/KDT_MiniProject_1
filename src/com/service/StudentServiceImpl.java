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

	@Override
	public int UpdateAbsYn(List<String> noList) {
		int updateNum = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			updateNum = dao.UpdateAbsYn(session, noList);
			session.commit();
		} finally {
			session.close();
		}
		return updateNum;
	}

	@Override
	public int updateCapacity() {
		int updateCapacityNum = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			updateCapacityNum = dao.updateCapacity(session);
			session.commit();
		} finally {
			session.close();
		}
		return updateCapacityNum;
	}

	@Override
	public List<StudentDTO> findGrade(String stuNo) {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			list = dao.findGrade(session,stuNo);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> paging(int skip,int perPage) {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			list = dao.paging(session,skip,perPage);
		} finally {
			session.close();
		}
		return list;
	}





}
