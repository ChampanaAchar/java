class GymRunner {

	public static void main(String[] equipment) {
		
		boolean isEquipmentAdded = Gym.createGymEquipment("Treadmill");
		System.out.println("Equipment added: " + isEquipmentAdded);

		isEquipmentAdded = Gym.createGymEquipment("Dumbbells");
		System.out.println("Equipment added: " + isEquipmentAdded);

		isEquipmentAdded = Gym.createGymEquipment("Stationary Bike");
		System.out.println("Equipment added: " + isEquipmentAdded);

		isEquipmentAdded = Gym.createGymEquipment("Rowing Machine");
		System.out.println("Equipment added: " + isEquipmentAdded);

		isEquipmentAdded = Gym.createGymEquipment("Bench Press");
		System.out.println("Equipment added: " + isEquipmentAdded);

		isEquipmentAdded = Gym.createGymEquipment("Leg Press");
		System.out.println("Equipment added: " + isEquipmentAdded);

		isEquipmentAdded = Gym.createGymEquipment("Elliptical");
		System.out.println("Equipment added: " + isEquipmentAdded);

		isEquipmentAdded = Gym.createGymEquipment("Pullup Bar");
		System.out.println("Equipment added: " + isEquipmentAdded);
		
		boolean isUpdate=Gym.updateEquipments("Pullup Bar","cycling");
		System.out.println(isUpdate);
		Gym.getEquipments();
	}
}
