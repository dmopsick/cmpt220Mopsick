//9.7
public class TestAccount {

	public static void main(String[] args) {
		Account account1 = new Account(112, 20000, 4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println("Account 1's balance: " + account1.getBalance());
		System.out.println("Account 1's monthly interest: " + account1.getMonthlyInterest());
		System.out.println(account1.getDateCreated());
		
	}

}
