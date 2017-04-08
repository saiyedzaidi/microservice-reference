package in.zaidi.engineering.auctions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The Class BidServiceApplication.
 */

@EnableDiscoveryClient
@SpringBootApplication
public class BidServiceApplication {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(BidServiceApplication.class, args);
	}
}
