package com.practice.model;

public class Product {
	private String name;
	private String description;
//	private MultipartFile images;
//	
//	public Product() {
//		super();
//	}
//	
//	public Product(String name, String description, MultipartFile images) {
//		super();
//		this.name = name;
//		this.description = description;
//		this.images = images;
//	}
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
//	public MultipartFile getImages() {
//		return images;
//	}
//	public void setImages(MultipartFile images) {
//		this.images = images;
//	}
}
