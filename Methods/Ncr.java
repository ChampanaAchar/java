class Ncr{
//	n!/(r!*(n-r))
public static void main(String[] facts){
int n=9;
int r=5;
int result=Factorial.toGetFact(n)/(Factorial.toGetFact(n-r)*Factorial.toGetFact(r));
System.out.println("Ncr="+result);
}
}