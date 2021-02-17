package com.ex.mongo.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ex.mongo.document.Employee;
import com.ex.mongo.respository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository empRepositoty;
	
	@ResponseBody
    @RequestMapping("/")
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/testInsert'>Test Insert</a></li>";
        html += " <li><a href='/showAllEmployee'>Show All Employee</a></li>";
        html += " <li><a href='/showFullNameLikeTom'>Show All 'Tom'</a></li>";
        html += " <li><a href='/deleteAllEmployee'>Delete All Employee</a></li>";
        html += " <li><a href='/findByEmpNo'>Find by Employee Code</a></li>";
        html += " <li><a href='/findByObjectId'>Find by findByObjectId</a></li>";
        html += "</ul>";
        return html;
    }

	@ResponseBody
	@RequestMapping("/showAllEmployee")
	public String showAllEmployee() {

		List<Employee> employees = this.empRepositoty.findAll();

		String html = "";
		for (Employee emp : employees) {
			html += emp + "<br>";
		}

		return html;
	}

	@ResponseBody
	@RequestMapping("/showFullNameLikeTom")
	public String showFullNameLikeTom() {

//		List<Employee> employees = this.empRepositoty.;

		String html = "";
//		for (Employee emp : employees) {
//			html += emp + "<br>";
//		}

		return html;
	}
	
	@ResponseBody
	@RequestMapping("/findByEmpNo")
	public String findByEmpNo() {
		
		Employee employees = this.empRepositoty.findByEmpNo("NV001");
		
		String html = "";
		html += employees + "<br>";
		
		return html;
	}
	
	@ResponseBody
	@RequestMapping("/findByObjectId")
	public String findByObjectId() {
		ObjectId objectId = new ObjectId("601eba420d8b1bb21c490f60");
//		Employee employees = this.empRepositoty.findByEmployeeObjectId("601eba420d8b1bb21c490f60");
		
		String html = "";
//		html += employees + "<br>";
		
		return html;
	}

	@ResponseBody
	@RequestMapping("/deleteAllEmployee")
	public String deleteAllEmployee() {

		this.empRepositoty.deleteAll();
		return "Deleted!";
	}
}
