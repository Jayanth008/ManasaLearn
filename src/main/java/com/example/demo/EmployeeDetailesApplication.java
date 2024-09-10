package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.EmployeEntity;

@SpringBootApplication
public class EmployeeDetailesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDetailesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		EmployeEntity[] employees = new EmployeEntity[10];
		employees[0] = createEmployee(1, "John Doe", "john.doe@example.com", 9876543210L);
		employees[1] = createEmployee(2, "Jane Smith", "jane.smith@example.com", 8765432109L);
		employees[2] = createEmployee(3, "Alice Johnson", "alice.johnson@example.com", 7654321098L);
		employees[3] = createEmployee(4, "Bob Brown", "bob.brown@example.com", 6543210987L);
		employees[4] = createEmployee(5, "Charlie Davis", "charlie.davis@example.com", 5432109876L);
		employees[5] = createEmployee(6, "Diana Evans", "diana.evans@example.com", 4321098765L);
		employees[6] = createEmployee(7, "Ethan Harris", "ethan.harris@example.com", 3210987654L);
		employees[7] = createEmployee(8, "Fiona Green", "fiona.green@example.com", 2109876543L);
		employees[8] = createEmployee(9, "George Hill", "george.hill@example.com", 1098765432L);
		employees[9] = createEmployee(10, "Hannah King", "hannah.king@example.com", 1987654321L);
	}

	private EmployeEntity createEmployee(int empId, String empName, String emailId, long number) {
		EmployeEntity employee = new EmployeEntity();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmailId(emailId);
		employee.setNumber(number);
		return employee;
	}

}
