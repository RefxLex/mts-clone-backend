package com.reflex.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tarifs")
public class Tarif {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false, columnDefinition="TEXT")
	private String description;
	
	@Column(nullable=false)
	private int gigabytes;
	
	@Column(nullable=false)
	private int minutes;
	
	@Column(nullable=false)
	private int television;
	
	@Column(nullable=false)
	private int speed;
	
	@Column(nullable=false)
	private int price;

	public Tarif() {

	}

	public Tarif(String name, String description, int gigabytes, int minutes, int television, int speed, int price) {
		this.name = name;
		this.description = description;
		this.gigabytes = gigabytes;
		this.minutes = minutes;
		this.television = television;
		this.speed = speed;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getGigabytes() {
		return gigabytes;
	}

	public void setGigabytes(int gigabytes) {
		this.gigabytes = gigabytes;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getTelevision() {
		return television;
	}

	public void setTelevision(int television) {
		this.television = television;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
