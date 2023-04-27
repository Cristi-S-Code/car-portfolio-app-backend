package com.car.portfolio.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.car.portfolio.entities.Car;
import com.car.portfolio.service.CarService;


@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService carService;
	
//	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public Car addNewCar(@Valid @RequestBody Car newCar) {
//		return carService.addCarToDb(newCar);
//		
//	}
	
	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Car addNewCar(@Valid Car newCar, @RequestParam("file") MultipartFile file) {
		try {
			newCar.setImage(file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return carService.addCarToDb(newCar);

	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Car> getAllCars(){
		return carService.addCarsToTable();
	}
	
	@GetMapping(value = "/edit/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Car> editCar(@PathVariable Long id) {
		return carService.sendCarToForm(id);
	}
	
	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Car addEditedCarToList(@RequestBody Car editedCar) {
		return carService.addCarToDb(editedCar);
	}
	
	@DeleteMapping(value = "/delete/{id}" )
	public void deleteCar(@PathVariable Long id) {
		carService.deleteCarById(id);
	}
	
	
	
	
}
