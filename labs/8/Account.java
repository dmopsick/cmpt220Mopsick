package lab8;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	/** Default constructor */
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	/** Constructor with specified values */
	public Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
	}
	
	/** Withdraw money from the account */
	public void withdraw(int withdrawal){
		this.balance = balance - withdrawal;
	}
	
	/** Deposits money in his account */
	public void deposit(int deposit){
		this.balance = balance + deposit;
	}
	
	/** Returns the id of the account */
	public int getId(){
		return id;
	}
	
	/** Returns the balance of the account */
	public double getBalance(){
		return balance;
	}
	
	/** Returns the annual interest rate of the account */
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	/** Returns the monthly interest rate of the account */
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	/** Returns the monthly interest of the account */
	public double getMonthlyInterest(){
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	/** Returns the date the account  was created */
	public Date getDateCreated(){
		return dateCreated;
	}
	
	/** Sets the id of the account */
	public void setId(int id){
		this.id = id;
	}
	
	/** Sets the balance of the account */
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	/** Sets the annual interest rate of the account */
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
}
