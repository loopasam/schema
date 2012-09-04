package models.schema;

import java.util.*;

/**
* A music recording (track), usually a single song.
* Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/MusicRecording
*/
public class MusicRecording {

	/**
	* The artist that performed this album or recording.
	*/
	public MusicGroup byArtist;

	/**
	* The playlist to which this recording belongs.
	*/
	public MusicPlaylist inPlaylist;

	/**
	* The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601" target="new">ISO 8601 date format</a>.
	*/
	public String duration;

	/**
	* The album to which this recording belongs.
	*/
	public MusicAlbum inAlbum;

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
	* No documentation available
	*/
	public String thumbnailUrl;

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
	* The media objects that encode this creative work (legacy spelling; see singular form, encoding).
	*/
	public List<MediaObject> encodings;

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
	* The keywords/tags used to describe this content.
	*/
	public String keywords;

	/**
	* Indicates whether this content is family friendly.
	*/
	public Boolean isFamilyFriendly;

	/**
	* An embeded video object or URL associated with the content.
	*/
	public VideoObject video;

	/**
	* No documentation available
	*/
	public Person accountablePerson;

	/**
	* No documentation available
	*/
	public Integer version;

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
	public String text;

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
	* No documentation available
	*/
	public Organization sourceOrganization;

	/**
	* An embeded audio object or URL associated with the content.
	*/
	public AudioObject audio;

	/**
	* Editor for this content.
	*/
	public Person editor;

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
