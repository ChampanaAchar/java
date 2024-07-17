class TextileShop{
 
 static String name="Shrusti Textile";
 static String owner="Champana";
 static String dressMaterials[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
 static double priceAdded[]={0.0,0.0,0.0,0.0,0.0,0.0};
 static int index1;
 static int index2;

public static boolean createMaterialName(String materialName){
System.out.println("create method started");
boolean ismaterialNameCreated=false;
if(materialName!=null){
            dressMaterials[index1]=materialName;
			index1++ ;
			ismaterialNameCreated=true;
}
else{
 System.out.println("Material name not found");
}
System.out.println("create method ended");
return ismaterialNameCreated;
}
public static void getMaterialName(){
//System.out.println("get method started");
for(String dressMaterial:dressMaterials){
System.out.println(dressMaterial);
//System.out.println("get method ended");
}

}
	public static boolean updateMaterial(String oldType,String newType){
		System.out.println("update started");
		boolean isUpdated=false;
		for(int i=0;i<dressMaterials.length;i++){
			if(oldType==dressMaterials[i]){
				dressMaterials[i]=newType;
				i++;
				isUpdated=true;
			}
				if(isUpdated==false){
					System.out.println(oldType + "not found"); 
				}
		}
		
		System.out.println("update ended");
		return isUpdated;
	}
	public static boolean addMaterialPrice(double price){
		System.out.println("addMaterialPrice started");
		boolean isPriceAdded=false;
		if(price>0.0){
			priceAdded[index2]=price;
			index2++;
			
			isPriceAdded=true;
			
		} else System.out.println("invalid");
		System.out.println("addMaterialPrice ended");
		
		return isPriceAdded;
	}
	public static void getMaterialPrice(){
		for(double priceAdd:priceAdded)
			System.out.println(priceAdd);
	}
}