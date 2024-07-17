class TextileShopRunner{
  
  public static void main(String[]material){
  System.out.println("Main method started");
  boolean isAdded=TextileShop.createMaterialName("Silk saree");
  System.out.println(isAdded);
  boolean price=TextileShop.addMaterialPrice(3000.00);
     System.out.println(price);

 
  
   isAdded=TextileShop.createMaterialName("Cotton material");
  System.out.println(isAdded);
  price=TextileShop.addMaterialPrice(2500);
      System.out.println(price);

    
   isAdded=TextileShop.createMaterialName("Nylon");
  System.out.println(isAdded);
  price=TextileShop.addMaterialPrice(1000);
    System.out.println(price);

  
   isAdded=TextileShop.createMaterialName("Fabric");
  System.out.println(isAdded);
  price=TextileShop.addMaterialPrice(3410);
      System.out.println(price);

  
  
   isAdded=TextileShop.createMaterialName("Shirts");
  System.out.println(isAdded);
 price=TextileShop.addMaterialPrice(3000);
     System.out.println(price);

  
  
   isAdded=TextileShop.createMaterialName("Kurti");
  System.out.println(isAdded);
   price=TextileShop.addMaterialPrice(1350);
       System.out.println(price);

  
  
  System.out.println("Main method ended");
  TextileShop.getMaterialName();
  TextileShop.getMaterialPrice();
  }


}