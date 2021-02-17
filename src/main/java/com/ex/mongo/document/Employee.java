package com.ex.mongo.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "employee")
public class Employee {
	@Id
	@Field (value = "_id")
    private String id;
 
    @Indexed(unique = true)
    @Field(value = "Emp_No")
    private String empNo;
 
    @Field(value = "Full_Name")
    private String fullName;
 
    @Field(value = "Hire_Date")
    private Date hireDate;

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getEmpNo() {
		return empNo;
	}

	public final void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public final String getFullName() {
		return fullName;
	}

	public final void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public final Date getHireDate() {
		return hireDate;
	}

	public final void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
    
}
