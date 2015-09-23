package practiceAssignment3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/*
 * Paul Hafycz
 */
import java.util.Date;
public class Test extends Exception
{
	public static void main(String [] args) throws InsufficientFundsException
	{
		Account testAccount = new Account(1122,20000);
		testAccount.withdraw(2500);//Withdraws from this account
		testAccount.deposit(3000);//Deposits from this account
		testAccount.setAnnualInterestRate(.045);//sets interest rate
		System.out.println("The balance is " + testAccount.getBalance() + " and the monthly interest is "+ testAccount.getMontlyInterestRate());
		System.out.println("Todays Date is: " + testAccount.getDateCreated());
		//testAccount.withdraw(30000);
	}
}
