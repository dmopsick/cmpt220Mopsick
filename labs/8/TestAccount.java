public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account();
		SavingsAccount savingsAccount = new SavingsAccount();
		CheckingAccount checkingAccount = new CheckingAccount();
		
		System.out.println(account.toString());
		System.out.println(savingsAccount.toString());
		System.out.println(checkingAccount.toString());
	}

}
