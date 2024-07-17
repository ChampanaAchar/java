class BarShopRunner{
    
	public static void main(String[]name){
	
	boolean brandIs=BarShop.addWineBrands("Black Grenache");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("KingFisher");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Wiskey");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Margarita");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Espresso");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Vodka");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Rum");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Tequila");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Rum");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Old Fashioned");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Old Monk");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Beer");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Brandy");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Red Bull");
	System.out.println("brandIs");
	
	brandIs=BarShop.addWineBrands("Bacardi");
	System.out.println("brandIs");
	
	boolean isUpdate=BarShop.updateBrandNames("Old Fashioned","Corona");
	System.out.println(isUpdate);
	BarShop.getAllBrands();
	
	
	}
}