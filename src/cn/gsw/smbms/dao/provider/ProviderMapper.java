package cn.gsw.smbms.dao.provider;

import org.apache.ibatis.annotations.Param;

import cn.gsw.smbms.pojo.Provider;

public interface ProviderMapper {
	public Provider getProviderById(int id);
	public int addProvider(Provider provider);
	public int modifyPsw(@Param("proPhone")String proPhone,@Param("id")Integer id);
	public int delProvider(@Param("id")Integer id);
	public int modifySet(Provider provider);
	public int modifyTrim(Provider provider);
}
