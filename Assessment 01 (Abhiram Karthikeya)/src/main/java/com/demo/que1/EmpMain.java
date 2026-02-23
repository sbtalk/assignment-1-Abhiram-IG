package com.demo.que1;

public class EmpMain {
    public static void main(String[] args){
        //Using Employee class
        Employee e1 = new Employee(10,"Abhi", 55000.0);
        e1.display();

        //Using Manager class to display (polymorphism)
        Employee e2 = new Manager(20,"Ram",71000.0,5000.0);
        e2.display();
    }
}
