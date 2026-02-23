package com.demo.que1;

public class Employee {
    int id;
    String name;
    Double salary;

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Id: "+id+" "+"Name: "+name+" "+"Salary: "+salary);
    }
}
