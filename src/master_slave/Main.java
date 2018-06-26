package master_slave;

public class Main {
	
	public static void main(String[] args) {
		//Read the csv file with the Cash Register
		ConcreteCashFlowAgent cashFlowAgent = new ConcreteCashFlowAgent();
		cashFlowAgent.readCSV();
		
		//Get total balance of payments
		cashFlowAgent.getResult();
	}

}
