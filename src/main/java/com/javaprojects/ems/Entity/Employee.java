package com.javaprojects.ems.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    
    @Column(name = "employee_Id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    @Column(name = "first_namme")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id", nullable= false, unique = true)
    private String email;

    @Column(name = "salary")
    private String salary;

    @Column(name = "department")
    private String department;

    @Column(name = "role")
    private String role;

    @Column(name = "office")
    private String office;

    public Employee(){}

    public Employee(String firstName, String lastName, String email, String salary, String department, String role, String office){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.department = department;
        this.role = role;
        this.office = office;
    }

    public Employee(Integer employeeId, String firstName, String lastName, String email, String salary, String department, String role, String office){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.department = department;
        this.role = role;
        this.office = office;
    }

    public Integer getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId){
        this.employeeId = employeeId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSalary(){
        return salary;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getOffice(){
        return office;
    }

    public void setOffice(String office){
        this.office = office;
    }

    /*
     * Overriding equals() to tell when two object are identical so
     * Assert.asserEquals and List.contains can function
     */

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
        if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
        if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
        if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
        if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
        if (office == null) {
			if (other.office != null)
				return false;
		} else if (!office.equals(other.office))
			return false;
		return true;
	}
    
    /*
     * Overriding toString() for easy debugging
     */

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}
