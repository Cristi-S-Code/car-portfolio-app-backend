//package com.car.portfolio.entities;
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//
//
//@Entity
//@Table(name = "cars")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class CarData {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@Column(name = "id")
//	private Long id;
//	
//	@Column(name = "image")
//	private String imagePath;
//
//	@NotBlank(message = "Description cannot be blank!")
//	@Column(name = "description")
//	private String description;
//	
//	
//	@Column(name = "link")
//	private String link;
//
//	
//	
//	
//	
//}
