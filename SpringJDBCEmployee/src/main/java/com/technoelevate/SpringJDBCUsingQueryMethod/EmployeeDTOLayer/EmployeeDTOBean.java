package com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDTOLayer;

import lombok.Data;

@Data
public class EmployeeDTOBean {
	private int empId;
	private String ename;
	private String password;
	
	@Override
	public String toString() {
		return "empId=" + empId + ", ename=" + ename ;
	}
	
	

}
