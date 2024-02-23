package org.example;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    String name;
    //todo birthDate
    int age;
    int experience;
    String service;
    CAR car;
    List<CAR> cars = new ArrayList<>();

    public List<CAR> getCars() {
        return cars;
    }

    public void setCars(List<CAR> cars) {
        this.cars = cars;
    }


    public Staff() {
    }

    public Staff(String name, int age, int experience, String service, CAR car) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.service = service;
        setCar(car);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public CAR getCar() {
        return car;
    }


    public void setCar(CAR car) {
        this.car = car;
        cars.add(car);
    }

    @Override
    public String toString() {
        return "\nStaff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", service='" + service + '\'' +
                '}';
    }
}