package models.schema;

import play.db.jpa.Model;

import java.util.*;

/**
* A person (alive, dead, undead, or fictional).
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Person
*/
public class Person extends Model {

	/**
	* The person's spouse.
	*/
	public Person spouse;

	/**
	* Organizations that the person works for.
	*/
	public Organization worksFor;

	/**
	* Awards won by this person or for this creative work. (legacy spelling; see singular form, award).
	*/
	public List<String> awards;

	/**
	* A sibling of the person. (legacy spelling; see singular form, sibling).
	*/
	public List<Person> siblings;

	/**
	* Gender of the person.
	*/
	public String gender;

	/**
	* A contact point for a person or organization.
	*/
	public ContactPoint contactPoint;

	/**
	* The most generic uni-directional social relation.
	*/
	public Person follows;

	/**
	* A parents of the person. (legacy spelling; see singular form, parent).
	*/
	public List<Person> parents;

	/**
	* A child of the person.
	*/
	public Person children;

	/**
	* An organization to which the person belongs.
	*/
	public Organization memberOf;

	/**
	* No documentation available :-(
	*/
	public String additionalName;

	/**
	* A colleague of the person. (legacy spelling; see singular form, colleague).
	*/
	public List<Person> colleagues;

	/**
	* A contact point for a person or organization. (legacy spelling; see singular form, contactPoint).
	*/
	public List<ContactPoint> contactPoints;

	/**
	* Date of birth.
	*/
	public Date birthDate;

	/**
	* Nationality of the person.
	*/
	public Country nationality;

	/**
	* Event that this person is a performer or participant in.
	*/
	public Event performerIn;

	/**
	* The fax number.
	*/
	public String faxNumber;

	/**
	* Physical address of the item.
	*/
	public PostalAddress address;

	/**
	* No documentation available :-(
	*/
	public String honorificPrefix;

	/**
	* The job title of the person (for example, Financial Manager).
	*/
	public String jobTitle;

	/**
	* No documentation available :-(
	*/
	public String honorificSuffix;

	/**
	* Date of death.
	*/
	public Date deathDate;

	/**
	* No documentation available :-(
	*/
	public String familyName;

	/**
	* A contact location for a person's residence.
	*/
	//public ContactPoint homeLocation;

	/**
	* A contact location for a person's residence.
	*/
	//public Place homeLocation;

	/**
	* A contact location for a person's place of work.
	*/
	//public ContactPoint workLocation;

	/**
	* A contact location for a person's place of work.
	*/
	//public Place workLocation;

	/**
	* An educational organizations that the person is an alumni of.
	*/
	public EducationalOrganization alumniOf;

	/**
	* Email address.
	*/
	public String email;

	/**
	* Awards won by this person or for this creative work.
	*/
	public String award;

	/**
	* An organization that this person is affiliated with. For example, a school/university, a club, or a team.
	*/
	public Organization affiliation;

	/**
	* A count of a specific user interactions with this item&mdash;for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href=UserInteraction>UserInteraction</a>.
	*/
	public String interactionCount;

	/**
	* A colleague of the person.
	*/
	public Person colleague;

	/**
	* The most generic familial relation.
	*/
	public Person relatedTo;

	/**
	* No documentation available :-(
	*/
	public String givenName;

	/**
	* A sibling of the person.
	*/
	public Person sibling;

	/**
	* The most generic bi-directional social/work relation.
	*/
	public Person knows;

	/**
	* The telephone number.
	*/
	public String telephone;

	/**
	* A parents of the person.
	*/
	public Person parent;

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
