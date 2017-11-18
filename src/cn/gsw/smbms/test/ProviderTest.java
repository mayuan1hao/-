package cn.gsw.smbms.test;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import cn.gsw.smbms.dao.provider.ProviderMapper;
import cn.gsw.smbms.pojo.Bill;
import cn.gsw.smbms.pojo.Provider;
import cn.gsw.smbms.utils.MyBatisUtil;

public class ProviderTest {
	private Logger logger = Logger.getLogger(ProviderTest.class);
	
	@Test
	public void testSelect(){
		SqlSession session = MyBatisUtil.createSqlSession(true);
		Provider provider = session.getMapper(ProviderMapper.class).getProviderById(1);
		for (Bill bill : provider.getBillList()) {
			logger.debug("id : "+provider.getId()+" ���� : "+provider.getProName()+" ����id : "+bill.getId()+" ��Ʒ���� : "+bill.getProductName());
		}
		
	}
	@Test
	public void testAdd(){
		Provider provider = new Provider();
		provider.setProCode("BJ_GYS013");
		provider.setProName("���������λÿƼ����޹�˾");
		provider.setProDesc("���ں�����飬��Ӫ��Ʒ�����ϵͳ����վ��������������������");
		provider.setProContact("��ʤΰ");
		provider.setProPhone("18435230694");
		provider.setProAddress("�����к�������ѧԷ");
		provider.setProFax("010-5858588");
		provider.setCreatedBy(1);
		provider.setCreationDate(new Date());
		SqlSession session = null;
		int count = 0;
		try {
			session = MyBatisUtil.createSqlSession(false);
			count = session.getMapper(ProviderMapper.class).addProvider(provider);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			count=0;
		} finally{
			MyBatisUtil.closeSqlSession(session);
		}
		logger.debug("ProviderTest----count=====>>>>"+count);
	}
	@Test
	public void testUpdate(){
		int count = 0;
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSqlSession(false);
			count = session.getMapper(ProviderMapper.class).modifyPsw("13333333333", 17);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			count = 0;
		} finally{
			MyBatisUtil.closeSqlSession(session);
		}
		logger.debug("ProviderTest----count=====>>>>"+count);
	}
	@Test
	public void testDelete(){
		int count = 0;
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSqlSession(false);
			count = session.getMapper(ProviderMapper.class).delProvider(17);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			count = 0;
		} finally{
			MyBatisUtil.closeSqlSession(session);
		}
		logger.debug("ProviderTest----count=====>>>>"+count);
	}
	
	@Test
	public void testSet(){
		int count = 0;
		SqlSession session = null;
		Provider provider = new Provider();
		provider.setProName("������ó��");
		provider.setProPhone("18435130694");
		provider.setId(17);
		try {
			session = MyBatisUtil.createSqlSession(false);
			count = session.getMapper(ProviderMapper.class).modifySet(provider);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			count = 0;
		}
		logger.debug("ProviderTest----count=====>>>>"+count);
	}
	
	@Test
	public void testTrim(){
		int count = 0;
		SqlSession session = null;
		Provider provider = new Provider();
		provider.setProName("������ó��");
		provider.setProPhone("18435130694");
		provider.setId(16);
		try {
			session = MyBatisUtil.createSqlSession(false);
			count = session.getMapper(ProviderMapper.class).modifyTrim(provider);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			count = 0;
		}
		logger.debug("ProviderTest----count=====>>>>"+count);
	}
}
