class BankAccount{
static double balance ;

public static void credit(double amount){
	System.out.println("credit operation started");
	if(amount<=balance){
	balance = balance + amount;
	}
	else{
		System.out.println("Insufficient funds!!!");
	}
	System.out.println("credit operation ended");
}

public static void debit(double amount){
	System.out.println("debit operation started");
	if(amount>0){
	balance = balance - amount;
	}
else{
	System.out.println("Amount can't be debited");
}
	System.out.println("debit operation ended");
	
}
public static double getBalance(){
	System.out.println("the current balance is :"+balance);
	return balance;
}

}