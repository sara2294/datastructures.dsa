package main.java.edu.upc.eetac.dsa;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        main.java.edu.upc.eetac.dsa.CompanyManager manager = new CompanyManagerImpl();

        // 1. Añadir empresas
        manager.addCompany("Google", "Motor de búsqueda y servicios cloud");
        manager.addCompany("Apple", "Dispositivos electrónicos y software");

        // 2. Añadir empleados
        try {
            manager.addEmployee("Alice", "Smith", new Date(), 45000.0, "Google");
            manager.addEmployee("Bob", "Jones", new Date(), 60000.0, "Google");
            manager.addEmployee("Charlie", "Brown", new Date(), 55000.0, "Apple");
        } catch (MyException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // 3. Listar empleados de una empresa específica
        System.out.println("--- Empleados de Google ---");
        for (Employee emp : manager.employees("Google")) {
            System.out.println(emp);
        }

        // 4. Listar todos los empleados ordenados por nombre
        System.out.println("\n--- Empleados ordenados por Nombre ---");
        for (main.java.edu.upc.eetac.dsa.Employee emp : manager.findAllEmployeesOrderedByName()) {
            System.out.println(emp);
        }

        // 5. Listar todos los empleados ordenados por salario
        System.out.println("\n--- Empleados ordenados por Salario (Mayor a Menor) ---");
        for (Employee emp : manager.findAllEmployeesOrderedBySalary()) {
            System.out.println(emp);
        }

        // 6. Listar todas las empresas
        System.out.println("\n--- Lista de Empresas ---");
        for (Company company : manager.findAllCompanies()) {
            System.out.println(company);
        }
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

