package macron;

import java.util.HashMap;
import java.util.Map;

public class OrganizationChartManagerAgent {
	
	//OCM known agents
	private FunctionalManagerAgent1 fm1Agent = new FunctionalManagerAgent1();
	private FunctionalManagerAgent2 fm2Agent = new FunctionalManagerAgent2();
	
	//All services this agents offers
	private Map allServices = new HashMap<>();
	
	//The agent localized to execute the service to the query manager
	private String functionalManagerLocalized;
	
	public OrganizationChartManagerAgent() {
		this.allServices.put(fm1Agent.getService(), fm1Agent.getName());
		this.allServices.put(fm2Agent.getService(), fm2Agent.getName());
	}
	
	protected Boolean findFunctionalManager(String requestedService) {
		this.functionalManagerLocalized = (String) this.allServices.get(requestedService);
		if (this.functionalManagerLocalized != null) {
			System.out.println("The requested service can be executed by the " + this.functionalManagerLocalized + ".");
			return true;
		} else {
			System.out.println("The requested service has no functional manager that can do it.");
			return false;
		}
	}
	
	protected void ordenateServiceExecution() {
		if (this.functionalManagerLocalized == "Functional Manager 1") {
			this.fm1Agent.executeService();
		} else if (this.functionalManagerLocalized == "Functional Manager 2") {
			this.fm2Agent.executeService();
		}
	}

}
