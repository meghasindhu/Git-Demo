package com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDaoLayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDTOLayer.EmployeeDTOBean;

public class RowMapperImplementation implements RowMapper<EmployeeDTOBean> {

	public EmployeeDTOBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDTOBean emp = new EmployeeDTOBean();
		emp.setEmpId(rs.getInt(1));
		emp.setEname(rs.getString(2));
		emp.setPassword(rs.getString(3));
		return emp;
	}

}
