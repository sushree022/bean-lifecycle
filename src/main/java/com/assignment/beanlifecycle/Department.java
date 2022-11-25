package com.assignment.beanlifecycle;

import java.util.List;

public class Department {
    //instance of Employee is created
    private List<Employee> employees;

    //getter & setter
    public List<Employee> getEmployees(){
        return employees;
    }
    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }
    //over-ride toString method
    @Override
    public String toString() {
        return "Department{" +
                "employees=" + employees +
                '}';
    }

}
