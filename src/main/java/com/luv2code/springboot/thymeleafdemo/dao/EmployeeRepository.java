
//	***	Spring Data JPA	***	//

package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//	adding sorting method
	public List<Employee> findAllByOrderByLastNameAsc();
	
	//	Spring Data JPA will parse the method name and define
	//	the order behind the scene. First it will identify 
	//	'findAllBy' then 'OrderByLastName' and sort
	//	list automatically
}
