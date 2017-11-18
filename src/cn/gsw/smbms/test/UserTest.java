package cn.gsw.smbms.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import cn.gsw.smbms.dao.user.UserMapper;
import cn.gsw.smbms.utils.MyBatisUtil;

public class UserTest {
	private Logger logger = Logger.getLogger(UserTest.class);
	@Test
	public void test() {
		SqlSession sqlSession = null;
		int count = 0;
		try {
			sqlSession = MyBatisUtil.createSqlSession(false);
			count = sqlSession.getMapper(UserMapper.class).count();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		logger.debug("UserMapperTest count---> " + count);
	}

}
