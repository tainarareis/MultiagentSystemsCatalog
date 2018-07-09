package blackboard;

import java.util.HashMap;
import java.util.Map;

/**
 * Blackboard is responsible for controlling the auction for supply distribution. 
 */
public class Blackboard {

	private static Company oliverEnterprise = new Company();
	private static ManufacturerAgent manufacturerAgent = new ManufacturerAgent();
	private static Map auctionInformations = new HashMap<>();
	private static Map bids = new HashMap<>();
	
	private static SupplierAgent1 supplierAgent1 = new SupplierAgent1();
	private static SupplierAgent2 supplierAgent2 = new SupplierAgent2();
	
	public static void main(String[] args) {
		
		auctionInformations = oliverEnterprise.publishAuction();
		supplierAgent1.notifyAgent(auctionInformations);
		supplierAgent2.notifyAgent(auctionInformations);
		
		bids.put("Supplier Agent 1", supplierAgent1.bid());
		bids.put("Supplier Agent 2", supplierAgent2.bid());
		
		manufacturerAgent.applySelectionCriteria(bids);
		controlDelivery(manufacturerAgent.getSelectedAgent());

	}
	
	private static void controlDelivery(String selectedAgent) {
		
		Boolean deliveryProblems;
		
		switch (selectedAgent) {
			case "Supplier Agent 1":
				supplierAgent1.deliver();
				deliveryProblems = supplierAgent1.reportDeliveryProblems();
				if (deliveryProblems == false) {
					supplierAgent1.finishDelivery();
					break;
				} else {
					String alternativeAgent = manufacturerAgent.getAlternativeAgent();
					controlDelivery(alternativeAgent);
					break;
				}
			case "Supplier Agent 2":
				supplierAgent2.deliver();
				deliveryProblems = supplierAgent2.reportDeliveryProblems();
				if (deliveryProblems == false) {
					supplierAgent2.finishDelivery();
					break;
				} else {
					String alternativeAgent = manufacturerAgent.getAlternativeAgent();
					controlDelivery(alternativeAgent);
				}
		}
	}
}
