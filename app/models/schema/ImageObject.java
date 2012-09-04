package models.schema;

import java.util.*;

/**
* An image file.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/ImageObject
*/
public class ImageObject {

	/**
	* Indicates whether this image is representative of the content of the page.
	*/
	public Boolean representativeOfPage;

	/**
	* The caption for this object.
	*/
	public String caption;

	/**
	* Thumbnail image for an image or video.
	*/
	public ImageObject thumbnail;

	/**
	* exif data for this object.
	*/
	public String exifData;

	/**
	* A count of a specific user interactions with this item&mdash;for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href=UserInteraction>UserInteraction</a>.
	*/
	public String interactionCount;

	/**
	* File size in (mega/kilo) bytes.
	*/
	public String contentSize;

	/**
	* Date the content expires and is no longer useful or available. Useful for videos.
	*/
	public Date expires;

	/**
	* Indicates if use of the media require a subscription  (either paid or free). Allowed values are <code>yes</code> or <code>no</code>.
	*/
	public Boolean requiresSubscription;

	/**
	* No documentation available
	*/
	public NewsArticle associatedArticle;

	/**
	* The regions where the media is allowed. If not specified, then it's assumed to be allowed everywhere. Specify the countries in <a href="http://en.wikipedia.org/wiki/ISO_3166" target="new">ISO 3166 format</a>.
	*/
	public Place regionsAllowed;

	/**
	* A URL pointing to a player for a specific video. In general, this is the information in the <code>src</code> element of an <code>embed</code> tag and should not be the same as the content of the <code>loc</code> tag.
	*/
	public String embedUrl;

	/**
	* Actual bytes of the media object, for example the image file or video file.
	*/
	public String contentUrl;

	/**
	* mp3, mpeg4, etc.
	*/
	public String encodingFormat;

	/**
	* The width of the media object.
	*/
	public Distance width;

	/**
	* The height of the media object.
	*/
	public Distance height;

	/**
	* The creative work encoded by this media object
	*/
	public CreativeWork encodesCreativeWork;

	/**
	* The bitrate of the media object.
	*/
	public String bitrate;

	/**
	* Date when this media object was uploaded to this site.
	*/
	public Date uploadDate;

	/**
	* The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601" target="new">ISO 8601 date format</a>.
	*/
	public String duration;

	/**
	* Player type required&mdash;for example, Flash or Silverlight.
	*/
	public String playerType;

	/**
	* An offer to sell this item&mdash;for example, an offer to sell a product, the DVD of a movie, or tickets to an event.
	*/
	public Offer offers;

	/**
	* The location of the content.
	*/
	public Place contentLocation;

	/**
	* No documentation available
	*/
	public Date dateModified;

	/**
	* No documentation available
	*/
	public Organization sourceOrganization;

	/**
	* The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangabely.
	*/
	//public Person author;

	/**
	* The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangabely.
	*/
	//public Organization author;

	/**
	* The publisher of the creative work.
	*/
	public Organization publisher;

	/**
	* Awards won by this person or for this creative work.
	*/
	public String award;

	/**
	* The subject matter of the content.
	*/
	public Thing about;

	/**
	* Editor for this content.
	*/
	public Person editor;

	/**
	* No documentation available
	*/
	public String publishingPrinciples;

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
	public Integer version;

	/**
	* An embeded video object or URL associated with the content.
	*/
	public VideoObject video;

	/**
	* Indicates whether this content is family friendly.
	*/
	public Boolean isFamilyFriendly;

	/**
	* The language of the content. please use one of the language codes from the <a href=http://tools.ietf.org/html/bcp47>IETF BCP 47 standard.</a>
	*/
	public String inLanguage;

	/**
	* No documentation available
	*/
	public String thumbnailUrl;

	/**
	* No documentation available
	*/
	public String text;

	/**
	* The keywords/tags used to describe this content.
	*/
	public String keywords;

	/**
	* No documentation available
	*/
	public Date dateCreated;

	/**
	* No documentation available
	*/
	//public Person creator;

	/**
	* No documentation available
	*/
	//public Organization creator;

	/**
	* The media objects that encode this creative work
	*/
	public MediaObject encoding;

	/**
	* No documentation available
	*/
	public Integer copyrightYear;

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
	public Audience audience;

	/**
	* No documentation available
	*/
	//public Person provider;

	/**
	* No documentation available
	*/
	//public Organization provider;

	/**
	* An embeded audio object or URL associated with the content.
	*/
	public AudioObject audio;

	/**
	* Official rating of a piece of content&mdash;for example,'MPAA PG-13'.
	*/
	public String contentRating;

	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	*/
	public AggregateRating aggregateRating;

	/**
	* No documentation available
	*/
	public String alternativeHeadline;

	/**
	* No documentation available
	*/
	public UserComments comment;

	/**
	* Genre of the creative work
	*/
	public String genre;

	/**
	* Headline of the article
	*/
	public String headline;

	/**
	* Awards won by this person or for this creative work. (legacy spelling; see singular form, award).
	*/
	public List<String> awards;

	/**
	* No documentation available
	*/
	public Person accountablePerson;

	/**
	* Review of the item. (legacy spelling; see singular form, review).
	*/
	public List<Review> reviews;

	/**
	* No documentation available
	*/
	public Thing mentions;

	/**
	* Date of first broadcast/publication.
	*/
	public Date datePublished;

	/**
	* The media objects that encode this creative work (legacy spelling; see singular form, encoding).
	*/
	public List<MediaObject> encodings;

	/**
	* Review of the item.
	*/
	public Review review;

	/**
	* No documentation available
	*/
	public MediaObject associatedMedia;

	/**
	* No documentation available
	*/
	public String discussionUrl;

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
