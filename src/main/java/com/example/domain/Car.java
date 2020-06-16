package com.example.domain;

public class Car {
	
	private String name;
	private String carType;
	private String color;
	private Integer speed;
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", carType=" + carType + ", color=" + color + ", speed=" + speed + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

}
