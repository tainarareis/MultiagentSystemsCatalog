package macron;

public class FunctionalManagerAgent2 extends FunctionalManagerAgent {

	public FunctionalManagerAgent2() {
		this.name = "Functional Manager 2";
		this.service = "Get Published Reviews";				
	}

	protected void executeService() {
		System.out.println("Functional Manager 2: Contacting functional units to execute service...");
		System.out.println("Functional Units Started...");
		this.alocateResources();
		this.getOnlineReviews();
		System.out.println("Service finished.");
	}
	
	protected void alocateResources() {
		//Strategy of resources alocation here
	}
	
	private void getOnlineReviews() {
		System.out.println("\t Locate < Get From Seller | Get From Tidbits | Get From Library >");
		System.out.println("\t Retrieve < from Library | from Online Sources | via Fax >");
	}

}
