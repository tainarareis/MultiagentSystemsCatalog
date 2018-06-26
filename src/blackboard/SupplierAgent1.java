package blackboard;

import java.util.Map;

/**
 * SupplierAgent1 has its own inventory and time to deliver.
 */
public class SupplierAgent1 extends SupplierAgent{
	
	public SupplierAgent1() {
		super();
		this.inventory.put("Roof tile", 60);
		this.inventory.put("Brick", 58);
		this.inventory.put("Wooden door", 85);
		this.inventory.put("Wall paint", 74);
		this.timeToDeliver = 90;
		System.out.println("Supplier Agent 1 added to Blackboard.");
	}
	
	protected void notifyAgent (Map auctionInformations) {
		this.auctionInformation = auctionInformations;
		System.out.println("Supplier Agent 1: Notified.");
	}
	
	protected int bid () {
		int auctiontimeLimit = (int) this.auctionInformation.get("Time limit to deliver");
		if (this.getTimeToDeliver() <= auctiontimeLimit) {
			System.out.println("Supplier Agent 1, Bid = " + this.getTimeToDeliver() +".");
			return this.getTimeToDeliver();
		} else {
			System.out.println("Supplier Agent 1, Bid = None.");
			return 0;
		}
	}
	
	protected void deliver () {
		System.out.println("Supplier Agent 1 delivering " + this.auctionInformation.get("Product Name") +".");
	}

	protected Boolean reportDeliveryProblems() {
		System.out.println("Supplier Agent 1 facing problems to deliver.");
		return true;
	}

	protected void finishDelivery() {
		System.out.println("Supplier Agent 1 finished delivery on time.");
		this.removeProductQuantity((String) this.auctionInformation.get("Product Name"), (int) this.auctionInformation.get("Quantity"));
	}
	
}