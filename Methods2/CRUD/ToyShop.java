class ToyShop{
	static String shopName="Champ shop";
	static String toyNames[]={null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addToyNames(String name){
		System.out.println("Add method started");
		boolean isNameAdded=false;
			if(name!=null){
			toyNames[index]=name;
			index++;
			isNameAdded=true;
		}
	else{
		System.out.println("Invalid name!!");
	}
		System.out.println("Add method ended");
		return isNameAdded;
	}
	
	public static void getToyNames(){
		for(String Toys:toyNames)
		System.out.println(Toys);
	}
	
	public static boolean updateToy(String oldToy,String newToy){
		System.out.println("Add method started");
		boolean isUpdated=false;
		for(int i=0;i<toyNames.length;i++){
		if(oldToy==toyNames[i])
		toyNames[i]=newToy;
		i++;
		isUpdated=true;
		}
		if(isUpdated==false){
			System.out.println(oldToy +"not found");
		}
		
		
		System.out.println("Add method ended");
		return isUpdated;
		
	}
	
	 public static int findToy(String name) {
        System.out.println("Find method started");
        for (int i = 0; i < toyNames.length; i++) {
            if (oldToy==toyNames[i]) {
				toyNames[i]=newToy;
				i++;
                System.out.println(name +"already found");
                break;
            }
        }
        System.out.println("Find method ended");
        
    }
}