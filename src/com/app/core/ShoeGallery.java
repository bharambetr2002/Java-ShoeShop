package com.app.core;

public class ShoeGallery {
	private static int idCounter=000;
	private int shoeId;
	private String name;
	private String brand;
	private int ratings;
	private double price;
	private boolean isAvailble;
	private ShoeType type;
	
	public ShoeGallery( String name, String brand, int ratings, double price, boolean isAvailble, ShoeType type) {
		super();
		this.shoeId = ++idCounter;
		this.name = name;
		this.brand = brand;
		this.ratings = ratings;
		this.price = price;
		this.isAvailble = isAvailble;
		this.type = type;
	}
	
	public ShoeGallery(int shoeId) {
		super();
		this.shoeId = shoeId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoeGallery other = (ShoeGallery) obj;
		return shoeId == other.shoeId;
	}

	@Override
	public String toString() {
		return "ShoeGallery [shoeId=" + shoeId + ", name=" + name + ", brand=" + brand + ", ratings=" + ratings
				+ ", price=" + price + ", isAvailble=" + isAvailble + ", type=" + type + "]";
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		ShoeGallery.idCounter = idCounter;
	}

	public int getShoeId() {
		return shoeId;
	}

	public void setShoeId(int shoeId) {
		this.shoeId = shoeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailble() {
		return isAvailble;
	}

	public void setAvailble(boolean isAvailble) {
		this.isAvailble = isAvailble;
	}

	public ShoeType getType() {
		return type;
	}

	public void setType(ShoeType type) {
		this.type = type;
	}
	
	
}
