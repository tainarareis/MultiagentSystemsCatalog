package blackboard;

import java.util.HashMap;
import java.util.Map;

/**
 * SupplierAgent2 has its own inventory and time to deliver.
 */
public class SupplierAgent2 extends SupplierAgent{
	
	public SupplierAgent2() {
		super();
		this.inventory.put("Tile", 95);
		this.inventory.put("Sand", 86);
		this.inventory.put("Eletrical wiring", 21);
		this.inventory.put("Wall paint", 74);
		this.timeToDeliver = 100;
		System.out.println("Supplier Agent 2 added to Blackboard.");
	}
	
	protected void notifyAgent (Map auctionInformations) {
		this.auctionInformation = auctionInformations;
		System.out.println("Supplier Agent 2: Notified.");
	}
	
	protected int bid() {
		int auctiontimeLimit = (int) this.auctionInformation.get("Time limit to deliver");
		if (this.getTimeToDeliver() <= auctiontimeLimit) {
			System.out.println("Supplier Agent 2, Bid = " + this.getTimeToDeliver() +".");
			return this.getTimeToDeliver();
		} else {
			System.out.println("Supplier Agent 2, Bid = None");
			return 0;
		}
	}
	
	protected void deliver() {
		System.out.println("Supplier Agent 2 delivering " + this.auctionInformation.get("Product Name") +".");
	}
	
	protected Boolean reportDeliveryProblems() {
		System.out.println("Supplier Agent 2 facing no problems to deliver.");
		return false;
	}
	
	protected void finishDelivery() {
		System.out.println("Supplier Agent 2 finished delivery on time.");
	}
	
}