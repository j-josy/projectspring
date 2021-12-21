package br.com.josseanevendetti.projectspring.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.josseanevendetti.projectspring.model.Car;


@Repository
public class CarRepository {
   private List<Car> ListOfCars = new  ArrayList <>();

public boolean insert (Car car) {
    return ListOfCars.add(car);
}
public List<Car> findAll() {
    return ListOfCars;
}
    
}
