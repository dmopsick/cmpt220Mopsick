package lab8;

public class CheckingAccount extends Account {
	private int overdraftLimit = -200;
	
	/** Withdrawl with a overdraft limit */
	public void withdraw(int withdrawal){
		double newBalance = this.getBalance() - withdrawal;
		if(newBalance >= overdraftLimit){
			this.setBalance(newBalance);
		}
	}
}
