package models.schema;

import java.util.*;

/**
* A contact point&mdash;for example, a Customer Complaints department.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/ContactPoint
*/
public class ContactPoint {

	/**
	* The fax number.
	*/
	public String faxNumber;

	/**
	* Email address.
	*/
	public String email;

	/**
	* The telephone number.
	*/
	public String telephone;

	/**
	* A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
	*/
	public String contactType;

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
