package blackboard;

import java.util.HashMap;
import java.util.Map;

/**
 * Each Supplier Agent has an inventory with a collection of products available,
 * and a certain time to deliver. This agent can participate of company's auctions.
 * If an auction is published at the Blackboard and the Supplier Agent has the called
 * product, it can offer its service to to Company.
 */
public class SupplierAgent {
	
	Map<Object, Object> inventory = new HashMap<>();
	int timeToDeliver;
	Map<Object, Object> auctionInformation = new HashMap<>();
			
	protected void addProduct(String productName, int code) {
		this.inventory.put(code, productName);
	}
	
	protected void removeProductQuantity(String productName, int quantity) {
		int oldQuantity = (int) this.inventory.get(productName);
		this.inventory.put(productName, oldQuantity-quantity);
	}
	
	protected int getTimeToDeliver() {
		return this.timeToDeliver;
	}

}
