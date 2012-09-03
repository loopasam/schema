package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* Natural languages such as Spanish, Tamil, Hindi, English, etc. and programming languages such as Scheme and Lisp.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Language
*/
public class Language extends Model {

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
