package main.java.com.example.lists.companyexample;

import java.util.ArrayList;

/*
Una Company tiene una lista de Employee
Un Employee tiene una lista de Car

A partir de una Company extraer los Car asociados
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "1234A", "red");
        Car car2 = new Car("Citroe", "1234A", "green");
        Car car3 = new Car("Renauld", "1234A", "yellow");
        Car car4 = new Car("Fiat", "1234A", "white");

        ArrayList<Car> cars1 = new ArrayList<Car>();
        cars1.add(car1);
        cars1.add(car2);
        Employee employee1 = new Employee("Juan", "Martínez", "123456789B", cars1);

        ArrayList<Car> cars2 = new ArrayList<Car>();
        cars1.add(car3);
        cars1.add(car4);
        Employee employee2 = new Employee("Marta", "Silvestre", "987654321A", cars2);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        Company company1 = new Company("CarCompany", employees);

        ArrayList<Company> companies = new ArrayList<Company>();
        companies.add(company1);

        for(Company company: companies)
        {
            for(Employee employee: company.getEmployees())
            {
                for(Car car: employee.getCars())
                {
                    System.out.println(car.toString());
                }
            }
        }
    }
}
