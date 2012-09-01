package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* No documentation available :-(
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/InfectiousDisease
*/
public class InfectiousDisease extends Model {

	/**
	* No documentation available :-(
	*/
	public String transmissionMethod;

	/**
	* No documentation available :-(
	*/
	public String infectiousAgent;

	/**
	* No documentation available :-(
	*/
	public InfectiousAgentClass infectiousAgentClass;

	/**
	* No documentation available :-(
	*/
	public String subtype;

	/**
	* No documentation available :-(
	*/
	public MedicalSignOrSymptom signOrSymptom;

	/**
	* No documentation available :-(
	*/
	public MedicalCause cause;

	/**
	* No documentation available :-(
	*/
	public DDxElement differentialDiagnosis;

	/**
	* No documentation available :-(
	*/
	//public AnatomicalStructure associatedAnatomy;

	/**
	* No documentation available :-(
	*/
	//public SuperficialAnatomy associatedAnatomy;

	/**
	* No documentation available :-(
	*/
	//public AnatomicalSystem associatedAnatomy;

	/**
	* No documentation available :-(
	*/
	public MedicalConditionStage stage;

	/**
	* No documentation available :-(
	*/
	public MedicalRiskFactor riskFactor;

	/**
	* No documentation available :-(
	*/
	public String possibleComplication;

	/**
	* No documentation available :-(
	*/
	public MedicalTherapy primaryPrevention;

	/**
	* No documentation available :-(
	*/
	public String expectedPrognosis;

	/**
	* No documentation available :-(
	*/
	public MedicalTherapy secondaryPrevention;

	/**
	* No documentation available :-(
	*/
	public String pathophysiology;

	/**
	* No documentation available :-(
	*/
	public String naturalProgression;

	/**
	* No documentation available :-(
	*/
	public String epidemiology;

	/**
	* No documentation available :-(
	*/
	public MedicalTherapy possibleTreatment;

	/**
	* No documentation available :-(
	*/
	public MedicalTest typicalTest;

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
