package com.hzit.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionHelper {
	private static SqlSession session;
	private static SqlSessionFactory factory;
	
	static{
		Reader r;
		try {
			r= Resources.getResourceAsReader("mybaties-config.xml");
			//产生session工厂对象，根据配置文件产生session工厂对象
			System.out.println("读取配置文件成功");
		    factory=new SqlSessionFactoryBuilder().build(r);
			System.out.println("Sqlsession工厂创建成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static SqlSession getSqlSession(){
		session=factory.openSession();
		System.out.println("获取session对象成功");
		return session;
	}
}
