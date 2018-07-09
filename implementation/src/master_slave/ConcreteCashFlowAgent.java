package master_slave;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteCashFlowAgent implements MasterAgent{

	ConcreteSlaveAgent slave = new ConcreteSlaveAgent();
	
	public void readCSV() {
    	//Inform file Path
        String csvFile = "/home/tainara/eclipse-workspace/MultiagentSystemsCatalog/src/master_slave/cash_register.csv";
        
        //Each new line is recognized by empty string
        String line = "";
        
        //Comma is used as separator
        String cvsSplitByComma = ","; 

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                
                String[] field = line.split(cvsSplitByComma);
                slave.addPayment(Float.parseFloat(field[1]), 
                					Float.parseFloat(field[2]));
                
                System.out.println("Payment [Item= " + field[0] + 
					" , Quantity= " + field[1] + 
					" , Amount=" + field[2] + "]");
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
        
   public void getResult() {
	   float total = slave.getTotalBalance();	
	   System.out.println("The total balance of payments was $" + total);
   }

}
