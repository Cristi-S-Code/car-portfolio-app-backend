package com.car.portfolio.entities;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "cars")
public class Car {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@NotNull
	private Long id;
	
	@Lob
	@Type(type = "org.hibernate.type.ImageType")
	@Column(name = "image")
	private byte[] image;

	@NotBlank(message = "Description cannot be blank!")
	@Column(name = "description")
	private String description;
	
	
	@Column(name = "link")
	private String link;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

//	public Blob getImage() {
//		return image;
//	}
//
//	public void setImage(Blob image) {
//		this.image = image;
//	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	
	
}
