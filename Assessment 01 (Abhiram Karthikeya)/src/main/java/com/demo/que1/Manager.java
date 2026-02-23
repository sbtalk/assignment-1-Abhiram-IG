package com.demo.que1;

public class Manager extends Employee {
    private Double bonus;

    public Manager(int id, String name, Double salary,Double bonus) {
        super(id, name, salary);
        this.bonus=bonus;
    }

    @Override
    public void display(){
        System.out.println("Id: "+id+" "+"Name: "+name+" "+"Salary: "+salary+"Bonus: "+bonus);

    }
}
