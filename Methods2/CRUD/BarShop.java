class BarShop{
	static String shopName="Shivu Bar and restaraunt";
	static String wineBrandNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addWineBrands(String brandName){
		System.out.println("Add method started");
		boolean isBrandAdded=false;
			if(brandName!=null){
				wineBrandNames[index]=brandName;
				index++ ;
				isBrandAdded=true;
		}
		else{
			System.out.println("Name cannot be added");
		}
		System.out.println("Add method ended");
		return isBrandAdded;
		
	}
	
	public static void getAllBrands(){
	 for(String WineBrand :wineBrandNames)
		System.out.println(WineBrand);
		
	}	
	public static boolean updateBrandNames(String oldBrand,String newBrand){
		boolean isBrandUpdated=false;
		for(int index=0;index<wineBrandNames.length;index++){
			if(oldBrand==wineBrandNames[index]){
				wineBrandNames[index]=newBrand;
				index++;
				isBrandUpdated=true;
			}
		}
		if(isBrandUpdated==false){
			System.out.println(oldBrand+"not found");
		}
		
		return isBrandUpdated;
	}
}