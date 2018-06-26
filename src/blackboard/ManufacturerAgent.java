package blackboard;

import java.util.HashMap;
import java.util.Map;

/**
 * ManufacturerAgent applies the selection criteria to select the supplier dynamically.
 */
public class ManufacturerAgent {

	Map bids = new HashMap<>();
	String selectedAgent;
	String alternativeAgent;
	
	protected void applySelectionCriteria(Map bids) {
		int sa1DeliverTime = (int) bids.get("Supplier Agent 1");
		int sa2DeliverTime = (int) bids.get("Supplier Agent 2");
		
		if (sa1DeliverTime < sa2DeliverTime) {
			this.setSelectedAgent("Supplier Agent 1");
			this.setAlternativeAgent("Supplier Agent 2");
			System.out.println("Manufacturer Agent selected: Supplier Agent 1.");
			System.out.println("Obs: If any problem occurs, Supplier Agent 2 will be the alternative supplier.");
		} else {
			this.setSelectedAgent("Supplier Agent 2");
			this.setAlternativeAgent("Supplier Agent 1");
			System.out.println("Manufacturer Agent selected: Supplier Agent 2.");
			System.out.println("Obs: If any problem occurs, Supplier Agent 1 will be the alternative supplier.");
		}
	}
	
	protected void setSelectedAgent(String selectedAgent) {
		this.selectedAgent = selectedAgent;
	}

	protected String getSelectedAgent() {
		return selectedAgent;
	}

	protected String getAlternativeAgent() {
		System.out.println("Searching for alternative agent to end the delivery.");
		return alternativeAgent;
	}

	protected void setAlternativeAgent(String alternativeAgent) {
		this.alternativeAgent = alternativeAgent;
	}
	 
}
