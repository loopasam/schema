package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* Structured values are strings&mdash;for example, addresses&mdash;that have certain constraints on their structure.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/StructuredValue
*/
public class StructuredValue extends Model {

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
