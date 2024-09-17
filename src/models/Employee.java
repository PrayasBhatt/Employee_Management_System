package models;

import java.util.ArrayList;

public class Employee {
    int Id;
    String Name;
    String Address;
    double Number;
    String Email;
    ArrayList<Salary> salary;
    Building Building;
    Field field;
    Workhour WorkingHours;

    public Employee(int id, String name, String address, double number, String email, ArrayList<Salary> salary, models.Building building, Field field, Workhour workingHours) {
        Id = id;
        Name = name;
        Address = address;
        Number = number;
        Email = email;
        this.salary = salary;
        Building = building;
        this.field = field;
        WorkingHours = workingHours;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getNumber() {
        return Number;
    }

    public void setNumber(double number) {
        Number = number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public ArrayList<Salary> getSalary() {
        return salary;
    }

    public void setSalary(ArrayList<Salary> salary) {
        this.salary = salary;
    }

    public models.Building getBuilding() {
        return Building;
    }

    public void setBuilding(models.Building building) {
        Building = building;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Workhour getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(Workhour workingHours) {
        WorkingHours = workingHours;
    }


}
