package org.hope.example1.config;

import org.hope.example1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProjectConfig {

    @Bean(value="benzVehicle")
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Benz");
        return veh;
    }
    @Bean(name="audiVehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Bean("bmwVehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }


}
