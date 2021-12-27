package net.javaguides.springmvc.service;

import java.util.List;

import net.javaguides.springmvc.entity.Customer;

public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
/*
public interface EmployeeDao {
public int saveEmployee(Employee employee);

public Employee getEmployeeById(int employeeId);

public void updateEmployeeById(int employeeId, Employee employeeTO);// TO-Transfer Object

public void deleteEmployeeById(int employeeId);
}*/

