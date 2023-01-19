package main.java.com.example.lists.companyexample;

import java.util.ArrayList;

public class Employee {
    private String firstName;
    private String lastName;

    private String NIF;

    private ArrayList<Car> cars;

    public Employee() {}

    public Employee(String firstName, String lastName, String NIF, ArrayList<Car> cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.NIF = NIF;
        this.cars = cars;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", NIF='" + NIF + '\'' +
                ", cars=" + cars +
                '}';
    }
}
