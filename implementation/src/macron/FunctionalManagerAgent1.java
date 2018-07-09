package macron;

public class FunctionalManagerAgent1 extends FunctionalManagerAgent {

	public FunctionalManagerAgent1() {
		this.name = "Functional Manager 1";
		this.service = "Get Online Reviews";				
	}
	
	protected void executeService() {
		System.out.println("Functional Manager 1: Contacting functional unit to execute service...");
		this.alocateResources();
		this.getOnlineReviews();
		System.out.println("Service finished.");
	}
	
	protected void alocateResources() {
		//Strategy of resources alocation here
	}

	protected void getOnlineReviews() {
		System.out.println("\t Access < Tidbits > < Use Wais | Use FTP >");
		System.out.println("\t Access < InfoMac >");
		System.out.println("\t Get From < Seller >");
		System.out.println("\t Access < News >");
	}
	
}
