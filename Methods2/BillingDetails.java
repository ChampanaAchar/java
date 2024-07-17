class BillingDetails{
 static String itemName;
 static int price;
 static int list;
 static String name;
 static String whatTime;
 static boolean isrequirement;
   public static int infoNeeded(String items,int amount ,int quantity,String Name,String time, boolean isBagRequired){
 int date=21;
 itemName=items;
 price=amount;
 list=quantity;
 name=Name;
 whatTime=time;
 isrequirement=isBagRequired;
 return date;
  }
 
  public static int getDetails(){
  int detailPrintAt=12;
  System.out.println("Your Items are:"+itemName);
  System.out.println("Total Price is:"+price);
  System.out.println("Quantity of items are:"+list);
  System.out.println("Name of the Shop:"+name);
  System.out.println("Time of billing:"+whatTime);
  System.out.println("Is paper bag required:"+isrequirement);
  return detailPrintAt;
  }
}