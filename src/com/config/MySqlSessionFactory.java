package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	
	//getSession 메서드에서 SqlSessionFactory를 써야하기때문에
	//static 블럭 밖에 만들어주기
	//static 이 먼저 만들어지기때문에 static블럭안에서 쓰면 에러가 나서
	//이 변수도 static으로 만들어주기
	private static SqlSessionFactory sqlSessionFactory;
	static {
		String resource = "com/config/Configuration.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
	} //end static block
	
	//SqlSessionFactory 에서 SqlSession을 리턴하는 메서드
	//객체 생성 없이 사용해주기 위해서 static 메서드로 만들어줌
	//즉 이 메서드를 사용하기 위해서는 MySqlSessionFactory.getSession() 방식으로
	//SqlSession을 얻는다.
	public static SqlSession getSession() {
		//sqlSessionFactory에서 openSession이라는 메서드로 session 얻기
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}

}
