package main.java.edu.upc.eetac.dsa;

import java.util.Date;

public class Employee {
    private String name;
    private String surname;
    private Date birthday;
    private double salary;
    private String companyName;

    public Employee(String name, String surname, Date birthday, double salary, String companyName) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}