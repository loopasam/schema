package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* User interaction: +1.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/UserPlusOnes
*/
public class UserPlusOnes extends Model {

	/**
	* The location of the event or organization.
	*/
	//public PostalAddress location;

	/**
	* The location of the event or organization.
	*/
	//public Place location;

	/**
	* The end date and time of the event (in <a href="http://en.wikipedia.org/wiki/ISO_8601" target="new">ISO 8601 date format</a>).
	*/
	public Date endDate;

	/**
	* The first broadcast date of the TV season or series.
	*/
	public Date startDate;

	/**
	* An offer to sell this item&mdash;for example, an offer to sell a product, the DVD of a movie, or tickets to an event.
	*/
	public Offer offers;

	/**
	* A person attending the event.
	*/
	//public Person attendee;

	/**
	* A person attending the event.
	*/
	//public Organization attendee;

	/**
	* The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601" target="new">ISO 8601 date format</a>.
	*/
	public String duration;

	/**
	* A person attending the event. (legacy spelling; see singular form, attendee).
	*/
	//public List<Person> attendees;

	/**
	* A person attending the event. (legacy spelling; see singular form, attendee).
	*/
	//public List<Organization> attendees;

	/**
	* Events that are a part of this event. For example, a conference event includes many presentations, each are subEvents of the conference.
	*/
	public Event subEvent;

	/**
	* The main performer or performers of the event&mdash;for example, a presenter, musician, or actor. (legacy spelling; see singular form, performer).
	*/
	//public List<Person> performers;

	/**
	* The main performer or performers of the event&mdash;for example, a presenter, musician, or actor. (legacy spelling; see singular form, performer).
	*/
	//public List<Organization> performers;

	/**
	* An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
	*/
	public Event superEvent;

	/**
	* The main performer or performers of the event&mdash;for example, a presenter, musician, or actor.
	*/
	//public Person performer;

	/**
	* The main performer or performers of the event&mdash;for example, a presenter, musician, or actor.
	*/
	//public Organization performer;

	/**
	* Events that are a part of this event. For example, a conference event includes many presentations, each are subEvents of the conference. (legacy spelling; see singular form, subEvent).
	*/
	public List<Event> subEvents;

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
