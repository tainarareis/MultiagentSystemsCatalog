package master_slave;

public abstract class SlaveAgent {

	protected abstract void addPayment(float quantity, float amount);

	protected abstract float getTotalBalance();
	
}
