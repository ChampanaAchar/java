class WatchShop{
 static String shopName="Quartz";
 static String watchBrandNames[]={null,null,null,null,null,null,null,null,null,null};
 static  int index;
 
	public static boolean addWatchBrandNames(String watchName){
		System.out.println("Add method started");
		boolean isItemAdded=false;
		if(watchName!=null){
		 watchBrandNames[index]=watchName;
		 index++;
		 isItemAdded=true;
		}else{
		System.out.println("Item cannot be added");
		}
		System.out.println("Add method ended");
		return isItemAdded;
	}
	
	public static void getAllWatchBrands(){
	System.out.println("Get method started");
	for(String watchBrandName:watchBrandNames)
	System.out.println(watchBrandName);
	System.out.println("Get method ended");
	
	}
	
	public static boolean updateWatchBrand(String oldBrand,String newBrand){
		System.out.println("Update method started");
		boolean isBrandUpdated=false;
		for(int index=0;index<watchBrandNames.length;index++){
			if(oldBrand==watchBrandNames[index]){
				watchBrandNames[index]=newBrand;
				index++;
				isBrandUpdated=true;
			}
		}
		if(isBrandUpdated==false)
			System.out.println(oldBrand +"not found");
		
		System.out.println("Update method ended");
		return isBrandUpdated;
	}
	
}