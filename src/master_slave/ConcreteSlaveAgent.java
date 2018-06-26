package master_slave;

public class ConcreteSlaveAgent extends SlaveAgent {

	private float totalBalance;
	
	protected void addPayment(float quantity, float amount) {
		float result = quantity * amount;
		this.totalBalance =+result;
	}

	protected float getTotalBalance() {
		return this.totalBalance;
	}

}
