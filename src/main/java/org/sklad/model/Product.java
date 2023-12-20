package org.sklad.model;

import java.awt.*;

public class Product {

	public int id;
	public String name;
	public String description;
	public int availableAmount;
	public double pricePerPiece;
	public String imageUrl;
	public Image image;
	public boolean visible = false;
	private static int counter = 0;

	public Product(
			String name,
			String description,
			int availableAmount,
			double pricePerPiece,
			String imageUrl
	){
		this.id = provideId();
		this.name = name;
		this.description = description;
		this.availableAmount = availableAmount;
		this.pricePerPiece = pricePerPiece;
		this.imageUrl = imageUrl;
	}

	public Product(Product product){
		this.id = product.id;
		this.name = product.name;
		this.description = product.description;
		this.pricePerPiece = product.pricePerPiece;
		this.imageUrl = product.imageUrl;
	}

	public double calculateTotalPrice(){
		return availableAmount * pricePerPiece;
	}

	private static int provideId(){
		return counter++;
	}
}
