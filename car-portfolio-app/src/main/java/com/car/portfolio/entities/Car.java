package com.car.portfolio.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "cars")
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class Car {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue
	private Long id;
	
//	@Lob
//	@Type(type = "org.hibernate.type.ImageType")
//	@Column(name = "image")
//	private byte[] image;

//	@NotBlank(message = "Description cannot be blank!")
	@Column(name = "description")
	private String description;
	
	
	@Column(name = "link")
	private String link;
	
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "car_images",
			joinColumns = {
					@JoinColumn(name = "car_id")
			},
			inverseJoinColumns = {
					@JoinColumn(name = "image_id")
			}
	)
	private Set<ImageModel> carImage;
	

	

	
	
	
}
