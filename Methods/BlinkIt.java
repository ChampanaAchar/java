class BlinkIt{

public static double menuList(String delivery){
     double money=100;
	if(delivery=="Lays"){
        return 50.00;
   }
   if(delivery=="Oats"){
        return 670.00;
   }
   if(delivery=="Munchies"){
        return 50.00;
   }
   if(delivery=="Oil"){
        return 219.00;
   }
   if(delivery=="Detergent"){
        return 48.00;
   }
   if(delivery=="Pedigree"){
        return 710.00;
   }
   if(delivery=="Maggie"){
        return 80.00;
   }
    if(delivery=="Atta"){
        return 520.00;
   }
   if(delivery=="Sauces"){
        return 15.00;
   }
   if(delivery=="Cofsils"){
        return 50.00;
   }
   if(delivery=="Lemon Juice"){
        return 90.00;
   }
   if(delivery=="Himalaya Soap"){
        return 80.00;
   }
   if(delivery=="Dettol"){
        return 100.00;
   }
   if(delivery=="Shampoo"){
        return 20.00;
   }
   if(delivery=="Boost"){
        return 300.00;
   }else{
   System.out.println(delivery + "Not found");
   
   }
   return money;

}
public static double menuList(String delivery,int quantity){
     double money=100;
	if(delivery=="Lays"){
        money= 50.00*quantity;
		return money;
   }
   if(delivery=="Oats"){
        money=670.00*quantity;
		return money;
   }
   if(delivery=="Munchies"){
        money=50.00*quantity;
		return money;
   }
   if(delivery=="Oil"){
        money=219.00*quantity;
		return money;
   }
   if(delivery=="Detergent"){
        money=48.00*quantity;
		return money;
   }
   if(delivery=="Pedigree"){
        money=710.00*quantity;
		return money;
   }
     else{
   System.out.println(delivery + "Not found");
   
   }
   return money;

  }
}