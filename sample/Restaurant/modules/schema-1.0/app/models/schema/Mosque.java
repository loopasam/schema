package models.schema;

import java.util.*;

/**
* A mosque.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Mosque
*/
public class Mosque {

	/**
	* The opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.<br />- Days are specified using the following two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>, <code>Fr</code>, <code>Sa</code>, <code>Su</code>.<br />- Times are specified using 24:00 time. For example, 3pm is specified as <code>15:00</code>.<br />Here is an example: <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>
	*/
	public String openingHours;

	/**
	* A URL to a map of the place.
	*/
	public String map;

	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	*/
	public AggregateRating aggregateRating;

	/**
	* Review of the item.
	*/
	public Review review;

	/**
	* Photographs of this place.
	*/
	//public Photograph photo;

	/**
	* Photographs of this place.
	*/
	//public ImageObject photo;

	/**
	* Review of the item. (legacy spelling; see singular form, review).
	*/
	public List<Review> reviews;

	/**
	* The events held at this place or organization.
	*/
	public Event event;

	/**
	* A count of a specific user interactions with this item&mdash;for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href=UserInteraction>UserInteraction</a>.
	*/
	public String interactionCount;

	/**
	* The basic containment relation between places.
	*/
	public Place containedIn;

	/**
	* Photographs of this place. (legacy spelling; see singular form, photo).
	*/
	//public List<Photograph> photos;

	/**
	* Photographs of this place. (legacy spelling; see singular form, photo).
	*/
	//public List<ImageObject> photos;

	/**
	* The events held at this place or organization. (legacy spelling; see singular form, event).
	*/
	public List<Event> events;

	/**
	* The fax number.
	*/
	public String faxNumber;

	/**
	* The geo coordinates of the place.
	*/
	//public GeoShape geo;

	/**
	* The geo coordinates of the place.
	*/
	//public GeoCoordinates geo;

	/**
	* Physical address of the item.
	*/
	public PostalAddress address;

	/**
	* A URL to a map of the place. (legacy spelling; see singular form, map).
	*/
	public List<String> maps;

	/**
	* The telephone number.
	*/
	public String telephone;

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
