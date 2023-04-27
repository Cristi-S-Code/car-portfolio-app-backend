package com.car.portfolio.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.car.portfolio.dao.CarRepository;
import com.car.portfolio.entities.Car;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;


@Service
public class CarService {
	private static final Logger logger = LoggerFactory.getLogger(CarService.class);

	@Autowired
	private CarRepository carRepository;
	
	// This method is for populating the DB with an pre-maked list
//	private void populateCarList() {
//		try {
//			if (carRepository.count() == 0) {
//				Resource resource = new ClassPathResource("cars.csv");
//				CsvSchema schema = CsvSchema.emptySchema().withHeader();
//				CsvMapper mapper = new CsvMapper();
//				MappingIterator<Car> iterator = mapper.readerFor(Car.class).with(schema)
//						.readValues(resource.getInputStream());
//				carRepository.saveAll(iterator.readAll());
//			} 
//		} catch (IOException e) {
//				logger.error("An error occurred while populating cars.", e);
//			}
//		}
	
	public Car addCarToDb(Car car) {
		return carRepository.save(car);
	}
	
	public List<Car> addCarsToTable() {
		return carRepository.findAll();
	}
	
	public Optional<Car> sendCarToForm(Long id) {
		return carRepository.findById(id);
	}
	
	public void deleteCarById(Long id) {
		carRepository.deleteById(id);
	}
	
	
	}
