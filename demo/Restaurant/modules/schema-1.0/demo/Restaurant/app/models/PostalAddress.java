package models;

import java.util.*;

import javax.persistence.Entity;

import play.db.jpa.Model;

/**
* The mailing address.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/PostalAddress
*/
@Entity
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
	public String addressCountry;

}
