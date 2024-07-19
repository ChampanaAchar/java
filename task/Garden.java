class Garden{
	String name;
	String place;
	
		public boolean createGarden(String name,String place){
			boolean isGardenCreated=false;
			if(name != null &&  place != null){
			
			this.name=name;
			this.place=place;
			isGardenCreated=true;
			} else {
				System.out.println("Enter valid details");
			}
			
			return isGardenCreated;
		}
		
		public void getGardenDetails(){
			System.out.println("Garden Name is:" +name);
			System.out.println("You can visit in:" +place);
		}
}