
public abstract class Vehicle {
	private String name;
	private String color;
	private double weight;
	private Person owner;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String name, String color, Double weight, Person owner){
		this();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.owner = owner;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public void transferOwnership(Person newOwner){
		this.owner = newOwner;
	}

}
