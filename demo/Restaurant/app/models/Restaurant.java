package models;

import java.util.*;

/**
* A restaurant.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Restaurant
*/
public class Restaurant {

	/**
	* The opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.<br />- Days are specified using the following two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>, <code>Fr</code>, <code>Sa</code>, <code>Su</code>.<br />- Times are specified using 24:00 time. For example, 3pm is specified as <code>15:00</code>.<br />Here is an example: <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>
	*/
	public String openingHours;

	/**
	* Review of the item. (legacy spelling; see singular form, review).
	*/
	public List<Review> reviews;

	/**
	* The location of the event or organization.
	*/
	public PostalAddress location;

	/**
	* The name of the item.
	*/
	public String name;

}
