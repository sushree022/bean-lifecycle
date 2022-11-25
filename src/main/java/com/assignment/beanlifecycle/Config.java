package com.assignment.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    //set details of employees

    @Bean(name = "employee1")
    public Employee firstEmployee(){
        Employee employee1 = new Employee();
        employee1.setId(1002);
        employee1.setName("Akash");
        employee1.setAge(25);
        return employee1;
    }
    @Bean(name = "employee2")
    public Employee secondEmployee(){
        Employee employee2 = new Employee();
        employee2.setId(1005);
        employee2.setName("Rahul");
        employee2.setAge(27);
        return employee2;
    }
    //create department bean
    @Bean(name = "Finance")
    public Department Finance(){
        Department finance = new Department();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(firstEmployee());
        employeeList.add(secondEmployee());
        finance.setEmployees(employeeList);
        return finance;
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean is getting created");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean is getting destroyed");
    }
}
