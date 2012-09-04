package models.schema;

import java.util.*;

/**
* A country.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Country
*/
public class Country {

	/**
	* The basic containment relation between places.
	*/
	public Place containedIn;

	/**
	* The fax number.
	*/
	public String faxNumber;

	/**
	* A count of a specific user interactions with this item&mdash;for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href=UserInteraction>UserInteraction</a>.
	*/
	public String interactionCount;

	/**
	* The events held at this place or organization.
	*/
	public Event event;

	/**
	* A URL to a map of the place.
	*/
	public String map;

	/**
	* The telephone number.
	*/
	public String telephone;

	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	*/
	public AggregateRating aggregateRating;

	/**
	* A URL to a map of the place. (legacy spelling; see singular form, map).
	*/
	public List<String> maps;

	/**
	* Photographs of this place.
	*/
	//public Photograph photo;

	/**
	* Photographs of this place.
	*/
	//public ImageObject photo;

	/**
	* Physical address of the item.
	*/
	public PostalAddress address;

	/**
	* Review of the item. (legacy spelling; see singular form, review).
	*/
	public List<Review> reviews;

	/**
	* The geo coordinates of the place.
	*/
	//public GeoShape geo;

	/**
	* The geo coordinates of the place.
	*/
	//public GeoCoordinates geo;

	/**
	* The events held at this place or organization. (legacy spelling; see singular form, event).
	*/
	public List<Event> events;

	/**
	* Photographs of this place. (legacy spelling; see singular form, photo).
	*/
	//public List<Photograph> photos;

	/**
	* Photographs of this place. (legacy spelling; see singular form, photo).
	*/
	//public List<ImageObject> photos;

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
