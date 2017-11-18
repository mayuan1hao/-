package cn.gsw.smbms.dao.bill;

import java.util.List;
import java.util.Map;

import cn.gsw.smbms.pojo.Bill;

public interface BillMapper {
	public List<Bill> getBillByThings(Map<String,String> map);
	public List<Bill> getBillByThings2(Map<String,String> map);
	public List<Bill> getBillByThings3(Map<String,String> map);
	public List<Bill> getBillByThings4(Map<String,String> map);
	public List<Bill> getBillsByProviderIdList(List<Integer> idList);
	public List<Bill> getBillsByContionsMap(Map<String, Object> map);
	
}
