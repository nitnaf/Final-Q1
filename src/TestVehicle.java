import java.util.HashMap;


public class TestVehicle {

	public static void main(String[] args) {
		
		Person a = new Person();
		a.setPersonID();
		Car car = new Car();
		car.setOwner(a);
		car.setNumberOfDoors(4);
		
		Truck truck = new Truck();
		truck.setOwner(a);
		truck.setNumberOfAxels(2);
		
		Person b = new Person();
		b.setPersonID();
		truck.transferOwnership(b);

		Motorcycle motorcycle = new Motorcycle();
		motorcycle.setHasSideCar(false);

		// I don't understand what you mean when you say to use the generated UUID as the key for the HashMap
		// The only time UUID's are generated is in the Person class. 
		// The instance of Motorcycle belongs to no one, and therefore is not associated to a UUID..
		// What should I use as the key for the Motorcycle's HashMap
		
		// Additionally, I'm unsure what you want for the test classes. I'm a bit confused with the wording of the problem.
		
		HashMap mapA = new HashMap();
		mapA.put(a.getPersonID(), car);
		System.out.println(mapA.size());
		System.out.println(mapA.containsKey(a.getPersonID()));
		
		HashMap mapB = new HashMap();
		mapB.put(b.getPersonID(), truck);
		System.out.println(mapB.size());
		System.out.println(mapB.containsKey(b.getPersonID()));
		
		HashMap moto = new HashMap();
		moto.put(1, motorcycle);
		System.out.println(moto.size());

		
	}

}
