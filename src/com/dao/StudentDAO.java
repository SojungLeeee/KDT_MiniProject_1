package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.StudentDTO;

// DAO (Data Access Object) 패턴
// DB나 파일 등 데이터를 가지고 있는 외부자원과 연동하는 클래스
public class StudentDAO {
	
	
	//필수! 모든 메서드는 파라미터로 SqlSession session을 받아와야함
	public List<StudentDTO> findAll(SqlSession session){
		List<StudentDTO> list = session.selectList("com.config.StudentMapper.findAll");
		return list;
	}
	
	public List<StudentDTO> findByLikeStuName(SqlSession session, String stuName){
		List<StudentDTO> list = session.selectList("com.config.StudentMapper.findByLikeStuName",stuName);
		return list;
	}
	
	public List<StudentDTO> findByEntDate(SqlSession session, HashMap<String, String> map){
		List<StudentDTO> list = session.selectList("com.config.StudentMapper.findByEntDate",map);
		return list;
	}
	
	public List<StudentDTO> findByStuNo(SqlSession session, List<String> noList) {
		List<StudentDTO> list = session.selectList("com.config.StudentMapper.findByStuNo",noList);
		return list;
	}
	
	public int UpdateAbsYn(SqlSession session, List<String> noList) {
		int updateNum = session.update("com.config.StudentMapper.UpdateAbsYn",noList);
		return updateNum;
	}
	
	public int updateCapacity(SqlSession session) {
		int updateCapacityNum = session.update("com.config.StudentMapper.updateCapacity");
		return updateCapacityNum;
	}

	public List<StudentDTO> findGrade(SqlSession session,String stuNo) {
		List<StudentDTO> list = session.selectList("com.config.StudentMapper.findGrade",stuNo);
		return list;
	}
	
	public List<StudentDTO> paging(SqlSession session, int skip,int perPage) {
		List<StudentDTO> list = session.selectList("com.config.StudentMapper.paging",null,new RowBounds(skip,perPage));
		return list;
	}
}
