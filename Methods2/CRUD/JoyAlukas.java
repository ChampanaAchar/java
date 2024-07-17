class JoyAlukas{
static String owner="Champana";
static String itemNames[]={null,null,null,null,null,null,null};
static int index;
	public static boolean addGoldItem(String goldName){
	System.out.println("Add method started");
	boolean isItemAdded=false;
	    if(index<itemNames.length){
		if(goldName!=null){
		itemNames[index]=goldName;
		index++ ;
		isItemAdded=true;

	}
	else{
     System.out.println("Item not founded");
}
		}
		else{
			System.out.println("cannot add more");
		}

	System.out.println("Add method ended");
    return isItemAdded;
}

    public static void getAllGoldItems(){
	    for(String itemName:itemNames){
		System.out.println(itemName);
		}
	}
	public static boolean updateGoldItem(String oldItem,String newItem){
		boolean isItemUpdated=false;
		for(int index=0;index<itemNames.length;index++) {
			
		if(oldItem == itemNames[index]){
			itemNames[index]=newItem;
			isItemUpdated=true;
		}
		
		}
		
		if(isItemUpdated == false)
			System.out.println(oldItem + "not found");
		
	 System.out.println(oldItem + " is replaced with " +newItem);
		
		return isItemUpdated;
		
	}
	
}