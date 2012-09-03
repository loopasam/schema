package models;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.binding.As;
import play.db.jpa.Model;


/**
 * A review of an item - for example, a restaurant, movie, or store.
 * Auto-generated class (Schema Draft Version 0.97) - More info about this type: http://schema.org/Review
 */
@Entity
public class Review extends Model {
    
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
    @ManyToOne
    public Restaurant itemReviewed;

    /**
     * No documentation available :-(
     */
    @As("yyyy-MM-dd")
    public Date dateCreated;

}
