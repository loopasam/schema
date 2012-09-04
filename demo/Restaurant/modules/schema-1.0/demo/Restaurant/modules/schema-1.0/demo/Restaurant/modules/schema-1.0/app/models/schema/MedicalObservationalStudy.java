package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* No documentation available :-(
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/MedicalObservationalStudy
*/
public class MedicalObservationalStudy extends Model {

	/**
	* No documentation available :-(
	*/
	public MedicalObservationalStudyDesign studyDesign;

	/**
	* No documentation available :-(
	*/
	public MedicalEntity studySubject;

	/**
	* No documentation available :-(
	*/
	public String population;

	/**
	* No documentation available :-(
	*/
	public Organization sponsor;

	/**
	* No documentation available :-(
	*/
	public MedicalStudyStatus status;

	/**
	* No documentation available :-(
	*/
	public String outcome;

	/**
	* No documentation available :-(
	*/
	public AdministrativeArea studyLocation;

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
