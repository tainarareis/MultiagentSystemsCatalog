package blackboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * A company is interested in having a certain product delivered.
 * So, it can publish an auction at the Blackboard to ask an agent to do it.
 */
public class Company {

	Map auctionInformations = new HashMap<>();
	
	public Company() {
		this.auctionInformations.put("Company Name", "Oliver Enterprise");
		this.auctionInformations.put("Delivery Adress", "324 Street - Salt Lake - UT \n");
		this.auctionInformations.put("Product Name", "Wall paint");
		this.auctionInformations.put("Quantity", 20);
		this.auctionInformations.put("Time limit to deliver", 800);
	}
	
	protected Map publishAuction() {
		System.out.println("Company Oliver Enterprise publishing auction informations to Blackboard...");
		String publication = Arrays.toString(this.auctionInformations.entrySet().toArray());
		System.out.println("Publication = " + publication);
		return this.auctionInformations;
	}
}
