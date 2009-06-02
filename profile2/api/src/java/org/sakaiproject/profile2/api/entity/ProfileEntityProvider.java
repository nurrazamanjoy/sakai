package uk.ac.lancs.e_science.profile2.api.entity;

import org.sakaiproject.entitybroker.entityprovider.EntityProvider;

/**
 * This is the entity provider for a user's profile.
 * 
 * @author Steve Swinsburg (s.swinsburg@lancaster.ac.uk)
 *
 */
public interface ProfileEntityProvider extends EntityProvider {

	public final static String ENTITY_PREFIX = "profile";
	
}
