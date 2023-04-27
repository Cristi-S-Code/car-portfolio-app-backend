package com.car.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.car.portfolio.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
