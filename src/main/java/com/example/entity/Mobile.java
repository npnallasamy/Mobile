package com.example.entity;

// Mobile Entity Class

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Mobile {
	
	@Id
	@GeneratedValue
	private Integer prod_id;
	private Integer price;
	private String brand;
	private String ram;
	private Integer rating;
	public Integer getProd_id() {
		return prod_id;
	}
	public void setProd_id(Integer prod_id) {
		this.prod_id = prod_id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Mobile [prod_id=" + prod_id + ", price=" + price + ", brand=" + brand + ", ram=" + ram + ", rating="
				+ rating + "]";
	}
	
	

}
