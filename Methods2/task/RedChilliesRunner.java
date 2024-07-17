class RedChilliesRunner {

	public static void main(String[] entratainment) {
		
		boolean isActorAdded = RedChilliesEntertainment.addMovieActors("Prajwal Devraj");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Devendra Singh ");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Kiran");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Yash");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Ramesh");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Upendra");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Shiv raj kumar");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Prabas");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Mahesh babu");
		System.out.println("Actor added: " + isActorAdded);
		
		isActorAdded = RedChilliesEntertainment.addMovieActors("Champana");
		System.out.println("Actor added: " + isActorAdded);
		
		//isActorAdded = RedChilliesEntertainment.addMovieActors("Dev ");
		//System.out.println("Actor added: " + isActorAdded);
		
		boolean isActorName=RedChilliesEntertainment.updateMovieActor("Champana","Salman Khan");
		System.out.println(isActorName);

		RedChilliesEntertainment.getMovieActors();
	}
}
