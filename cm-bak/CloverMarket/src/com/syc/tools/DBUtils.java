package com.syc.tools;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class DBUtils {
/**
 * @author adai
 * @data 2019-3-26 15:45
 * @detail ʵ��mybatis���ݿ����Ӳ���
 */

	public static SqlSession getSession() {
		//ʹ����־�Ķ��������Ϣ
		Logger log=Logger.getLogger(DBUtils.class);
		SqlSessionFactory sf=null;
		SqlSession ss=null;
		try {
			//(1)�����ַ��������,����sessionFactory��
			Reader rd=Resources.getResourceAsReader("my.xml");
			//(2)����һ��sessionFactory��ʵ����Ķ���
			SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
			//(3)sfָ�������������
			sf=sfb.build(rd);
			//(4)�������ݿ��������
			ss=sf.openSession();
			log.info("���ӳɹ�");
			//System.out.println("-----ok----");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("---oh,my god!---");
			e.printStackTrace();
		}
		
		return ss;
	}
	
	//�ر����ݿ��������
	public static void closeDB(SqlSession ss) {
		if(ss!=null) {
			ss.close();
		}
	}
	
	
	
	
	
}
