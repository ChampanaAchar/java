class Gym{

	static String gymEquipments[] = {null, null, null, null, null, null, null, null};
	static int index = 0;

	public static boolean createGymEquipment(String equipmentName){

		boolean isEquipmentCreated = false;
		if(equipmentName != null){
			gymEquipments[index] = equipmentName;
			index++;
			isEquipmentCreated = true;
		}
		else {
			System.out.println("Invalid equipment name Added");
		}
	return isEquipmentCreated;
	}

	public static void getEquipments(){
		System.out.println("The gym equipments available are:");
		for(String equipment  :  gymEquipments){
			if(equipment != null) System.out.println(equipment);
		}
}
	public static boolean updateEquipments(String oldEquipment,String newEquipment){
		boolean isUpdated=false;
		for(int i=0;i<gymEquipments.length;i++){
			if(oldEquipment==gymEquipments[i]){
				gymEquipments[i]=newEquipment;
				i++;
				isUpdated=true;
			}
		}
		if(isUpdated==false){
			System.out.println(oldEquipment+"not found");
		}
		
		return isUpdated;
	}
}
