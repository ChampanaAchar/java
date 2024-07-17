class JoyAlukasRunner{

    public static void main(String[]jewel){
	
	boolean isaddedItem= JoyAlukas.addGoldItem("Rings");
	System.out.println(isaddedItem);
	
	 isaddedItem=JoyAlukas.addGoldItem("Necklaces");
	System.out.println(isaddedItem);
	
	isaddedItem=JoyAlukas.addGoldItem("EarRings");
	System.out.println(isaddedItem);
	
	isaddedItem=JoyAlukas.addGoldItem("Pendants");
	System.out.println(isaddedItem);
	
	isaddedItem=JoyAlukas.addGoldItem("Bracelets");
	System.out.println(isaddedItem);
	
	isaddedItem=JoyAlukas.addGoldItem("Cuffinks");
	System.out.println(isaddedItem);
	
	isaddedItem=JoyAlukas.addGoldItem("NosePins");
	System.out.println(isaddedItem);
	
	
	boolean isadded= JoyAlukas.updateGoldItem("Rings","chain");
	System.out.println(isadded);
	JoyAlukas.getAllGoldItems();
	
	}
}