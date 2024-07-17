class Zepto{

public static double giveList(String item){
	double price=0.0;
   if(item =="Fruits"){
        return 150.00;
   }
    if(item =="Vegetables"){
        return 100.00;
   }   
   if(item =="Dry Fruits"){
        return 300.00;
   }
   if(item =="Perfume"){
        return  250.00;
   }
   if(item =="Rice"){
        return  500.00;
   }
   if(item =="Flowers"){
        return  50.00;
   }
   if(item =="Sweets"){
        return  160.00;
   }
   if(item =="Chips"){
        return 90.00;
   }
   if(item =="Makeup"){
        return 400.00;
   }
   if(item =="Biscuits"){
        return  100.00;
   }
   if(item =="Skin Care"){
        return 600.00;
   }
   if(item =="Chole"){
        return 100.00;
   }
   if(item =="Salsa"){
        return  75.0;
   }
   if(item =="Curd"){
        return  45.00;
   }
   if(item =="Sugar"){
        return   48.00;
   }
   else{
   System.out.println(item + "Not found");
   
   }
   return price;
}
public static double giveList(String item,int quantity){
	double price=0.0;
   if(item =="Fruits"){
        price= 150.00*quantity;
		return price;
   }
    if(item =="Vegetables"){
        price= 100.00*quantity;
		return price;
   }   
   if(item =="Dry Fruits"){
        price= 300.00*quantity;
		return price;
   }
   if(item =="Perfume"){
        price=250.00*quantity;
		return price;
   }
   if(item =="Rice"){
        price=500.00*quantity;
		return price;
   }
   if(item =="Flowers"){
        price=50.00*quantity;
		return price;
   }
   if(item =="Sweets"){
        price= 160.00*quantity;
		return price;
   }
   if(item =="Chips"){
        price=90.00*quantity;
		return price;
   }
   if(item =="Makeup"){
        price=400.00*quantity;
		return price;
   }
    else{
   System.out.println(item + "Not found");
   
   }
   return price;
}
}