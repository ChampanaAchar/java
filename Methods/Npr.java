class Npr{
	// n!/(n-r)!
	public static void main(String[] facts){
		int n=8;
		int r=3;	
		int result=Factorial.toGetFact(n)/Factorial.toGetFact(n-r);
		System.out.println("nPr="+result);
		
		
	}
}