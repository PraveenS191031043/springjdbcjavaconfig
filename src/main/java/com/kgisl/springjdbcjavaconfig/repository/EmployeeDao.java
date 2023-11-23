package com.kgisl.springjdbcjavaconfig.repository;

import java.util.List;
 
import org.springframework.jdbc.core.JdbcTemplate;

import com.kgisl.springjdbcjavaconfig.model.Employee;
import com.kgisl.springjdbcjavaconfig.model.EmployeeMapper;
 
public class EmployeeDao {
    {System.out.println(".............. EmployeeDao .............");}
    private JdbcTemplate jdbcTemplate;
 
    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
 
public int saveEmployee(Employee e){  
    String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
    return jdbcTemplate.update(query);  
}
 
public int updateEmployee(Employee e){  
    String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
}
 
    public int deleteEmployee(Employee e) {
        String query = "delete from employee where id='" + e.getId() + "' ";
        return jdbcTemplate.update(query);
    }
 
    public List<Employee> allEmployees() {
        String query = "SELECT * FROM employee";
        return jdbcTemplate.query(query,new EmployeeMapper());
    }
}
