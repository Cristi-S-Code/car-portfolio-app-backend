package com.car.portfolio.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
	
//	@Autowired
//	private CarDataRepository carDataRepository;
	
//	private final String FOLDER_PATH = "D:\\Aplicatii-Web\\aplicatie veziv.ro\\MyImages";
	
	// car methods
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
	
	//carData methods
	
//	public String uploadImageToFileSystem (MultipartFile file) throws IOException {
//		String imagePath = FOLDER_PATH+file.getOriginalFilename();
//		CarData carData = carDataRepository.save(CarData.builder()
//				.imagePath(imagePath).build());
//		
//		file.transferTo(new File(imagePath));
//		
//		if (carData != null) {
//			return "file uploaded succesfully : " + imagePath;
//		}
//		
//		return null;
//	}
	
//	public byte[] downloadImageFromFileSystem(String fileName) {
//		
//	}
	
	
	
	
	}
