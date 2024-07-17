class Passport{
	static String cpvLoc;
	static int dcdrLoc;
	static String givenNme;
	static String surNme;
	static String birthDate;
	static String emailId;
	static boolean isSameId;
	static String psswd;
	static String confmPsswd;
	static String qns;
	static String hintAn;
	static String code;
    public static boolean createPassport(String cpvLocation,int dcdrLocation,String givenName,String surName,String dob,String email,
                     boolean isemailLoginIdSame,String password,String confirmPassword,String question,String hintAns,String captcha){
						 boolean isPassportCreated=false;
				if(cpvLocation!=null && dcdrLocation > 0 && givenName!=null && surName!=null && dob!=null && email!= null && isemailLoginIdSame==true &&
                   password!=null && confirmPassword!=null && question!=null && hintAns!=null && captcha!=null){
					 
					cpvLoc= cpvLocation;
					 dcdrLoc=dcdrLocation;
					 givenNme=givenName;
					surNme= surName;
					 birthDate=dob;
					 emailId=email;
					 isSameId=isemailLoginIdSame;
					 psswd=password;
					 confmPsswd=confirmPassword;
					 qns=question;
					 hintAn=hintAns;
					 code=captcha;
					 isPassportCreated=true;
					 }
					 else{
						System.out.println(" Seems like some of the informations are INVALID!!please enter correct details");
					 }
					 return isPassportCreated;
			}
	public static void getPassportDetails(){
                     System.out.println("The CPV location is:"+cpvLoc);
					 System.out.println("The dcdrLocation is:" +dcdrLoc);
					 System.out.println("The given Name is :"+givenNme);
					 System.out.println("Sur Name is:" +surNme);
					 System.out.println("Date of Birth is: " +birthDate);
					 System.out.println("Email id entered is:"+emailId);
					 System.out.println("Is the loginId same:"+isSameId);
					 System.out.println("Enter the Password:"+psswd);
					 System.out.println("Confirm your password:"+confmPsswd);
					 System.out.println("The secret question is:"+qns);
					 System.out.println("Your Answer is :" +hintAn);
					 System.out.println("Enter the captcha:" +code);
					 

	}
}