package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* A college, university, or other third-level educational institution.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/CollegeOrUniversity
*/
public class CollegeOrUniversity extends Model {

	/**
	* Alumni of educational organization.
	*/
	public Person alumni;

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
