package project;


abstract class BankAccount{
	String accountNumber="KA5426845";
	double balance=8000;
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount{
	int count=0;
	public void deposit(double a) {
		balance=balance+a;
		System.out.println("deposited amount: "+a);
		System.out.println("total balance"+balance);
	}
	public void withdraw(double a) {
		if(count<5 && a>0 && a<=balance) {
			balance=balance-a;
			count++;
			System.out.println("amount withdrawn: "+a);
			System.out.println("total amount: "+balance);
			System.out.println("number of limit left: "+(5-count));
		}else if(count>=5 ) {
			System.out.println("monthly withdrawal limit exceeded.");
		}else {
			System.out.println("invalid amount");
		}
	}
}
class CurrentAccount extends BankAccount{
	double draftLimit=5000;

	@Override
	public void deposit(double a) {
		balance=balance+a;
		System.out.println("deposit amount: "+a);
		System.out.println("total amount "+balance);
	}

	@Override
	public void withdraw(double a) {
		if(a>0 && a<=(balance+draftLimit)) {
			balance=balance-a;
			System.out.println("withdrawn amount: "+a);
			System.out.println("total amount "+balance);
		}
		else {
			System.out.println("invalid");
		}
	}
	
}
public class BankingSystem {

	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount();
//		s.deposit(1000);
//		s.withdraw(200);
//		s.withdraw(200);
//		s.withdraw(200);
//		s.withdraw(200);
//		s.withdraw(200);
		CurrentAccount s1=new CurrentAccount();
		s1.withdraw(13000);
	}

}
