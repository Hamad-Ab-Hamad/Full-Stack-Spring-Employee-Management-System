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
    
    @Column(name = "employeeId")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    private String firstName;

    private String lastName;

    private String email;

    public Employee(){


    }

    public Employee(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Employee(Integer employeeId, String firstName, String lastName, String email){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getemployeeId(){
        return employeeId;
    }

    public void setemployeeId(Integer employeeId){
        this.employeeId = employeeId;
    }

    public String getfirstName(){
        return firstName;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getemail(){
        return email;
    }

    public void setemail(String email){
        this.email = email;
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
                '}';
    }
}
