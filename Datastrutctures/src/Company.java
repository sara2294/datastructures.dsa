package main.java.edu.upc.eetac.dsa;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private String description;
    private List<Employee> employees;

    public Company(String companyName, String description) {
        this.companyName = companyName;
        this.description = description;
        this.employees = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDescription() {
        return description;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", description='" + description + '\'' +
                ", employeesCount=" + employees.size() +
                '}';
    }
}