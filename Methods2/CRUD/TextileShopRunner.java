class TextileShopRunner{
  
  public static void main(String[]material){
  System.out.println("Main method started");
  boolean isAdded=TextileShop.createMaterialName("Silk saree");
  System.out.println(isAdded);
 // boolean price=TextileShop.addMaterialPrice(3000.00);
  //   System.out.println(price);

   isAdded=TextileShop.createMaterialName("Cotton material");
  System.out.println(isAdded);
  
   isAdded=TextileShop.createMaterialName("Nylon");
  System.out.println(isAdded);
  
   isAdded=TextileShop.createMaterialName("Fabric");
  System.out.println(isAdded);
  
  
   isAdded=TextileShop.createMaterialName("Twill");
  System.out.println(isAdded);
 
 
   isAdded=TextileShop.createMaterialName("Kurti");
  System.out.println(isAdded);
   
	isAdded=TextileShop.createMaterialName("Linen");
  System.out.println(isAdded);
  
  isAdded=TextileShop.createMaterialName("Satin");
  System.out.println(isAdded);
  
  isAdded=TextileShop.createMaterialName("Jersey");
  System.out.println(isAdded);
  
  isAdded=TextileShop.createMaterialName("Denim");
  System.out.println(isAdded);
  
  isAdded=TextileShop.createMaterialName("Velvet");
  System.out.println(isAdded);
  
  isAdded=TextileShop.createMaterialName("Acrylic");
  System.out.println(isAdded);
  
  isAdded=TextileShop.createMaterialName("Rayon");
  System.out.println(isAdded);
  
  isAdded=TextileShop.createMaterialName("Woolen");
  System.out.println(isAdded);
  
  isAdded=TextileShop.createMaterialName("Netted");
  System.out.println(isAdded);
 boolean isUpdate=TextileShop.updateMaterial("Kurti","Crepe");
 System.out.println(isUpdate);
 
  TextileShop.getMaterialName();
  //TextileShop.getMaterialPrice();
   System.out.println("Main method ended");
  }


}