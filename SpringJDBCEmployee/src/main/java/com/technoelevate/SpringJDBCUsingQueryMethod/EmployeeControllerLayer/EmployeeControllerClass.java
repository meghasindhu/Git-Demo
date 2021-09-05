package com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeControllerLayer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;
import com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDTOLayer.EmployeeDTOBean;
import com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeServicesLayer.EmployeeServicesClass;

@Controller
public class EmployeeControllerClass {
	
	EmployeeServicesClass services=new EmployeeServicesClass();
	
	HttpSession session=null;
	
	@GetMapping("/display")
	public String getAllEmp(ModelMap map,EmployeeDTOBean emp) {
		List<EmployeeDTOBean> beans =services.getAll();
		map.addAttribute("employee",beans);
			return "displayEmp";
	}
	@GetMapping("/insert")
	public String form(ModelMap map) {
		return "insert";
	}
	@PostMapping("/insert")
	public String insert(ModelMap map, EmployeeDTOBean bean) {
		if(bean!=null) {
		services.addEmp(bean);
		map.addAttribute("mybean",bean);
		String msg="Inserted Successfully";
		map.addAttribute("msg", msg);
		}else{
			String msg=" Not Inserted ";
			map.addAttribute("msg", msg);
		}
		return "display";
	}
	@GetMapping("/delete")
	public String delete() {
		return "show";
	}
	@PostMapping("/delete")
	public String deleteEmp(ModelMap map,@RequestParam int empId) {
		services.delete(empId);
		String msg ="Deleted the respective record from database";
		map.addAttribute("msg", msg);
		return "delete";
		
	}
	@GetMapping("/emp")
	public String displayEmp() {
		return "Emp";
	}
	@PostMapping("/emp")
	public String dispEmp(ModelMap map,HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("empId"));
		EmployeeDTOBean bean =services.displayEmp(id);
		map.addAttribute("empBean", bean);
		return "EmpDisplay";
		
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@PostMapping("/wel")
	public String loginEmp(ModelMap map,HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("empId"));
		String pass = req.getParameter("password");
		String name = services.authenticate(id,pass);
	
		session = req.getSession();
		session.setAttribute("ename",name );
		return "hello";
		
	}
	
	@GetMapping(path="/logout")
	public String logout(ModelMap map) {
		session.invalidate();
		return"logout";
	}
	
	@GetMapping(path="/wel")
	public String view(ModelMap map) {
		return"view";
	}
	

}
