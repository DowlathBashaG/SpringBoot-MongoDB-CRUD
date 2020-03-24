package io.dowlath.springbootmongo.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Department {
	
	@Field(name="department_name")
	private String departmentName;
	
	@Field(name="location")
	private String location;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
