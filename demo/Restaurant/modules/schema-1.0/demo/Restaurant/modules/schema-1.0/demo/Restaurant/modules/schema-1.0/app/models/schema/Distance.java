package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* Properties that take Distances as values are of the form '&lt;Number&gt; &lt;Length unit of measure&gt;'. E.g., '7 ft'
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Distance
*/
public class Distance extends Model {

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
