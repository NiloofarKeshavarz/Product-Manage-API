package com.niloofar.crud;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Product {
	
	private Long id;
	private String name;
	private String brand;
	private String madein;
	private float price;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date purchasedDate;
	private String productModel;
	private int serialNumber;

	protected Product() {
	}

	protected Product(Long id, String name, String brand, String madein, float price, Date purchasedDate, String productModel, int serialNumber) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
		this.purchasedDate = purchasedDate;
		this.productModel = productModel;
		this.serialNumber = serialNumber; 

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getMadein() {
		return madein;
	}

	public float getPrice() {
		return price;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getPurchasedDate() {
		return purchasedDate;
	}

	public String getProductModel() {
		return productModel;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
}