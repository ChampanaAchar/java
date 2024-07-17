class WatchShopRunner{

	public static void main(String [] watchName){
		boolean NameIs=WatchShop.addWatchBrandNames("Fastrack");
		System.out.println(NameIs);
		
		 NameIs=WatchShop.addWatchBrandNames("Fossil");
		System.out.println(NameIs);
		
		 NameIs=WatchShop.addWatchBrandNames("Boat");
		System.out.println(NameIs);
		
		 NameIs=WatchShop.addWatchBrandNames("Boult");
		System.out.println(NameIs);
		
		 NameIs=WatchShop.addWatchBrandNames("Titan");
		System.out.println(NameIs);
		
		 NameIs=WatchShop.addWatchBrandNames("Ajanta");
		System.out.println(NameIs);
		
		 NameIs=WatchShop.addWatchBrandNames("Fire bolt");
		System.out.println(NameIs);
		
		 NameIs=WatchShop.addWatchBrandNames("Rolex");
		System.out.println(NameIs);
		
		 NameIs=WatchShop.addWatchBrandNames("Casio");
		System.out.println(NameIs);
		
		NameIs=WatchShop.addWatchBrandNames("Blancpain");
		System.out.println(NameIs);
		
		
		boolean updateName=WatchShop.updateWatchBrand("Casio","Quartz");
		System.out.println(updateName);
		WatchShop.getAllWatchBrands();
	}
}