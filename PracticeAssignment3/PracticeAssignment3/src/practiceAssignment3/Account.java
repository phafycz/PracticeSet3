package practiceAssignment3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Paul Hafycz
 * Practice Set 3
 */
public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate= 0;
	private Date dateCreated = new Date();
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
	}
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return this.dateCreated;
	}
	public  double getMontlyInterestRate()
	{
		return this.annualInterestRate/12;//divides it by 12 to make it months
		
	}
	public void withdraw(double money)  throws InsufficientFundsException
	{
		if(money <= balance)
		{
			balance -= money;//taking out money
		}
		else{
			double needs = money  - balance;
			throw new InsufficientFundsException(needs);//throws an exception if there aren't sufficient funds
		}
	}
	public void deposit(double money){
		balance += money;//putting in money
	}
}
	

