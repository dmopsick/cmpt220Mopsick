public class SavingsAccount extends Account {
	public void withdraw(int withdrawal){
		double newBalance = this.getBalance() - withdrawal;
		if(newBalance >= 0){
			this.setBalance(newBalance);
		}
	}
}
