package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements CommandLineRunner 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void run(String... args) throws Exception
	{
		
//		String sql ="insert into Employee values(?,?,?,?)";
//		int i=jdbcTemplate.update(sql,2,"Hemant",50000,"Jalgaon");
//		System.out.println("Employee inserted: "+i);
		
//		String sql="update employee set esalary=? where eid=?";
//		int i=jdbcTemplate.update(sql,60000,1);
//		System.out.println("Employee updated: "+i);
		
		
		String sql="delete from employee where eid=?";
		int i=jdbcTemplate.update(sql,2);
		System.out.println("Employee deleted : "+i);
		
	}

}
