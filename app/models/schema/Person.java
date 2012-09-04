package models.schema;

import java.util.*;

/**
* A person (alive, dead, undead, or fictional).
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Person
*/
public class Person {

	/**
	* A contact point for a person or organization. (legacy spelling; see singular form, contactPoint).
	*/
	public List<ContactPoint> contactPoints;

	/**
	* A count of a specific user interactions with this item&mdash;for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href=UserInteraction>UserInteraction</a>.
	*/
	public String interactionCount;

	/**
	* A sibling of the person.
	*/
	public Person sibling;

	/**
	* The person's spouse.
	*/
	public Person spouse;

	/**
	* The most generic familial relation.
	*/
	public Person relatedTo;

	/**
	* Awards won by this person or for this creative work.
	*/
	public String award;

	/**
	* No documentation available
	*/
	public String familyName;

	/**
	* An organization to which the person belongs.
	*/
	public Organization memberOf;

	/**
	* A contact location for a person's place of work.
	*/
	//public ContactPoint workLocation;

	/**
	* A contact location for a person's place of work.
	*/
	//public Place workLocation;

	/**
	* Date of death.
	*/
	public Date deathDate;

	/**
	* An educational organizations that the person is an alumni of.
	*/
	public EducationalOrganization alumniOf;

	/**
	* The job title of the person (for example, Financial Manager).
	*/
	public String jobTitle;

	/**
	* A child of the person.
	*/
	public Person children;

	/**
	* Physical address of the item.
	*/
	public PostalAddress address;

	/**
	* An organization that this person is affiliated with. For example, a school/university, a club, or a team.
	*/
	public Organization affiliation;

	/**
	* The most generic bi-directional social/work relation.
	*/
	public Person knows;

	/**
	* A parents of the person.
	*/
	public Person parent;

	/**
	* No documentation available
	*/
	public String givenName;

	/**
	* Organizations that the person works for.
	*/
	public Organization worksFor;

	/**
	* No documentation available
	*/
	public String honorificPrefix;

	/**
	* A contact location for a person's residence.
	*/
	//public ContactPoint homeLocation;

	/**
	* A contact location for a person's residence.
	*/
	//public Place homeLocation;

	/**
	* A colleague of the person.
	*/
	public Person colleague;

	/**
	* The fax number.
	*/
	public String faxNumber;

	/**
	* A colleague of the person. (legacy spelling; see singular form, colleague).
	*/
	public List<Person> colleagues;

	/**
	* Gender of the person.
	*/
	public String gender;

	/**
	* A sibling of the person. (legacy spelling; see singular form, sibling).
	*/
	public List<Person> siblings;

	/**
	* No documentation available
	*/
	public String additionalName;

	/**
	* The telephone number.
	*/
	public String telephone;

	/**
	* Awards won by this person or for this creative work. (legacy spelling; see singular form, award).
	*/
	public List<String> awards;

	/**
	* Date of birth.
	*/
	public Date birthDate;

	/**
	* A parents of the person. (legacy spelling; see singular form, parent).
	*/
	public List<Person> parents;

	/**
	* The most generic uni-directional social relation.
	*/
	public Person follows;

	/**
	* Event that this person is a performer or participant in.
	*/
	public Event performerIn;

	/**
	* A contact point for a person or organization.
	*/
	public ContactPoint contactPoint;

	/**
	* No documentation available
	*/
	public String honorificSuffix;

	/**
	* Email address.
	*/
	public String email;

	/**
	* Nationality of the person.
	*/
	public Country nationality;

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

	/**
	* No documentation available
	*/
	public String additionalType;

	/**
	* A short description of the item.
	*/
	public String description;
}
