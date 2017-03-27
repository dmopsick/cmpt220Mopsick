public class CheckingAccount extends Account {
	public static final int OVERDRAFT_LIMIT = -200;
	
	/** Withdrawal with a overdraft limit */
	public void withdraw(int withdrawal){
		double newBalance = this.getBalance() - withdrawal;
		if(newBalance >= OVERDRAFT_LIMIT){
			this.setBalance(newBalance);
		}
	}
}
