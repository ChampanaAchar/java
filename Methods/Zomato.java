class Zomato{

public static double giveReceipt(String fooditems){
	double bill=0.0;
   if(fooditems=="Dosa"){
        return 150.00;
   }
    if(fooditems=="Pudi Idly"){
        return 260.00;
   }   
   if(fooditems=="Bisi Bele Bath"){
        return 90.00;
   }
   if(fooditems=="puri"){
        return  150.00 ;
   }
   if(fooditems=="Upma"){
        return  120.00 ;
   }
   if(fooditems=="Biryani"){
        return  280.00 ;
   }
   if(fooditems=="Paneer Rice"){
        return  300.00 ;
   }
   if(fooditems=="Palav"){
        return 90.00  ;
   }
   if(fooditems=="Mushroom Rice"){
        return 160.00  ;
   }
   if(fooditems=="Paddu"){
        return  100.00 ;
   }
   if(fooditems=="Vegetable Salad"){
        return 100.00  ;
   }
   if(fooditems=="Thali"){
        return 300.00;
   }
   if(fooditems=="Appam"){
        return  75.0;
   }
   if(fooditems=="Carrot65"){
        return  120.00;
   }
   if(fooditems=="Chapathi"){
        return   50.00;
   }
   else{
   System.out.println(fooditems + "Not found");
   
   }
   return bill;
}
public static double giveReceipt(String fooditems,int quantity){
	double bill=0.0;
   if(fooditems=="Dosa"){
        bill= 150.00*quantity;
		return bill;
   }
    if(fooditems=="Pudi Idly"){
        bill= 260.00*quantity;
		return bill;
   }   
   if(fooditems=="Bisi Bele Bath"){
        bill= 90.00 *quantity;
		return bill;
   }
   if(fooditems=="puri"){
        bill=  150.00*quantity ;
		return bill;
   }
   if(fooditems=="Upma"){
        bill= 120.00 *quantity;
		return bill;
   }
   if(fooditems=="Biryani"){
        bill=  280.00 *quantity;
		return bill;
   }
   if(fooditems=="Paneer Rice"){
        bill= 300.00*quantity ;
		return bill;
   }
   else{
   System.out.println(fooditems + "Not found");
   
   }
   return bill;
}
}