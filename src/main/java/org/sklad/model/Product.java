package org.sklad.model;

import java.awt.Image;

public class Product {

	int id;
	String name;
	String description;
	int availableAmount;
	double pricePerPiece;
	String imageUrl;

	public Product(
			int id,
			String name,
			String description,
			String imageUrl,
			int availableAmount,
			double pricePerPiece
	){
		this.id = id;
		this.name = name;
		this.description = description;
		this.availableAmount = availableAmount;
		this.pricePerPiece = pricePerPiece;
		this.imageUrl = imageUrl;
	}
}
