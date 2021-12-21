package br.com.josseanevendetti.projectspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.josseanevendetti.projectspring.model.Car;
import br.com.josseanevendetti.projectspring.repository.CarRepository;

@Service
public class CarService {
    @Autowired
    CarRepository repository;
    public boolean insert(Car car){
     return repository.insert(car);   
    }
    public List<Car> findAll(){ 
        return repository.findAll();

    }
}
