package models.schema;

import java.util.*;

/**
* The average rating based on multiple ratings or reviews.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/AggregateRating
*/
public class AggregateRating {

	/**
	* The item that is being reviewed/rated.
	*/
	public Thing itemReviewed;

	/**
	* The count of total number of reviews.
	*/
	public Integer reviewCount;

	/**
	* The count of total number of ratings.
	*/
	public Integer ratingCount;

	/**
	* The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
	*/
	//public Integer worstRating;

	/**
	* The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
	*/
	//public String worstRating;

	/**
	* The rating for the content.
	*/
	public String ratingValue;

	/**
	* The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
	*/
	//public Integer bestRating;

	/**
	* The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
	*/
	//public String bestRating;

	/**
	* No documentation available
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
