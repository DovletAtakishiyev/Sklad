package org.sklad.model;

import java.awt.Image;

public class Product {

	int id;
	String name;
	String description;
	int availableAmount;
	double pricePerPiece;
	Image image;

	public Product(
			int id,
			String name,
			String description,
			int availableAmount,
			double pricePerPiece,
			Image image
	){
		this.id = id;
		this.name = name;
		this.description = description;
		this.availableAmount = availableAmount;
		this.pricePerPiece = pricePerPiece;
		this.image = image;
	}
}
