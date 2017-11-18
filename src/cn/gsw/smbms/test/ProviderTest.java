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
			logger.debug("id : "+provider.getId()+" 名称 : "+provider.getProName()+" 订单id : "+bill.getId()+" 商品名称 : "+bill.getProductName());
		}
		
	}
	@Test
	public void testAdd(){
		Provider provider = new Provider();
		provider.setProCode("BJ_GYS013");
		provider.setProName("北京谷氏梦幻科技有限公司");
		provider.setProDesc("长期合作伙伴，主营产品：软件系统、网站开发、大数据整理。。。");
		provider.setProContact("谷胜伟");
		provider.setProPhone("18435230694");
		provider.setProAddress("北京市海淀区智学苑");
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
		provider.setProName("谷氏商贸行");
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
		provider.setProName("谷氏商贸行");
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
