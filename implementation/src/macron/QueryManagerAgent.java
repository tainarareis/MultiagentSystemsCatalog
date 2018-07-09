package macron;

public class QueryManagerAgent {

	String requestedService;
	OrganizationChartManagerAgent ocmAgent = new OrganizationChartManagerAgent();
	
	//Verify if there is any functional manager that can offer the requested service
	protected Boolean findFunctionalManager(String requestedService) {
		return this.ocmAgent.findFunctionalManager(requestedService);
	}
	
	//Delegates ocmAgent to control the query execution
	protected void executeQuery() {
		this.ocmAgent.ordenateServiceExecution();
	}
}
