class Liberty{
static String shopName="Champions shop";
static String shoeBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
	public static boolean addShoeBrands(String brandName){
		System.out.println("Add method started");
		boolean isShoeBrandAdded=false;
		if(brandName!=null){
		shoeBrands[index]=brandName;
		index++;
		isShoeBrandAdded=true;
	}else{
		System.out.println("Item cannot be added");
		
		}
		System.out.println("Add method ended");
	return isShoeBrandAdded;
	}
	
	public static void getAllBrands(){
		for(String BrandName:shoeBrands)
		System.out.println(BrandName);
	}
	public static boolean updateBrandName(String oldName,String newName){
		boolean isNameUpdated=false;
		for(int i=0;i<shoeBrands.length;i++){
			if(oldName==shoeBrands[i])
			shoeBrands[i]=newName;
			i++ ;
			isNameUpdated=true;
			}
		if(isNameUpdated==false)
			System.out.println(oldName +"not found");
		return isNameUpdated;
	}
	
}