package models;

import java.util.*;


/**
 * A review of an item - for example, a restaurant, movie, or store.
 * Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Review
 */
public class Review {
    
    /**
     * The name of the item.
     */
    public String name;

    /**
     * The actual body of the review
     */
    public String reviewBody;

    /**
     * The item that is being reviewed/rated.
     */
    public Restaurant itemReviewed;

    /**
     * No documentation available :-(
     */
    public Date dateCreated;


}
