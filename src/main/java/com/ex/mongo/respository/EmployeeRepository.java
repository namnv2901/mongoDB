package com.ex.mongo.respository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ex.mongo.document.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
	Employee findByEmpNo(String empNo);
//	@Query("{ $oid : ?0 }")
//	Employee findByEmployeeObjectId(String id);
	
}