package com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDaoLayer;

import java.util.List;

import com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDTOLayer.EmployeeDTOBean;

public interface EmployeeDAOInterface {
	List<EmployeeDTOBean> getAll();
	public int addEmp(EmployeeDTOBean bean);
	public int delete(int id);
	public EmployeeDTOBean displayEmp(int id);
	public EmployeeDTOBean authenticate(int id,String password);

}
