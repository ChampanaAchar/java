class Amazon{
  static String name;
  static int passcode;
  static long number;
  static String mailID;
  static boolean customer;
  static String proof;
	public static double createAccount(String Name,int otp,long phoneNumber,String email,boolean isNewCustomer,String id){
	double loginTime=25.00;
	name=Name;
	passcode=otp;
	number=phoneNumber;
	mailID=email;
	customer=isNewCustomer;
	proof=id;
	return loginTime;
	
	}
	public static double getAccountDetails(){
		double newAccountNumber=3456356346476574533l;
	   System.out.println("Name of the User is:"+name);
	   System.out.println("Enter the Passcode:"+passcode);
	   System.out.println("Please enter your Phone number:"+number);
	   System.out.println("Enter your mailID :"+mailID);
	   System.out.println("Are you a new customer:"+customer);
	   System.out.println("Enter your Id proof type:"+proof);

	return newAccountNumber;
	
	}
}