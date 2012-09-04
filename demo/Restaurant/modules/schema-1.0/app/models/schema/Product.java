package models.schema;

import java.util.*;

/**
* A product is anything that is made available for sale&mdash;for example, a pair of shoes, a concert ticket, or a car.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Product
*/
public class Product {

	/**
	* Review of the item. (legacy spelling; see singular form, review).
	*/
	public List<Review> reviews;

	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	*/
	public AggregateRating aggregateRating;

	/**
	* The brand of the product.
	*/
	public Organization brand;

	/**
	* The manufacturer of the product.
	*/
	public Organization manufacturer;

	/**
	* An offer to sell this item&mdash;for example, an offer to sell a product, the DVD of a movie, or tickets to an event.
	*/
	public Offer offers;

	/**
	* The product identifier, such as ISBN. For example: <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>.
	*/
	public String productID;

	/**
	* The model of the product.
	*/
	public String model;

	/**
	* Review of the item.
	*/
	public Review review;

	/**
	* URL of the item.
	*/
	public String url;

	/**
	* URL of an image of the item.
	*/
	public String image;

	/**
	* The name of the item.
	*/
	public String name;

	/**
	* No documentation available
	*/
	public String additionalType;

	/**
	* A short description of the item.
	*/
	public String description;
}
