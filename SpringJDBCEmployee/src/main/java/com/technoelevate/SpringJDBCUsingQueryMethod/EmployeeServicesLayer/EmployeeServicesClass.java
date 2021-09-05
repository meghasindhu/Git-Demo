package com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeServicesLayer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDTOLayer.EmployeeDTOBean;
import com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDaoLayer.EmployeeDAOClass;
import com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDaoLayer.EmployeeDAOInterface;
@Component
public class EmployeeServicesClass implements EmployeeServiceInterface{
	
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/technoelevate/SpringJDBCUsingQueryMethod/EmployeeDaoLayer/Config.xml");
	EmployeeDAOClass emp =context.getBean("mydao",EmployeeDAOClass.class);
	
	public List<EmployeeDTOBean> getAll() {
		return emp.getAll();
		
	}

	public int addEmp(EmployeeDTOBean bean) {
		
		return emp.addEmp(bean);
	}

	public int delete(int id) {
		
		return emp.delete(id);
	}

	public EmployeeDTOBean displayEmp(int id) {
		
		return emp.displayEmp(id);
	}

	public String authenticate(int id, String password) {
		EmployeeDTOBean bean = emp.authenticate(id, password);
		
		if(password.equals(bean.getPassword())) {
			
		 return bean.getEname();
		}else
			return null;
	}
	
}
