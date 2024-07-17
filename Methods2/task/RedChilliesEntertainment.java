class RedChilliesEntertainment {

	static String movieActors[] = {null, null, null, null, null, null, null, null, null,null};
	static int index ;

	public static boolean addMovieActors(String actorName){

		boolean isActorAdded = false;
		if(index<movieActors.length){
		if(actorName != null){
			movieActors[index] = actorName;
			index++;
			isActorAdded = true;
		}
		else {
			System.out.println("Invalid actor name Added");
		}
		}else{
			System.out.println("cannot add more");
		}
		
	return isActorAdded;
	}

	public static void getMovieActors(){
		System.out.println("The movie actors available are:");
		for(String actor : movieActors){
			if(actor != null){
				System.out.println(actor);
			}
		}
}
    public static boolean updateMovieActor(String oldMovieActor,String newMovieActor){
		System.out.println("Update method started");
		boolean isMovieActorUpdated=false;
		for(int index=0;index< movieActors.length;index++){
			if(oldMovieActor==movieActors[index]){
				movieActors[index]=newMovieActor;
				isMovieActorUpdated=true;
			}
		}
		if(isMovieActorUpdated=false){
			System.out.println(oldMovieActor +"not found");
		}
		
	    System.out.println("Update method ended");
		return isMovieActorUpdated;
	}
}
