package org.hope.example1;

import org.hope.example1.beans.Vehicle;
import org.hope.example1.config.ProjectConfig;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Example1Application {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		v.setName("audi");

		System.out.println("with out creating appliaction-context container:- "+v.getName());

		var contxt = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Vehicle veh =  contxt.getBean(Vehicle.class);

		System.out.println("with out creating appliaction-context container:- "+veh.getName());

	}

}
