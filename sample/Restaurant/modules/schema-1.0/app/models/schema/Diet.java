package models.schema;

import java.util.*;

/**
* No documentation available
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Diet
*/
public class Diet {

	/**
	* No documentation available
	*/
	public String dietFeatures;

	/**
	* No documentation available
	*/
	public String risks;

	/**
	* No documentation available
	*/
	public String overview;

	/**
	* No documentation available
	*/
	//public Person endorsers;

	/**
	* No documentation available
	*/
	//public Organization endorsers;

	/**
	* No documentation available
	*/
	public String proprietaryName;

	/**
	* No documentation available
	*/
	public String expertConsiderations;

	/**
	* No documentation available
	*/
	public String physiologicalBenefits;

	/**
	* No documentation available
	*/
	public MedicalTherapy duplicateTherapy;

	/**
	* No documentation available
	*/
	public MedicalEntity seriousAdverseOutcome;

	/**
	* No documentation available
	*/
	public MedicalIndication indication;

	/**
	* No documentation available
	*/
	public MedicalContraindication contraindication;

	/**
	* No documentation available
	*/
	public MedicalEntity adverseOutcome;

	/**
	* No documentation available
	*/
	public MedicalCode code;

	/**
	* No documentation available
	*/
	public MedicalSpecialty relevantSpecialty;

	/**
	* No documentation available
	*/
	public Organization recognizingAuthority;

	/**
	* No documentation available
	*/
	public MedicalStudy study;

	/**
	* No documentation available
	*/
	public MedicineSystem medicineSystem;

	/**
	* No documentation available
	*/
	public MedicalGuideline guideline;

	/**
	* No documentation available
	*/
	public String alternateName;

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

	/**
	* No documentation available
	*/
	//public Person contributor;

	/**
	* No documentation available
	*/
	//public Organization contributor;

	/**
	* No documentation available
	*/
	public String discussionUrl;

	/**
	* Awards won by this person or for this creative work. (legacy spelling; see singular form, award).
	*/
	public List<String> awards;

	/**
	* Review of the item.
	*/
	public Review review;

	/**
	* No documentation available
	*/
	public UserComments comment;

	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	*/
	public AggregateRating aggregateRating;

	/**
	* An embeded video object or URL associated with the content.
	*/
	public VideoObject video;

	/**
	* The media objects that encode this creative work (legacy spelling; see singular form, encoding).
	*/
	public List<MediaObject> encodings;

	/**
	* No documentation available
	*/
	public String thumbnailUrl;

	/**
	* Review of the item. (legacy spelling; see singular form, review).
	*/
	public List<Review> reviews;

	/**
	* No documentation available
	*/
	//public Person creator;

	/**
	* No documentation available
	*/
	//public Organization creator;

	/**
	* No documentation available
	*/
	public Organization sourceOrganization;

	/**
	* The keywords/tags used to describe this content.
	*/
	public String keywords;

	/**
	* Indicates whether this content is family friendly.
	*/
	public Boolean isFamilyFriendly;

	/**
	* No documentation available
	*/
	public Person accountablePerson;

	/**
	* An offer to sell this item&mdash;for example, an offer to sell a product, the DVD of a movie, or tickets to an event.
	*/
	public Offer offers;

	/**
	* No documentation available
	*/
	public Date dateModified;

	/**
	* Genre of the creative work
	*/
	public String genre;

	/**
	* No documentation available
	*/
	public MediaObject associatedMedia;

	/**
	* No documentation available
	*/
	public Date dateCreated;

	/**
	* Official rating of a piece of content&mdash;for example,'MPAA PG-13'.
	*/
	public String contentRating;

	/**
	* No documentation available
	*/
	public Integer copyrightYear;

	/**
	* The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangabely.
	*/
	//public Person author;

	/**
	* The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangabely.
	*/
	//public Organization author;

	/**
	* No documentation available
	*/
	public String publishingPrinciples;

	/**
	* No documentation available
	*/
	public Integer version;

	/**
	* Awards won by this person or for this creative work.
	*/
	public String award;

	/**
	* No documentation available
	*/
	public String alternativeHeadline;

	/**
	* No documentation available
	*/
	//public Person copyrightHolder;

	/**
	* No documentation available
	*/
	//public Organization copyrightHolder;

	/**
	* No documentation available
	*/
	public Audience audience;

	/**
	* The media objects that encode this creative work
	*/
	public MediaObject encoding;

	/**
	* The language of the content. please use one of the language codes from the <a href=http://tools.ietf.org/html/bcp47>IETF BCP 47 standard.</a>
	*/
	public String inLanguage;

	/**
	* The location of the content.
	*/
	public Place contentLocation;

	/**
	* No documentation available
	*/
	public String text;

	/**
	* A count of a specific user interactions with this item&mdash;for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href=UserInteraction>UserInteraction</a>.
	*/
	public String interactionCount;

	/**
	* No documentation available
	*/
	public Thing mentions;

	/**
	* The subject matter of the content.
	*/
	public Thing about;

	/**
	* No documentation available
	*/
	//public Person provider;

	/**
	* No documentation available
	*/
	//public Organization provider;

	/**
	* Date of first broadcast/publication.
	*/
	public Date datePublished;

	/**
	* The publisher of the creative work.
	*/
	public Organization publisher;

	/**
	* Headline of the article
	*/
	public String headline;

	/**
	* An embeded audio object or URL associated with the content.
	*/
	public AudioObject audio;

	/**
	* Editor for this content.
	*/
	public Person editor;
}
