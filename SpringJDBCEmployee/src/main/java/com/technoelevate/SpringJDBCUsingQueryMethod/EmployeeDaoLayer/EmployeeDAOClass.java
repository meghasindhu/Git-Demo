package com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDaoLayer;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDTOLayer.EmployeeDTOBean;

public class EmployeeDAOClass implements EmployeeDAOInterface {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}
public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public List<EmployeeDTOBean> getAll() {
		String sqlQuery ="SELECT * FROM employee";
		List<EmployeeDTOBean> emp = template.query(sqlQuery, new RowMapperImplementation());
		return emp;
	}
	
	
	public int addEmp(EmployeeDTOBean bean) {
		String query ="INSERT INTO employee VALUES(?,?,?)";
			int result = template.update(query,bean.getEmpId(),bean.getEname(),bean.getPassword());
			return result;
		}
	
	
	public int delete(int id) {
		String delQuery ="DELETE FROM employee WHERE empId=?";
		int res = template.update(delQuery,id);
		return res;
	}
	
	
	public EmployeeDTOBean displayEmp(int id) {
		String query ="SELECT * FROM employee WHERE empId=?";
		EmployeeDTOBean bean =template.queryForObject(query, new RowMapperImplementation(), id);
		return bean;
	}
	
	
	public EmployeeDTOBean authenticate(int id, String password) {
		String query ="SELECT * FROM employee WHERE empId=?";
		EmployeeDTOBean bean = template.queryForObject(query, new RowMapperImplementation(), id);
		return bean;
	}
	
	

}
