package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* A utility class that serves as the umbrella for a number of 'intangible' things such as quantities, structured values, etc.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Intangible
*/
public class Intangible extends Model {

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
