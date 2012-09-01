package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* Quantities such as distance, time, mass, weight, etc. Particular instances of say Mass are entities like '3 Kg' or '4 milligrams'.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Quantity
*/
public class Quantity extends Model {

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
