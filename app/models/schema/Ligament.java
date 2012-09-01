package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* No documentation available :-(
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Ligament
*/
public class Ligament extends Model {

	/**
	* No documentation available :-(
	*/
	public AnatomicalStructure subStructure;

	/**
	* No documentation available :-(
	*/
	public MedicalTherapy relatedTherapy;

	/**
	* No documentation available :-(
	*/
	public AnatomicalStructure connectedTo;

	/**
	* No documentation available :-(
	*/
	public String bodyLocation;

	/**
	* No documentation available :-(
	*/
	public String function;

	/**
	* No documentation available :-(
	*/
	public MedicalCondition relatedCondition;

	/**
	* No documentation available :-(
	*/
	public ImageObject diagram;

	/**
	* No documentation available :-(
	*/
	public String associatedPathophysiology;

	/**
	* No documentation available :-(
	*/
	public AnatomicalSystem partOfSystem;

	/**
	* No documentation available :-(
	*/
	public String alternateName;

	/**
	* No documentation available :-(
	*/
	public MedicalGuideline guideline;

	/**
	* No documentation available :-(
	*/
	public MedicalStudy study;

	/**
	* No documentation available :-(
	*/
	public MedicalSpecialty relevantSpecialty;

	/**
	* No documentation available :-(
	*/
	public Organization recognizingAuthority;

	/**
	* No documentation available :-(
	*/
	public MedicineSystem medicineSystem;

	/**
	* No documentation available :-(
	*/
	public MedicalCode code;

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
