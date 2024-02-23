package org.example.config;

import org.example.Staff;
import org.example.CAR;
import org.example.parts;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.example.Main.id;

@Configuration
public class CarshopConfig {
    @Bean(value = "Camry")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    CAR creatCar() {
        return new CAR();
    }

    @Bean(name = "tesla")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    CAR creatCAR() {
        return new CAR(id++, "Tesla", "ModelX");
    }
    @Bean(name = "Hyundai")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    CAR creatElectroCAR() {
        return new CAR(id++, "Hyundai", "Elantra");
    }


    @Bean("erezhep")
    Staff erezhepCar(){
        Staff erezhep = new Staff(
                "Erezhep",
                19,
                2,
                "engine repair",
                creatElectroCAR());

        return erezhep;

    }
    @Bean("talant")
    Staff talantCar(){
        Staff talant = new Staff(
                "Talant",
                23,
                5,
                "oil change",
                creatCar());

        return talant;

    }

    @Bean("nurss")
    Staff nurssCar(){
        Staff nurss = new Staff(
                "Nursultan",
                22,
                3,
                "wheel change",
                creatCar());

        return nurss;

    }
//todo client -> car,
//  client buy parts from shop
//  car -> use bought parts to service it


}