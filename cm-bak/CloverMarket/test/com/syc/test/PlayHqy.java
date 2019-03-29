package com.syc.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

public class PlayHqy {
	@Test
	public static SqlSession getSession() {
		// 使用日志的对象输出信息
		Logger log = Logger.getLogger(PlayHqy.class);
		SqlSessionFactory sf = null;
		SqlSession ss = null;
		try {
			// (1)生成字符输出对象,传入sessionFactory中
			Reader rd = Resources.getResourceAsReader("my.xml");
			// (2)创建一个sessionFactory的实现类的对象
			SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
			// (3)sf指向它的子类对象
			sf = sfb.build(rd);
			// (4)生成数据库操作对象
			ss = sf.openSession();
			log.info("连接成功");
			// System.out.println("-----ok----");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//log.error("---oh,my god!---");
			e.printStackTrace();
		}

		return ss;
	}
}
