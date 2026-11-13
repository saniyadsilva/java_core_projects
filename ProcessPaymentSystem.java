package core;

abstract class Payment {
	double amount;
	abstract void processPayment();
	public Payment(double amount){
		this.amount=amount;
	}
}
class CreditCardPayment extends Payment{
	String cardNumber="7854216895";
	String cardHolderName="Allen Nike";
	public CreditCardPayment(double amount) {
		super(amount);
	}
	void processPayment() {
		System.out.println("payment done by "+cardHolderName+" with cardNumber "+cardNumber+".Amount is "+amount);
	}
}
class UPIPayment extends Payment{
	String upiId="allennike@upi";
	public UPIPayment(double amount) {
		super(amount);
	}
	void processPayment() {
		System.out.println("payment done by upi id "+upiId+" with amount "+amount);
	}
}

class ProcessPaymentSystem{
	public static void main(String[] args) {
		Payment []payment=new Payment[2];
		payment[0]=new CreditCardPayment(5000);
		payment[1]=new UPIPayment(2500);
		for(int i=0;i<payment.length;i++) {
			payment[i].processPayment();
		}
	}
}
