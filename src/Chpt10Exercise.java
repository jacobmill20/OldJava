public class Chpt10Exercise {
	public static void main(String[] args) {

		Trip trip1 = new Trip("Mekong Delta");
		Trip trip2 = new Trip("Ha Long Bay");

		trip1.addTraveller("Steve");
		trip1.addTraveller("Larry");
		trip1.addTraveller("Bob");

		trip2.addTraveller("John");
		trip2.addTraveller("Steve");

		System.out.println("The first trip to " + trip1.getTripName() + " contains " + trip1.getNumberOfTravellers() + " passengers:");
		String[] travellers = trip1.getTravellers();
		for(int i = 0; i < trip1.getNumberOfTravellers(); i++){
			System.out.print(travellers[i] + " ");
		}
		System.out.println();

		System.out.println("The second trip to " + trip2.getTripName() + " contains " + trip2.getNumberOfTravellers() + " passengers:");
		travellers = trip2.getTravellers();
		for(int i = 0; i < trip2.getNumberOfTravellers(); i++){
		System.out.print(travellers[i] + " ");
		}
		System.out.println();

		Trip trip3 = new Trip("London");

		trip3.addTraveller("Mom");
		trip3.addTraveller("Lizzy");
		trip3.addTraveller("Donna");
		trip3.addTraveller("Zach");
		trip3.addTraveller("Me");

		System.out.println("The third trip to " + trip3.getTripName() + " contains " + trip3.getNumberOfTravellers() + " passengers:");
		travellers = trip3.getTravellers();
		for(int i = 0; i < trip3.getNumberOfTravellers(); i++){
		System.out.print(travellers[i] + " ");
		}
		System.out.println();

	}
}
class Trip{
	private String tripName;
	private int numberOfTravellers;
	private String[] travellers = new String[15];

	public Trip(String tripName){
		this.tripName = tripName;
	}

	public void addTraveller(String name){
		travellers[numberOfTravellers] = name;
		numberOfTravellers++;
	}

	public String getTripName(){
		return tripName;
	}

	public String[] getTravellers(){
		return travellers;
	}

	public int getNumberOfTravellers(){
		return numberOfTravellers;
	}
}