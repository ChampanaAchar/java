class Factorial{

public static int toGetFact(int factNum){
System.out.println("Fact method Started ");
int fact =1;
for(int num=1;num<=factNum;num++){
fact =num*fact;
}


System.out.println("Fact method ended ");
return fact;
}
}