package com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeServicesLayer;

import java.util.List;

import com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDTOLayer.EmployeeDTOBean;

public interface EmployeeServiceInterface {
	public List<EmployeeDTOBean> getAll();
	public int addEmp(EmployeeDTOBean bean);
	public int delete(int id);
	public EmployeeDTOBean displayEmp(int id);
	public String authenticate(int id, String password);

}
