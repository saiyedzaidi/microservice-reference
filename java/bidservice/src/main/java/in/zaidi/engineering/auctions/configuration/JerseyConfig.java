package in.zaidi.engineering.auctions.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import in.zaidi.engineering.auctions.resource.BidResource;


/**
 * The Class JerseyConfig.
 */
@Configuration
public class JerseyConfig extends ResourceConfig {

	
	/**
	 * Instantiates a new jersey config.
	 */
	public JerseyConfig() {
		register(BidResource.class);
	}

}

