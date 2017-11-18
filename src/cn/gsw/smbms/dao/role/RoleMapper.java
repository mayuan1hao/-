package cn.gsw.smbms.dao.role;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.gsw.smbms.pojo.Role;

public interface RoleMapper {
	public int addRole(Role role);
	public int modifyRole(Map map);
	
	public List<Role> getRoleListByRoleName(String roleName);
	
	public int modifySet(Role role);
	
	public List<Role> getRolesByRoleName(@Param("roleName")String roleName,
										@Param("from")Integer currentPageNo,
										@Param("pageSize")Integer pageSize);
}
