class JoyAlukas{
static String owner="Champana";
static String itemNames[]={null,null,null,null,null,null,null};
static int index;
	public static boolean addGoldItem(String goldName){
	System.out.println("Add method started");
	boolean isItemAdded=false;
		if(goldName!=null){
		itemNames[index]=goldName;
		index++ ;
		isItemAdded=true;

	}
	else{
     System.out.println("Item not founded");
}

	System.out.println("Add method ended");
    return isItemAdded;
}

    public static void getAllGoldItems(){
	    for(String itemName:itemNames){
		System.out.println(itemName);
		}
	}
	
}