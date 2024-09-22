package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Healthplan healthplan1 = new Healthplan(1, "Standard Plan", Plan.BASIC);
        System.out.println(healthplan1.toString());

        String[] healthplans = new String[2];
        Employee employee = new Employee(123, "Sena", "sena@example.com", "password123", healthplans);
        employee.addHealthPlan(0, "standard");
        System.out.println(employee.toString());

        String[] developers = new String[2];
        Company company = new Company(2, "Tech", 500000, developers);
        company.addEmployee(1, "Sena");
        System.out.println(company.toString());

    }
}