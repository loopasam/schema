package models.schema;

import java.util.*;

/**
* Nutritional information about the recipe.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/NutritionInformation
*/
public class NutritionInformation {

	/**
	* The serving size, in terms of the number of volume or mass
	*/
	public String servingSize;

	/**
	* The number of milligrams of sodium.
	*/
	public Mass sodiumContent;

	/**
	* The number of grams of protein.
	*/
	public Mass proteinContent;

	/**
	* The number of grams of sugar.
	*/
	public Mass sugarContent;

	/**
	* The number of grams of fiber.
	*/
	public Mass fiberContent;

	/**
	* The number of grams of trans fat.
	*/
	public Mass transFatContent;

	/**
	* The number of calories
	*/
	public Energy calories;

	/**
	* The number of grams of saturated fat.
	*/
	public Mass saturatedFatContent;

	/**
	* The number of grams of carbohydrates.
	*/
	public Mass carbohydrateContent;

	/**
	* The number of milligrams of cholesterol.
	*/
	public Mass cholesterolContent;

	/**
	* The number of grams of unsaturated fat.
	*/
	public Mass unsaturatedFatContent;

	/**
	* The number of grams of fat.
	*/
	public Mass fatContent;

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
