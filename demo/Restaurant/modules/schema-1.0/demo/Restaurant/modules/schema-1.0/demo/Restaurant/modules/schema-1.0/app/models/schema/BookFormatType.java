package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* The publication format of the book.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/BookFormatType
*/
public class BookFormatType extends Model {

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
