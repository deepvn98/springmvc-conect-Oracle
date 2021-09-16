package com.cmc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cmc.model.Employee1;

public interface EmployeeMapper {
	@Insert("insert into employee1 (name_employee, address, age, gender) values(#{name_employee}, #{address}, #{age}, #{gender})")
	public void add(Employee1 employee);

	@Update("update employee1 set name_employee=#{name_employee}, address=#{address}, age=#{age}, gender=#{gender} where id=#{id}")
	public void update(Employee1 employee);

	@Select("select * from employee1 where id=#{id}")
	public Employee1 findById(long id);

	@Select("select * from employee1")
	public List<Employee1> findAll();

	@Delete("delete from employee1 where id=#{id}")
	public void delete(long id);

}
