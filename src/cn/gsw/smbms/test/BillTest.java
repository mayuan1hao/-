package cn.gsw.smbms.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import cn.gsw.smbms.dao.bill.BillMapper;
import cn.gsw.smbms.pojo.Bill;
import cn.gsw.smbms.utils.MyBatisUtil;

public class BillTest {
	private Logger logger = Logger.getLogger(BillTest.class);
	@Test
	public void test() {
		SqlSession session = MyBatisUtil.createSqlSession(true);
		Map<String, String> map = new HashMap<String, String>();
		map.put("productName", "ˮ");
		map.put("providerId", "13");
		map.put("isPayment", "2");
		List<Bill> bills = session.getMapper(BillMapper.class).getBillByThings(map);
		for (Bill bill : bills) {
			logger.debug(bill.getBillCode()+"\t"+bill.getProductName()+"\t"+bill.getProvider().getProName()+"\t"+bill.getProvider().getProCode()+"\t"
					+bill.getProvider().getProPhone()+"\t"+bill.getProvider().getProContact()+"\t"+bill.getTotalPrice()+"\t"+bill.getIsPayment());
		}
		MyBatisUtil.closeSqlSession(session);
	}
	
	@Test
	public void testIf() {
		SqlSession session = MyBatisUtil.createSqlSession(true);
		Map<String, String> map = new HashMap<String, String>();
		map.put("productName", "ˮ");
		//map.put("providerId", "13");
		//map.put("isPayment", "2");
		List<Bill> bills = session.getMapper(BillMapper.class).getBillByThings2(map);
		for (Bill bill : bills) {
			logger.debug(bill.getBillCode()+"\t"+bill.getProductName()+"\t"+bill.getProvider().getProName()+"\t"+bill.getProvider().getProCode()+"\t"
					+bill.getProvider().getProPhone()+"\t"+bill.getProvider().getProContact()+"\t"+bill.getTotalPrice()+"\t"+bill.getIsPayment());
		}
		MyBatisUtil.closeSqlSession(session);
	}
	
	@Test
	public void testWhere() {
		SqlSession session = MyBatisUtil.createSqlSession(true);
		Map<String, String> map = new HashMap<String, String>();
		map.put("productName", "ˮ");
		//map.put("providerId", "13");
		//map.put("isPayment", "2");
		List<Bill> bills = session.getMapper(BillMapper.class).getBillByThings3(map);
		for (Bill bill : bills) {
			logger.debug(bill.getBillCode()+"\t"+bill.getProductName()+"\t"+bill.getProvider().getProName()+"\t"+bill.getProvider().getProCode()+"\t"
					+bill.getProvider().getProPhone()+"\t"+bill.getProvider().getProContact()+"\t"+bill.getTotalPrice()+"\t"+bill.getIsPayment());
		}
		MyBatisUtil.closeSqlSession(session);
	}
	
	@Test
	public void testTrim() {
		SqlSession session = MyBatisUtil.createSqlSession(true);
		Map<String, String> map = new HashMap<String, String>();
		map.put("productName", "ˮ");
		//map.put("providerId", "13");
		//map.put("isPayment", "2");
		List<Bill> bills = session.getMapper(BillMapper.class).getBillByThings4(map);
		for (Bill bill : bills) {
			logger.debug(bill.getBillCode()+"\t"+bill.getProductName()+"\t"+bill.getProvider().getProName()+"\t"+bill.getProvider().getProCode()+"\t"
					+bill.getProvider().getProPhone()+"\t"+bill.getProvider().getProContact()+"\t"+bill.getTotalPrice()+"\t"+bill.getIsPayment());
		}
		MyBatisUtil.closeSqlSession(session);
	}
	
	@Test
	public void testForEachList() {
		SqlSession session = MyBatisUtil.createSqlSession(true);
		List<Integer> idList = new ArrayList<Integer>();
		idList.add(2);
		idList.add(3);
		List<Bill> bills = session.getMapper(BillMapper.class).getBillsByProviderIdList(idList);
		for (Bill bill : bills) {
			logger.debug(bill.getBillCode()+"\t"+bill.getProductName()+"\t"+bill.getProvider().getProName()+"\t"+bill.getProvider().getProCode()+"\t"
					+bill.getProvider().getProPhone()+"\t"+bill.getProvider().getProContact()+"\t"+bill.getTotalPrice()+"\t"+bill.getIsPayment());
		}
		MyBatisUtil.closeSqlSession(session);
	}
	
	@Test
	public void testForEachMap() {
		SqlSession session = MyBatisUtil.createSqlSession(true);
		List<Integer> idList = new ArrayList<Integer>();
		idList.add(2);
		idList.add(3);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bCode", "8");
		map.put("pIds", idList);
		List<Bill> bills = session.getMapper(BillMapper.class).getBillsByContionsMap(map);
		for (Bill bill : bills) {
			logger.debug(bill.getBillCode()+"\t"+bill.getProductName()+"\t"+bill.getProvider().getProName()+"\t"+bill.getProvider().getProCode()+"\t"
					+bill.getProvider().getProPhone()+"\t"+bill.getProvider().getProContact()+"\t"+bill.getTotalPrice()+"\t"+bill.getIsPayment());
		}
		MyBatisUtil.closeSqlSession(session);
	}
}
