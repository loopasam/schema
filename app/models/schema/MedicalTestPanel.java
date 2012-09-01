package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* No documentation available :-(
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/MedicalTestPanel
*/
public class MedicalTestPanel extends Model {

	/**
	* No documentation available :-(
	*/
	public MedicalTest subTest;

	/**
	* No documentation available :-(
	*/
	public MedicalSign signDetected;

	/**
	* No documentation available :-(
	*/
	public String normalRange;

	/**
	* No documentation available :-(
	*/
	public MedicalDevice usesDevice;

	/**
	* No documentation available :-(
	*/
	public Drug affectedBy;

	/**
	* No documentation available :-(
	*/
	public MedicalCondition usedToDiagnose;

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
