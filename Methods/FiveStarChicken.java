class FiveStarChicken{

public static double giveReceipt(String fooditems){
	double amount=100;
   if(fooditems=="Thai Crispy"){
        return 280.00;
   }
    if(fooditems=="chilli burst"){
        return 300.00;
   }   
   if(fooditems=="crunchy masala"){
        return 299.00;
   }
   if(fooditems=="Hot crispy burger"){
        return  320.00 ;
   }
   if(fooditems=="Tandoori burger"){
        return  120.00 ;
   }
   if(fooditems=="Biryani"){
        return  280.00 ;
   }
   if(fooditems=="Paneer rice"){
        return  300.00 ;
   }
   if(fooditems=="Chicken cheese burger "){
        return 390.00  ;
   }
   if(fooditems=="star burger"){
        return 150.00  ;
   }
   if(fooditems=="Tandoori roll"){
        return  200.00 ;
   }
   if(fooditems=="Sheek roll"){
        return 100.00  ;
   }
   if(fooditems=="Chicken roll"){
        return 300.00;
   }
   if(fooditems=="Appam"){
        return  75.0;
   }
   if(fooditems=="Chicken popcorn"){
        return  420.00;
   }
   if(fooditems=="Cheese shots"){
        return   50.00;
   }
   else{
   System.out.println(fooditems + "Not found");
   
   }
   return amount;
}
public static double giveReceipt(String fooditems,int quantity){
	double amount=100;
   if(fooditems=="Thai Crispy"){
        amount= 280.00*quantity;
		return amount;
   }
    if(fooditems=="chilli burst"){
        amount=300.00*quantity;
		return amount;
   }   
   if(fooditems=="crunchy masala"){
        amount=299.00*quantity;
		return amount;
   }
   if(fooditems=="Hot crispy burger"){
        amount=320.00*quantity ;
		return amount;
   }
   if(fooditems=="Tandoori burger"){
        amount=120.00*quantity ;
		return amount;
   }
   if(fooditems=="Biryani"){
        amount= 280.00*quantity ;
		return amount;
   }
   if(fooditems=="Paneer rice"){
        amount=300.00 *quantity;
		return amount;
   }
   if(fooditems=="Chicken cheese burger "){
        amount=390.00*quantity;
		return amount;
   }
   else{
   System.out.println(fooditems + "Not found");
   
   }
   return amount;
}
}