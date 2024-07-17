class Swiggy{

public static double takeOrder(String fooditems){
	double cost=100;
   if(fooditems=="Pizza"){
        return 149.00;
   }
    if(fooditems=="Burger"){
        return 250.00;
   }   
   if(fooditems=="Gobi"){
        return 45.00;
   }
   if(fooditems=="Sandwich"){
        return  50.00 ;
   }
   if(fooditems=="Puffs"){
        return  55.00 ;
   }
   if(fooditems=="Fries"){
        return  70.00 ;
   }
   if(fooditems=="Milk Shake"){
        return  80.00 ;
   }
   if(fooditems=="Nuggets"){
        return 90.00  ;
   }
   if(fooditems=="Cake"){
        return 60.00  ;
   }
   if(fooditems=="Lassi"){
        return  120.00 ;
   }
   if(fooditems=="Strawbery Punch"){
        return 200.00  ;
   }
   if(fooditems=="Veg roll"){
        return 100.00;
   }
   if(fooditems=="Momos"){
        return  75.0;
   }
   if(fooditems=="Potato Chips"){
        return  30.00;
   }
   if(fooditems=="Samosa"){
        return   99.00;
   }
   else{
   System.out.println(fooditems + "Not found");
   
   }
   return cost;
}
public static double takeOrder(String fooditems,int quantity){
	double cost=100;
   if(fooditems=="Pizza"){
        cost= 149.00*quantity;
		return cost;
   }
    if(fooditems=="Burger"){
        cost=250.00*quantity;
		return cost;
   }   
   if(fooditems=="Gobi"){
        cost=45.00*quantity;
		return cost;
   }
   if(fooditems=="Sandwich"){
        cost=50.00*quantity ;
		return cost;
   }
   if(fooditems=="Puffs"){
        cost=55.00*quantity ;
		return cost;
   }
   if(fooditems=="Fries"){
        cost=70.00*quantity ;
		return cost;
   }
   else{
   System.out.println(fooditems + "Not found");
   
   }
   return cost;
}
}