package cn.gsw.smbms.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import cn.gsw.smbms.dao.role.RoleMapper;
import cn.gsw.smbms.pojo.Role;
import cn.gsw.smbms.utils.MyBatisUtil;

public class RoleTest {
	private Logger logger = Logger.getLogger(RoleTest.class);
	@Test
	public void testAdd() {
		Role role = new Role();
		role.setRoleCode("SMBMS_TRAVLER");
		role.setRoleName("游客");
		role.setCreatedBy(1);
		role.setCreationDate(new Date());
		int count = 0;
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSqlSession(false);
			count = session.getMapper(RoleMapper.class).addRole(role);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			count = 0;
		}
		logger.debug("RoleTest----count===>>> "+count);
	}
	@Test
	public void testUpdate() {
		Map map = new HashMap();
		map.put("id", 4);
		map.put("roleCode", "SMBMS_TRAVLER");
		map.put("roleName", "浏览");
		map.put("modifyBy", 1);
		map.put("modifyDate", new Date());
		int count = 0;
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSqlSession(false);
			count = session.getMapper(RoleMapper.class).modifyRole(map);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			count = 0;
		}
		logger.debug("RoleTest----count===>>> "+count);
	}

	@Test
	public void testSelect() {
		List<Role> roles = new ArrayList<Role>();
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSqlSession(false);
			roles = session.getMapper(RoleMapper.class).getRoleListByRoleName("理");
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally{
			MyBatisUtil.closeSqlSession(session);
		}
		
		for (Role role : roles) {
			logger.debug("RoleTest----select===>>> "+role.getRoleName()+"\t"+role.getId());
		}
		
	}
	
	@Test
	public void testUpdateSet() {
		Role role = new Role();
		//role.setRoleCode("SMBMS_TRAVLER");
		role.setRoleName("浏览");
		role.setModifyBy(1);
		role.setModifyDate(new Date());
		role.setId(4);
		int count = 0;
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSqlSession(false);
			count = session.getMapper(RoleMapper.class).modifySet(role);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			count = 0;
		}
		logger.debug("RoleTest----count===>>> "+count);
	}
	
	
	@Test
	public void testSelectLimit() {
		List<Role> roles = new ArrayList<Role>();
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSqlSession(false);
			roles = session.getMapper(RoleMapper.class).getRolesByRoleName("理",0,1);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally{
			MyBatisUtil.closeSqlSession(session);
		}
		
		for (Role role : roles) {
			logger.debug("RoleTest----select===>>> "+role.getRoleName()+"\t"+role.getId());
		}
		
	}
}
