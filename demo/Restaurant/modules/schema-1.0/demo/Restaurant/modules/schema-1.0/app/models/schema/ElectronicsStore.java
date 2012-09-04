package models.schema;

import java.util.*;

/**
* An electronics store.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/ElectronicsStore
*/
public class ElectronicsStore {

	/**
	* The currency accepted (in <a href="http://en.wikipedia.org/wiki/ISO_4217" target="new">ISO 4217 currency format</a>).
	*/
	public String currenciesAccepted;

	/**
	* The larger organization that this local business is a branch of, if any.
	*/
	public Organization branchOf;

	/**
	* The price range of the business, for example <code>$$$</code>.
	*/
	public String priceRange;

	/**
	* Cash, credit card, etc.
	*/
	public String paymentAccepted;

	/**
	* The opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.<br />- Days are specified using the following two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>, <code>Fr</code>, <code>Sa</code>, <code>Su</code>.<br />- Times are specified using 24:00 time. For example, 3pm is specified as <code>15:00</code>.<br />Here is an example: <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>
	*/
	public String openingHours;

	/**
	* People working for this organization. (legacy spelling; see singular form, employee).
	*/
	public List<Person> employees;

	/**
	* Email address.
	*/
	public String email;

	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	*/
	public AggregateRating aggregateRating;

	/**
	* Review of the item.
	*/
	public Review review;

	/**
	* A member of this organization.
	*/
	//public Person member;

	/**
	* A member of this organization.
	*/
	//public Organization member;

	/**
	* A contact point for a person or organization.
	*/
	public ContactPoint contactPoint;

	/**
	* A person who founded this organization.
	*/
	public Person founder;

	/**
	* Review of the item. (legacy spelling; see singular form, review).
	*/
	public List<Review> reviews;

	/**
	* A member of this organization. (legacy spelling; see singular form, member).
	*/
	//public List<Person> members;

	/**
	* A member of this organization. (legacy spelling; see singular form, member).
	*/
	//public List<Organization> members;

	/**
	* The events held at this place or organization.
	*/
	public Event event;

	/**
	* The location of the event or organization.
	*/
	//public PostalAddress location;

	/**
	* The location of the event or organization.
	*/
	//public Place location;

	/**
	* A count of a specific user interactions with this item&mdash;for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href=UserInteraction>UserInteraction</a>.
	*/
	public String interactionCount;

	/**
	* A contact point for a person or organization. (legacy spelling; see singular form, contactPoint).
	*/
	public List<ContactPoint> contactPoints;

	/**
	* The events held at this place or organization. (legacy spelling; see singular form, event).
	*/
	public List<Event> events;

	/**
	* The fax number.
	*/
	public String faxNumber;

	/**
	* Physical address of the item.
	*/
	public PostalAddress address;

	/**
	* People working for this organization.
	*/
	public Person employee;

	/**
	* The date that this organization was founded.
	*/
	public Date foundingDate;

	/**
	* The telephone number.
	*/
	public String telephone;

	/**
	* A person who founded this organization. (legacy spelling; see singular form, founder).
	*/
	public List<Person> founders;

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

	/**
	* A URL to a map of the place.
	*/
	public String map;

	/**
	* Photographs of this place.
	*/
	//public Photograph photo;

	/**
	* Photographs of this place.
	*/
	//public ImageObject photo;

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
	* The geo coordinates of the place.
	*/
	//public GeoCoordinates geo;

	/**
	* The geo coordinates of the place.
	*/
	//public GeoShape geo;

	/**
	* A URL to a map of the place. (legacy spelling; see singular form, map).
	*/
	public List<String> maps;
}
