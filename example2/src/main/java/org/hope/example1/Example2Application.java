package org.hope.example1;

import org.hope.example1.beans.Vehicle;
import org.hope.example1.config.ProjectConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Example2Application {

	public static void main(String[] args) {

		var contxt = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Vehicle veh =  contxt.getBean("vehicle2",Vehicle.class);

		System.out.println("with creating appliaction-context container:- "+veh.getName());

	}

}
