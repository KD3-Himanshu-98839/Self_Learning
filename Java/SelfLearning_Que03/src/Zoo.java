
public class Zoo {
	
	private int zooId;
	private String zooName;
	private Zookeeper zookeeper;
	private Animal animal;
	
	//Default Constructor with ZooKeeper and Animal
	public Zoo() {
		zooId = 0;
		zooName = "";
		zookeeper = new Zookeeper("");
		animal = new Animal("");
	}

	//Parameterized Constructor without ZooKeeper and Animal
	public Zoo(int zooId, String zooName) {
		super();
		this.zooId = zooId;
		this.zooName = zooName;
		this.zookeeper = new Zookeeper("Rahul");
		this.animal = new Animal("Gorilla");
	}

	//Default Constructor with ZooKeeper and Animal object
	public Zoo(int zooId, String zooName, Zookeeper zookeeper, Animal animal) {
		this.zooId = zooId;
		this.zooName = zooName;
		this.zookeeper = zookeeper;
		this.animal = animal;
	}
	

	public void displayDetails() {
		System.out.println("Zoo Id is: "+zooId);
		System.out.println("Zoo Name is: "+zooName);
		animal.display();
		zookeeper.task();
		
	}

}
