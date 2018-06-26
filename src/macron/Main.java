package macron;

public class Main {

	public static void main(String[] args) {	
		QueryManagerAgent queryManager = new QueryManagerAgent();
		Boolean isServiceAvailable;
		
		//QueryManager wants to retrieve all published reviews about some product,
		isServiceAvailable = queryManager.findFunctionalManager("Get Online Reviews");

		//The query can only occur if there is an agent that can execute it.
		if (isServiceAvailable == true) {
			queryManager.executeQuery();
		} 
	}
}
