package main.java.edu.upc.eetac.dsa;

import java.util.*;

public class CompanyManagerImpl implements CompanyManager {

    // HashMap para asociar el nombre de la empresa con el objeto Company
    private Map<String, Company> companiesMap;

    public CompanyManagerImpl() {
        this.companiesMap = new HashMap<>();
    }

    @Override
    public void addCompany(String companyName, String description) {
        Company company = new Company(companyName, description);
        companiesMap.put(companyName, company);
    }

    @Override
    public void addEmployee(String name, String surname, Date birthday, double salary, String companyName) throws MyException {
        Company company = companiesMap.get(companyName);
        if (company == null) {
            throw new MyException("La empresa '" + companyName + "' no existe.");
        }
        Employee employee = new Employee(name, surname, birthday, salary, companyName);
        company.addEmployee(employee);
    }

    @Override
    public List<Employee> findAllEmployeesOrderedByName() {
        List<Employee> allEmployees = getAllEmployees();
        allEmployees.sort(Comparator.comparing(Employee::getName));
        return allEmployees;
    }

    @Override
    public List<Employee> findAllEmployeesOrderedBySalary() {
        List<Employee> allEmployees = getAllEmployees();
        // Orden descendente por salario (o ascendente cambiando el orden)
        allEmployees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        return allEmployees;
    }

    @Override
    public List<Employee> employees(String company) {
        Company comp = companiesMap.get(company);
        if (comp != null) {
            return comp.getEmployees();
        }
        return new ArrayList<>();
    }

    @Override
    public List<Company> findAllCompanies() {
        return new ArrayList<>(companiesMap.values());
    }

    // Método auxiliar interno para recopilar todos los empleados
    private List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<>();
        for (Company company : companiesMap.values()) {
            allEmployees.addAll(company.getEmployees());
        }
        return allEmployees;
    }
}