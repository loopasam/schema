package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* When a single product that has different offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/AggregateOffer
*/
public class AggregateOffer extends Model {

	/**
	* The number of offers for the product.
	*/
	public Integer offerCount;

	/**
	* The lowest price of all offers available.
	*/
	//public Integer lowPrice;

	/**
	* The lowest price of all offers available.
	*/
	//public String lowPrice;

	/**
	* The highest price of all offers available.
	*/
	//public Integer highPrice;

	/**
	* The highest price of all offers available.
	*/
	//public String highPrice;

	/**
	* The condition of the item for sale&mdash;for example New, Refurbished, Used, etc.
	*/
	public OfferItemCondition itemCondition;

	/**
	* The seller of the product.
	*/
	public Organization seller;

	/**
	* The date after which the price is no longer available.
	*/
	public Date priceValidUntil;

	/**
	* The item being sold.
	*/
	public Product itemOffered;

	/**
	* Review of the item.
	*/
	public Review review;

	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	*/
	public AggregateRating aggregateRating;

	/**
	* The offer price of the product.
	*/
	//public Integer price;

	/**
	* The offer price of the product.
	*/
	//public String price;

	/**
	* The currency (in 3-letter <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 format</a>) of the offer price.
	*/
	public String priceCurrency;

	/**
	* Review of the item. (legacy spelling; see singular form, review).
	*/
	public List<Review> reviews;

	/**
	* The availability of this item&mdash;for example In stock, Out of stock, Pre-order, etc.
	*/
	public ItemAvailability availability;

	/**
	* No documentation available :-(
	*/
	public String additionalType;

	/**
	* A short description of the item.
	*/
	public String description;

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
}
