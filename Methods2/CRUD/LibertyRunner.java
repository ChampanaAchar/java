class LibertyRunner{
	
	public static void main(String[]name){
	
	boolean isAdded=Liberty.addShoeBrands("Adidas");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Bata");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Nike");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("PUMA");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Skechers");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Reebok");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Fila");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Woodland");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Crocs");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Vans");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("New Balance");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Deckers");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Bally shoes");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("Red Tape");
	System.out.println(isAdded);
	
	isAdded=Liberty.addShoeBrands("sneaker");
	System.out.println(isAdded);
	
	boolean isUpdate=Liberty.updateBrandName("Bally shoes","Clarks");
	System.out.println(isUpdate);
	Liberty.getAllBrands();
	}
}