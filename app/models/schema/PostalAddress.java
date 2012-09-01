package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* The mailing address.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/PostalAddress
*/
public class PostalAddress extends Model {

	/**
	* The street address. For example, 1600 Amphitheatre Pkwy.
	*/
	public String streetAddress;

	/**
	* The postal code. For example, 94043.
	*/
	public String postalCode;

	/**
	* The region. For example, CA.
	*/
	public String addressRegion;

	/**
	* The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1" target="new">ISO 3166-1 alpha-2 country code</a>.
	*/
	public Country addressCountry;

	/**
	* The post offce box number for PO box addresses.
	*/
	public String postOfficeBoxNumber;

	/**
	* The locality. For example, Mountain View.
	*/
	public String addressLocality;

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
