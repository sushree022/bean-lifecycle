package com.assignment.beanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class BeanLifecycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanLifecycleApplication.class, args);


		//creating container
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Department employeesOfDepartment = (Department) context.getBean("Finance");
		System.out.println(employeesOfDepartment);
	}
}
