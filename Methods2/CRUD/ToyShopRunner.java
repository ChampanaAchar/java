class ToyShopRunner{
	public static void main(String[] add){
	
	boolean isAdded=ToyShop.addToyNames("Cycle");
	System.out.println(isAdded);
	
	isAdded=ToyShop.addToyNames("Ship");
	System.out.println(isAdded);
	
	isAdded=ToyShop.addToyNames("Boat");
	System.out.println(isAdded);
	
	isAdded=ToyShop.addToyNames("Slate");
	System.out.println(isAdded);
	
	isAdded=ToyShop.addToyNames("Bike");
	System.out.println(isAdded);
	
	isAdded=ToyShop.addToyNames("Jeep");
	System.out.println(isAdded);
	
	isAdded=ToyShop.addToyNames("Scatter");
	System.out.println(isAdded);
	
	isAdded=ToyShop.addToyNames("Slider");
	System.out.println(isAdded);
	
	isAdded=ToyShop.addToyNames("Skipping rope");
	System.out.println(isAdded);
	
	isAdded=ToyShop.addToyNames("Skipping rope");
	System.out.println(isAdded);
	
	boolean isUpdate=ToyShop.updateToy("Slider","Doll");
	System.out.println(isUpdate);
	
	
	ToyShop.getToyNames();
	}
}